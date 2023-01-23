// Teacher class
public class Teacher extends Person {
    private String department;
    private int yearsExperience;

    public Teacher(String email, int phoneNumber, String firstName, String lastName, String password, int ID, String department, int yearsExperience) {
        super(email, phoneNumber, firstName, lastName, password, ID);
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