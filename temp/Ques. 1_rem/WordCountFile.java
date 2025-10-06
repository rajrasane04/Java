import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCountFile {
    public static void main(String[] args) {
        String fileName = args[0];
        String searchWord = args[1];
        int count = 0;

        try {
            File file = new File(fileName);
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equals(searchWord)) {
                        count++;
                    }
                }
            }

            sc.close();

            System.out.println("The word \"" + searchWord + "\" occurs " + count + " times");

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }
}
