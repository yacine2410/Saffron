public class Club {
    private String clubName;
    private int clubPresidentID;
    private String field;
    private String description;

    public Club(String clubName, int clubPresidentID, String field, String description) {
        this.clubName = clubName;
        this.clubPresidentID = clubPresidentID;
        this.field = field;
        this.description = description;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public int getClubPresidentID() {
        return clubPresidentID;
    }

    public void setClubPresidentID(int clubPresidentID) {
        this.clubPresidentID = clubPresidentID;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}