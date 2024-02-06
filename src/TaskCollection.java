import java.util.*;

public class TaskCollection {
    private ArrayList<Task> tasks;
    private HashMap<String, Task> taskById;
    private LinkedList<Task> orderOfAddition;

    public TaskCollection() {
        this.tasks = new ArrayList<>();
        this.taskById = new HashMap<>();
        this.orderOfAddition = new LinkedList<>();
    }

    // Adding a task to the collection
    public void addTask(Task task) {
        tasks.add(task);
        taskById.put(task.getId(), task);
        orderOfAddition.add(task);
    }

    // Removing a task using its ID
    public void removeTaskById(String id) {
        Task task = taskById.get(id);
        if (task != null) {
            tasks.remove(task);
            orderOfAddition.remove(task);
            taskById.remove(id);
        }
    }

    // Fetching a task using its ID
    public Task getTaskById(String id) {
        return taskById.get(id);
    }

    // Making List of all tasks
    public List<Task> getAllTasks() {
        return tasks;
    }

    // List tasks in the order they were added
    public List<Task> getTasksInOrderOfAddition() {
        return orderOfAddition;
    }

    // List tasks from the HashMap (for demonstration purposes)
    public void listHashMapTasks() {
        System.out.println("Tasks from HashMap:");
        for (Map.Entry<String, Task> entry : taskById.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
