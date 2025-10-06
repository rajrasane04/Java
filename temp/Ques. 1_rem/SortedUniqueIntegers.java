import java.util.*;

public class SortedUniqueIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        TreeSet<Integer> numbers = new TreeSet<>();

        System.out.print("Enter how many integers you want to input: ");
        int n = sc.nextInt();

        System.out.println("\nEnter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            int num = sc.nextInt();
            numbers.add(num); 
        }

        System.out.println("\nSorted integers without duplicates:");
        for (int num : numbers) {
            System.out.println(num);
        }

        sc.close();
    }
}
