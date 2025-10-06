import java.io.*;

public class DisplayFileContent {
    public static void main(String[] args) {
        
        String filename = args[0];

        try {
            File file = new File(filename);
            if (!file.exists()) {
                System.out.println("File not found: " + filename);
                return;
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
