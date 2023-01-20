// Administrator class
public class Administrator extends Person {
    private String task;

    public Administrator(String email, int phoneNumber, String firstName, String lastName, String password, String task) {
        super(email, phoneNumber, firstName, lastName, password);
        this.task = task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getTask() {
        return task;
    }
}
