from flask import Flask, request, jsonify, render_template
import pandas as pd
import numpy as np
from sklearn.ensemble import RandomForestClassifier
from sklearn.preprocessing import StandardScaler
import joblib

app = Flask(__name__)

# Load the trained model and scaler
model = joblib.load('heart_attack_prediction_model.pkl')  # Assuming the model is saved as a .pkl file
scaler = joblib.load('scaler.pkl')  # Load the scaler

@app.route('/')
def home():
    return render_template('index.html')  # HTML page for user interaction

@app.route('/predict', methods=['POST'])
def predict():
    data = request.form.to_dict()
    print("Received data:", data)  # Debugging line

    # Check if all expected keys are present
    expected_keys = ['Age', 'Sex', 'Cholesterol', 'Systolic', 'Diastolic', 'HeartRate', 
                     'Diabetes', 'FamilyHistory', 'Smoking', 'Obesity', 
                     'AlcoholConsumption', 'ExerciseHoursPerWeek', 'Diet', 
                     'PreviousHeartProblems', 'StressLevel', 'BMI', 
                     'PhysicalActivityDaysPerWeek', 'SleepHoursPerDay']
    
    missing_keys = [key for key in expected_keys if key not in data]
    if missing_keys:
        return jsonify({"error": "Missing data", "missing_keys": missing_keys}), 400

    # Convert the form data into a list of values
    new_patient_data = [
        int(data['Age']),
        int(data['Sex']),
        float(data['Cholesterol']),
        int(data['Systolic']),
        int(data['Diastolic']),
        int(data['HeartRate']),
        int(data['Diabetes']),
        int(data['FamilyHistory']),
        int(data['Smoking']),
        int(data['Obesity']),
        int(data['AlcoholConsumption']),
        float(data['ExerciseHoursPerWeek']),
        int(data['Diet']),
        int(data['PreviousHeartProblems']),
        int(data['StressLevel']),
        float(data['BMI']),
        int(data['PhysicalActivityDaysPerWeek']),
        int(data['SleepHoursPerDay'])
    ]

    # Scale the input data
    new_patient_data_scaled = scaler.transform([new_patient_data])  # Note the double brackets

    # Perform prediction
    prediction = model.predict(new_patient_data_scaled)

    # Return the prediction result
    output = "High" if prediction[0] == 1 else "Low"
    return render_template('index.html', prediction_text=f'Heart Attack Risk Prediction: {output}')


if __name__ == "__main__":
    app.run(debug=True)
