import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student extends Person {
    private String major;
    private int graduationYear;
    private Map<String, Double> grades;
    private List<String> courses;
    private Map<String, List<Scholarship>> scholarships;
    private Map<String, List<Internship>> internships;
    private Map<String, List<Master>> masters;
    private Map<String, String> professors;

    public Student(String email, int phoneNumber, String firstName, String lastName, String password, int ID, String major, int graduationYear) {
        super(email, phoneNumber, firstName, lastName, password, ID);
        this.major = major;
        this.graduationYear = graduationYear;
        this.grades = new HashMap<>();
        this.courses = new ArrayList<>();
        this.scholarships = new HashMap<>();
        this.internships = new HashMap<>();
        this.masters = new HashMap<>();
        this.professors = new HashMap<>();
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    public int getGraduationYear(){
        return graduationYear;
    }

    public void checkOpportunities() {
        if(isLoggedIn) {
            System.out.println("Available Scholarships:");
            for (Map.Entry<String, List<Scholarship>> entry : scholarships.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
            System.out.println("\nAvailable Internships:");
            for (Map.Entry<String, List<Internship>> entry : internships.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
            System.out.println("\nAvailable Masters:");
            for (Map.Entry<String, List<Master>> entry : masters.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } else {
            System.out.println("You must be logged in to view opportunities");
        }
    }
    
    public void viewCourses() {
        if(isLoggedIn) {
            System.out.println("Courses:");
            for (String course : courses) {
                System.out.println(course);
            }
        } else {
            System.out.println("You must be logged in to view courses");
        }
    }
    
    public void viewGrades() {
        if(isLoggedIn) {
            System.out.println("Grades:");
            for (Map.Entry<String, Double> entry : grades.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } else {
            System.out.println("You must be logged in to view grades");
        }
    }
    
    public void checkProfessorContact(String courseID) {
        if(isLoggedIn) {
            if(professors.containsKey(courseID)) {
                System.out.println("Professor's email for " + courseID + ": " + professors.get(courseID));
                } else {
                System.out.println("No contact information available for professor of " + courseID);
                }
                } else {
                System.out.println("You must be logged in to check professor's contact information");
                }
    }
}

    

    