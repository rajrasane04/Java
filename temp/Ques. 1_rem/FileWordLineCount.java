import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileWordLineCount {
    public static void main(String[] args) {

        String fileName = args[0];
        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("File does not exist: " + fileName);
            return;
        }

        int lineCount = 0;
        int wordCount = 0;

        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                lineCount++;

                String[] words = line.trim().split("\\s+");
                if (words.length == 1 && words[0].isEmpty()) {
                   
                    continue;
                }
                wordCount += words.length;
            }

            sc.close();

            System.out.println("Number of lines: " + lineCount);
            System.out.println("Number of words: " + wordCount);

        } catch (FileNotFoundException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
