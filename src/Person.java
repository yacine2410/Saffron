import java.util.Scanner; // for inputting user data

//packages to salt and hash user passwords
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

// Person class
public class Person 
{
    private String email;
    private int phoneNumber;
    private int ID;
    private String firstName;
    private String lastName;
    private String password;
    private byte[] salt;
    private byte[] hashedPassword;

    public Person(String email, int phoneNumber, String firstName, String lastName, String password, int ID) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.ID = ID;
    }

    public void setID(String ID){
        this.ID = ID;
    }

    public int getID(){
        return ID;
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
        // generate a new random salt
        SecureRandom random = new SecureRandom();
        salt = new byte[16];
        random.nextBytes(salt);

        // hash the password using the salt
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(salt);
            hashedPassword = md.digest(password.getBytes(StandardCharsets.UTF_8));
        } catch (NoSuchAlgorithmException e) {
            // handle exception
        }
    }   

    public void login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email:");
        String email = sc.nextLine();
        System.out.println("Enter password:");
        String password = sc.nextLine();

        // hash the entered password using the stored salt
                byte[] enteredHashedPassword;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(salt);
            enteredHashedPassword = md.digest(password.getBytes(StandardCharsets.UTF_8));
        } catch (NoSuchAlgorithmException e) {
            // handle exception
        }

        // compare the entered hashed password to the stored hashed password
        if (Arrays.equals(hashedPassword, enteredHashedPassword) && email.equals(this.email)) {
            System.out.println("Logged in successfully!");
        } else {
            System.out.println("Invalid email or password.");
        }
    }

    public String getPassword() {
        return password;
    }

}

