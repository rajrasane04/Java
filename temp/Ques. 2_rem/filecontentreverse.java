import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class filecontentreverse {
    public static void main(String[] args) {

        String fileName = args[0];
        ArrayList<String> lines = new ArrayList<>();

        try {
            File file = new File(fileName);
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                lines.add(sc.nextLine());
            }
            sc.close();

            System.out.println("--- Contents in Reverse Order ---");
            for (int i = lines.size() - 1; i >= 0; i--) {
                System.out.println(lines.get(i));
            }

            System.out.println("\n--- Contents in Upper Case ---");
            for (String line : lines) {
                System.out.println(line.toUpperCase());
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }
}
