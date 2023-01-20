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

// Student class
public class Student extends Person {
    private String major;
    private String minor;

    public Student(String email, int phoneNumber, String firstName, String lastName, String password, String major, String minor) {
        super(email, phoneNumber, firstName, lastName, password);
        this.major = major;
        this.minor = minor;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMinor(String minor) {
        this.minor = minor;
    }

    public String getMinor() {
        return minor;
    }
}

// Teacher class
public class Teacher extends Person {
    private String department;
    private int yearsExperience;

    public Teacher(String email, int phoneNumber, String firstName, String lastName, String password, String department, int yearsExperience) {
        super(email, phoneNumber, firstName, lastName, password);
    this.department = department;
    this.yearsExperience = yearsExperience;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setYearsExperience(int yearsExperience) {
        this.yearsExperience = yearsExperience;
    }

    public int getYearsExperience() {
        return yearsExperience;
    }
}

// Administrator class
public class Administrator extends Person {
    private String task;

    public Administrator(String email, int phoneNumber, String firstName, String lastName, String password, String task) {
        super(email, phoneNumber, firstName, lastName, password);
        this.task = task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getTask() {
        return task;
    }
}
