package TaskList;
public class Task {
    private String description;

    public String getDescription() {
        return description;
    }

    public Task(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Task [description=" + description + "]";
    }


}
