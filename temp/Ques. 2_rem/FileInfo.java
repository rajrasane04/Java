import java.io.File;
import java.util.Scanner;

public class FileInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file name or path: ");
        String fileName = sc.nextLine();

        File file = new File(fileName);

        if (file.exists()) {
            System.out.println("File exists: Yes");

            System.out.println("Readable: " + (file.canRead() ? "Yes" : "No"));

            System.out.println("Writable: " + (file.canWrite() ? "Yes" : "No"));

            if (file.isFile()) {
                System.out.println("Type: Regular file");
            } else if (file.isDirectory()) {
                System.out.println("Type: Directory");
            } else {
                System.out.println("Type: Other");
            }

            System.out.println("Length: " + file.length() + " bytes");
        } else {
            System.out.println("File exists: No");
        }

        sc.close();
    }
}
