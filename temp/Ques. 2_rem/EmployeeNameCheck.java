import java.util.Scanner;

class InvalidNameException extends Exception {
    InvalidNameException(String message) {
        super(message);
    }
}

class Employee {
    private String name;

    Employee(String name) throws InvalidNameException {
        setName(name);
    }

    void setName(String name) throws InvalidNameException {
        if (!name.matches("[a-zA-Z]+")) { 
            throw new InvalidNameException("Name is Invalid: " + name);
        }
        this.name = name;
    }

    void display() {
        System.out.println("Employee Name: " + name);
    }
}

public class EmployeeNameCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        try {
            Employee emp = new Employee(name);
            System.out.println("Valid name!");
            emp.display();
        } catch (InvalidNameException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
