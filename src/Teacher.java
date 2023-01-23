import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Teacher extends Person {
    private String department;
    private int yearsExperience;
    private ArrayList<String> courses;
    private Map<String, List<Grade>> grades;

    public Teacher(String email, int phoneNumber, String firstName, String lastName, String password, int ID, String department, int yearsExperience, ArrayList<String> courses) {
        super(email, phoneNumber, firstName, lastName, password, ID);
        this.department = department;
        this.yearsExperience = yearsExperience;
        this.courses = courses;
        this.grades = new HashMap<>();
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

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

    public void updateContactInfo(String firstName, String lastName, String email) {
        if(isLoggedIn){
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
        }
        else{
            System.out.println("you need to be logged in to perform this action");
        }
    }

    public void addCourse(String course) {
       if(isLoggedIn){
           courses.add(course);
       }
       else{
            System.out.println("you need to be logged in to perform this action");
       }
    }

    public void removeCourse(String course) {
        if(isLoggedIn){
            courses.remove(course);
        }
        else{
            System.out.println("you need to be logged in to perform this action");
        }
    }

    public void uploadGrade(String studentID, Grade grade) {
        if(isLoggedIn){
            if (!grades.containsKey(studentID)) {
                grades.put(studentID, new ArrayList<>());
            }
            grades.get(studentID).add(grade);
        }
        else{
            System.out.println("you need to be logged in to perform this action");
        }
        
    }

    public List<String> viewStudents() {
        if(isLoggedIn){
            return new ArrayList<>(grades.keySet());
        }
        else{
            System.out.println("you need to be logged in to perform this action");
            return null;
        }
        
    }

    public Map<String, List<Grade>> getGrades() {
        if(isLoggedIn){
            return grades;
        }
        else{
            System.out.println("you need to be logged in to perform this action");
            return null;
        }
        
    }
}