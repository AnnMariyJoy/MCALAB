from flask import Flask, render_template, request
import numpy as np
import tensorflow as tf
import cv2
import os
from werkzeug.utils import secure_filename

# Initialize Flask app
app = Flask(__name__)

# Load trained model
model = tf.keras.models.load_model("braintumor.h5")

# Define class labels
labels = ['glioma_tumor','meningioma_tumor','no_tumor','pituitary_tumor']

# Ensure upload folder exists
UPLOAD_FOLDER = "static/uploads"
if not os.path.exists(UPLOAD_FOLDER):
    os.makedirs(UPLOAD_FOLDER)

app.config["UPLOAD_FOLDER"] = UPLOAD_FOLDER

# Function to preprocess image
def preprocess_image(image_path):
    img=cv2.imread(image_path)
    img=cv2.resize(img,(150,150))
    img_array=np.array(img)
    img_array=img_array.reshape(1,150,150,3)
    return img_array

# Home Route
@app.route("/", methods=["GET", "POST"])
def index():
    if request.method == "POST":
        file = request.files["file"]
        if file:
            filename = secure_filename(file.filename)
            file_path = os.path.join(app.config["UPLOAD_FOLDER"], filename)
            file.save(file_path)

            # Preprocess image
            processed_img = preprocess_image(file_path)

            # Make prediction
            prediction = model.predict(processed_img)
            predicted_class = np.argmax(prediction)
            confidence = np.max(prediction) * 100

            return render_template("result.html", file_path=file_path, label=labels[predicted_class], confidence=confidence)

    return render_template("index.html")

# Run the app
if __name__ == "__main__":
    app.run(debug=True)
