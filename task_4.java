import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("example.txt"); 
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
