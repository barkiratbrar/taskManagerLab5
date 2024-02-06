public class Task {
    private String id;
    private String name;
    private String description;

    // Constructor
    public Task(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Representing Task object as a String
    @Override
    public String toString() {
        return "Task" + "id='" + id + '\'' + ", name='" + name + '\'' + ", description='" + description + '\'';
    }
}
