
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class mainCopy {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("main.txt",true);
            writer.write("new file is created");
            writer.close();
            FileReader reader = new FileReader("main.txt");
            BufferedReader br= new BufferedReader(reader);
            String line;
            System.out.println("Data read from the file");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("-----Error-----");
        }

    }

}
