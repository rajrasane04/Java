import java.io.*;

public class FileCopy {
    public static void main(String[] args) {

        String sourceFile = args[0];
        String destFile = args[1];

        try {
            FileReader fr = new FileReader(sourceFile);
            FileWriter fw = new FileWriter(destFile);

            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }

            fr.close();
            fw.close();

            System.out.println("File copied successfully from " + sourceFile + " to " + destFile);

        }catch (IOException e) {
            System.out.println("Error while copying file: " + e.getMessage());
        }
    }
}
