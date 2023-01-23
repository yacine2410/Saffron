// Teacher class
public class Teacher extends Person {
    private String department;
    private int yearsExperience;
    private String[] course;

    public Teacher(String email, int phoneNumber, String firstName, String lastName, String password, int ID, String department, int yearsExperience, String[] course) {
        super(email, phoneNumber, firstName, lastName, password, ID);
    this.department = department;
    this.yearsExperience = yearsExperience;
    this.course = course;
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

    public String[] getCourse() {
        return course;
    }

    public void setCourse(String[] course) {
        this.course = course;
    }
}