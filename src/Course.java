public class Course {
    private String courseCode;
    private int chapterNumber;
    private String subjectTitle;
    private int teacherId;
    private int id;

    public Course(int id, String courseCode, int chapterNumber, String subjectTitle, int teacherId) {
        this.id = id;
        this.courseCode = courseCode;
        this.chapterNumber = chapterNumber;
        this.subjectTitle = subjectTitle;
        this.teacherId = teacherId;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setChapterNumber(int chapterNumber) {
        this.chapterNumber = chapterNumber;
    }

    public int getChapterNumber() {
        return chapterNumber;
    }

    public void setSubjectTitle(String subjectTitle) {
        this.subjectTitle = subjectTitle;
    }

    public String getSubjectTitle() {
        return subjectTitle;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }
}
