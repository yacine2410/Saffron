import java.util.ArrayList;
import java.util.List;

public class Internship implements Opportunity {
    private int opportunityNumber;
    private String deadline;
    private String location;
    private String duration;
    private String organization;
    private String description;
    private boolean paid;
    private List<Internship> internships = new ArrayList<>();


    public Internship(int opportunityNumber, String deadline, String location, String duration, String organization, String description, boolean paid) {
        this.opportunityNumber = opportunityNumber;
        this.deadline = deadline;
        this.location = location;
        this.duration = duration;
        this.organization = organization;
        this.description = description;
        this.paid = paid;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
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

    public void addInternship(Internship internship) {
        internships.add(internship);
    }

    public void removeInternship(Internship internship) {
        internships.remove(internship);
    }

    public List<Internship> getAllInternships() {
        return internships;
    }

}