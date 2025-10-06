import java.io.File;
import java.util.Scanner;

public class filedirectory {
    public static void main(String[] args) {

        String path = args[0];
        File f = new File(path);

        Scanner sc = new Scanner(System.in);

        if (f.isDirectory()) {
            System.out.println("It is a directory.");

            File[] files = f.listFiles((dir, name) -> name.toLowerCase().endsWith(".txt"));

            if (files.length == 0) {
                System.out.println("No text files found in the directory.");
            } else {
                System.out.print("Do you want to delete all text files in this directory? (yes/no): ");
                String confirm = sc.nextLine();

                if (confirm.equalsIgnoreCase("yes")) {
                    int deletedCount = 0;
                    for (File file : files) {
                        if (file.delete()) {
                            deletedCount++;
                        }
                    }
                    System.out.println(deletedCount + " text file(s) deleted.");
                } else {
                    System.out.println("Delete operation cancelled.");
                }
            }

        } else if (f.isFile()) {
            System.out.println("It is a file.");
            System.out.println("File Details:");
            System.out.println("Name: " + f.getName());
            System.out.println("Path: " + f.getAbsolutePath());
            System.out.println("Size: " + f.length() + " bytes");
            System.out.println("Readable: " + f.canRead());
            System.out.println("Writable: " + f.canWrite());
            System.out.println("Executable: " + f.canExecute());
            System.out.println("Last Modified: " + f.lastModified());
        } else {
            System.out.println("Unknown type.");
        }

        sc.close();
    }
}
