import java.util.ArrayList;
import java.util.List;

public class Scholarship implements Opportunity {
    private int opportunityNumber;
    private String deadline;
    private String location;
    private String duration;
    private String requirement;
    private boolean fullyFunded;
    private List<Scholarship> scholarships = new ArrayList<>();


    public Scholarship(int opportunityNumber, String deadline, String location, String duration, String requirement, boolean fullyFunded) {
        this.opportunityNumber = opportunityNumber;
        this.deadline = deadline;
        this.location = location;
        this.duration = duration;
        this.requirement = requirement;
        this.fullyFunded = fullyFunded;
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

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public boolean isFullyFunded() {
        return fullyFunded;
    }

    public void setFullyFunded(boolean fullyFunded) {
        this.fullyFunded = fullyFunded;
    }

    public void addScholarship(Scholarship scholarship) {
        scholarships.add(scholarship);
    }

    public void removeScholarship(Scholarship scholarship) {
        scholarships.remove(scholarship);
    }

    public List<Scholarship> getAllScholarships() {
        return scholarships;
    }
}
