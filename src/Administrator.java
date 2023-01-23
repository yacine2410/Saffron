import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Administrator extends Person {
    private String task;
    private List<String> courses;
    private Map<String, Double> grades;
    private Map<String, List<Scholarship>> scholarships;
    private Map<String, List<Internship>> internships;
    private Map<String, List<Master>> masters;
    private Map<String, String> professors;

    public Administrator(String email, int phoneNumber, String firstName, String lastName, String password, int ID, String task) {
        super(email, phoneNumber, firstName, lastName, password, ID);
        this.task = task;
        this.courses = new ArrayList<>();
        this.grades = new HashMap<>();
        this.scholarships = new HashMap<>();
        this.internships = new HashMap<>();
        this.masters = new HashMap<>();
        this.professors = new HashMap<>();
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void addCourse(String course) {
        if(isLoggedIn) {
            this.courses.add(course);
        } else {
            System.out.println("You must be logged in to perform this action.");
        }
    }

    public void removeCourse(String course) {
        if(isLoggedIn) {
            this.courses.remove(course);
        } else {
            System.out.println("You must be logged in to perform this action.");
        }
    }
    
    public void addGrade(String courseID, double grade) {
        if(isLoggedIn) {
            this.grades.put(courseID, grade);
        } else {
            System.out.println("You must be logged in to perform this action.");
        }
    }
    
    public void addScholarship(String scholarshipID, Scholarship scholarship) {
        if(isLoggedIn) {
            if (!this.scholarships.containsKey(scholarshipID)) {
                this.scholarships.put(scholarshipID, new ArrayList<>());
            }
            this.scholarships.get(scholarshipID).add(scholarship);
        } else {
            System.out.println("You must be logged in to perform this action.");
        }
    }
    
    public void addInternship(String internshipID, Internship internship) {
        if(isLoggedIn) {
            if (!this.internships.containsKey(internshipID)) {
                this.internships.put(internshipID, new ArrayList<>());
            }
            this.internships.get(internshipID).add(internship);
        } else {
            System.out.println("You must be logged in to perform this action.");
        }
    }
    
    public void addMaster(String masterID, Master master) {
        if(isLoggedIn) {
            if (!this.masters.containsKey(masterID)) {
                this.masters.put(masterID, new ArrayList<>());
            }
            this.masters.get(masterID).add(master);
        } else {
            System.out.println("You must be logged in to perform this action.");
        }
    }
    
    public void addProfessor(String courseID, String email) {
        if(isLoggedIn) {
            this.professors.put(courseID, email);
        } else {
            System.out.println("You must be logged in to perform this action.");
        }
    }

}
    
