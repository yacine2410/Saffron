import java.util.HashMap;
import java.util.Map;

public class Grade {
    private int studentID;
    private int courseID;
    private int grade;
    private Map<Integer, Map<Integer, Integer>> grades = new HashMap<>();
    
    public Grade(int studentID, int courseID, int grade) {
        this.studentID = studentID;
        this.courseID = courseID;
        this.grade = grade;
    }
    
    public int getStudentID() {
        return studentID;
    }
    
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    
    public int getCourseID() {
        return courseID;
    }
    
    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }
    
    public int getGrade() {
        return grade;
    }
    
    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void addGrade(int studentId, int courseId, int grade) {
        if (!grades.containsKey(studentId)) {
            grades.put(studentId, new HashMap<>());
        }
        grades.get(studentId).put(courseId, grade);
    }

    public Map<Integer, Integer> getGrades(int studentId) {
        return grades.getOrDefault(studentId, new HashMap<>());
    }
}