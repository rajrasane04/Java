import java.util.Scanner;

class InvalidDateException extends Exception {
    InvalidDateException(String message) {
        super(message);
    }
}

class MyDate {
    private int day;
    private int month;
    private int year;

    MyDate() {
        this.day = 1;
        this.month = 1;
        this.year = 2000;
    }

    MyDate(int day, int month, int year) throws InvalidDateException {
        setDate(day, month, year);
    }

    void setDate(int day, int month, int year) throws InvalidDateException {
        if (month < 1 || month > 12) {
            throw new InvalidDateException("Invalid month: " + month);
        }

        if (day < 1 || day > getDaysInMonth(month, year)) {
            throw new InvalidDateException("Invalid day: " + day + " for month " + month + " in year " + year);
        }

        this.day = day;
        this.month = month;
        this.year = year;
    }

    void acceptDate() throws InvalidDateException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day: ");
        int d = sc.nextInt();
        System.out.print("Enter month: ");
        int m = sc.nextInt();
        System.out.print("Enter year: ");
        int y = sc.nextInt();

        setDate(d, m, y);

        sc.close();
    }

    void displayDate() {
        System.out.printf("%02d/%02d/%04d\n", day, month, year);
    }

    private int getDaysInMonth(int month, int year) {
        switch (month) {
            case 2:
                if (isLeapYear(year)) return 29;
                else return 28;
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return 31;
        }
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

public class MyDateDemo {
    public static void main(String[] args) {
        try {
            MyDate date = new MyDate();
            date.acceptDate();
            System.out.print("Entered Date: ");
            date.displayDate();
        } catch (InvalidDateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }  
}
