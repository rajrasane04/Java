import java.util.LinkedList;
import java.util.Scanner;

public class FriendsLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> friends = new LinkedList<>();

        System.out.print("Enter number of friends: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume white space
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of friend " + (i + 1) + ": ");
            String name = sc.nextLine();
            friends.add(name);
        }

        System.out.println("\nFriends List:");
        for (String name : friends) {
            System.out.println(name);
        }

        sc.close();
    }
}
