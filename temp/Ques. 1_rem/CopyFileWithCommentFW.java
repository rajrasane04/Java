import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyFileWithCommentFW {
    public static void main(String[] args) {
        String sourceFile = args[0];
        String destinationFile = args[1];

        try {
            FileReader fr = new FileReader(sourceFile);
            Scanner sc = new Scanner(fr);

            FileWriter fw = new FileWriter(destinationFile);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                fw.write(line + "\n"); 
            }

            fw.write("end of file");

            sc.close();
            fr.close();
            fw.close();

            System.out.println("Contents copied successfully from " + sourceFile + " to " + destinationFile);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
