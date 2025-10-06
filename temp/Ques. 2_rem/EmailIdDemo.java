class InvalidUsernameException extends Exception {
    InvalidUsernameException(String message) {
        super(message);
    }
}

class InvalidPasswordException extends Exception {
    InvalidPasswordException(String message) {
        super(message);
    }
}

class EmailId {
    private String username;
    private String password;

    EmailId() {
        this.username = "defaultUser";
        this.password = "defaultPass";
    }

    EmailId(String username, String password) throws InvalidUsernameException, InvalidPasswordException {
        setUsername(username);
        setPassword(password);
    }

    void setUsername(String username) throws InvalidUsernameException {
        if (username == null || username.length() < 5) {
            throw new InvalidUsernameException("Username must be at least 5 characters long.");
        }
        this.username = username;
    }

    void setPassword(String password) throws InvalidPasswordException {
        if (password == null || password.length() < 6) {
            throw new InvalidPasswordException("Password must be at least 6 characters long.");
        }
        this.password = password;
    }

    void display() {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}

public class EmailIdDemo {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java EmailIdDemo <username> <password>");
            return;
        }

        String username = args[0];
        String password = args[1];

        try {
            EmailId email = new EmailId(username, password);
            System.out.println("EmailId created successfully!");
            email.display();
        } catch (InvalidUsernameException | InvalidPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
