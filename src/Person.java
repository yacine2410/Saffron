import java.util.Scanner; // for inputting user data

// Person class
public class Person {
    private String email;
    private int phoneNumber;
    private String firstName;
    private String lastName;
    private String password;

    public Person(String email, int phoneNumber, String firstName, String lastName, String password) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email:");
        String email = sc.nextLine();
        System.out.println("Enter password:");
        String password = sc.nextLine();

        // check if entered email and password match the stored email and password
        if (email.equals(this.email) && password.equals(this.password)) {
            System.out.println("Logged in successfully!");
        } else {
            System.out.println("Invalid email or password.");
        }
    }
}

