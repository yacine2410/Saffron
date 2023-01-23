import java.util.ArrayList;
import java.util.List;

public class Master implements Opportunity {
    private int opportunityNumber;
    private String deadline;
    private String location;
    private String duration;
    private String university;
    private String title;
    private float requiredGPA;
    private List<Master> masters = new ArrayList<>();

    public Master(int opportunityNumber, String deadline, String location, String duration, String university, String title, float requiredGPA) {
        this.opportunityNumber = opportunityNumber;
        this.deadline = deadline;
        this.location = location;
        this.duration = duration;
        this.university = university;
        this.title = title;
        this.requiredGPA = requiredGPA;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getRequiredGPA() {
        return requiredGPA;
    }

    public void setRequiredGPA(float requiredGPA) {
        this.requiredGPA = requiredGPA;
    }

      @Override
    public int getOpportunityNumber() {
        return opportunityNumber;
    }

    @Override
    public void setOpportunityNumber(int opportunityNumber) {
        this.opportunityNumber = opportunityNumber;
    }

    @Override
    public String getDeadline() {
        return deadline;
    }

    @Override
    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String getDuration() {
        return duration;
    }

    @Override
    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void addMaster(Master master) {
        masters.add(master);
    }

    public void removeMaster(Master master) {
        masters.remove(master);
    }

    public List<Master> getAllMasters() {
        return masters;
    }

}
