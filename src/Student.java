
// Student class
public class Student extends Person {
    private String major;
    private String minor;

    public Student(String email, int phoneNumber, String firstName, String lastName, String password, int ID, String major, String minor) {
        super(email, phoneNumber, firstName, lastName, password, ID);
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
