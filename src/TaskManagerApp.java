import java.util.Scanner;

public class TaskManagerApp {
    public static void main(String[] args) {
        TaskCollection taskCollection = new TaskCollection();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an action: Add (a), Remove (r), List (l), Quit (q)");
            String action = scanner.nextLine();

            if ("q".equalsIgnoreCase(action)) {
                break;
            }

            switch (action.toLowerCase()) {
                case "a":
                    System.out.println("Enter task ID, Name, and Description separated by commas:");
                    String[] taskDetails = scanner.nextLine().split(",");
                    Task task = new Task(taskDetails[0].trim(), taskDetails[1].trim(), taskDetails[2].trim());
                    taskCollection.addTask(task);
                    System.out.println("Task added.");
                    break;
                case "r":
                    System.out.println("Enter task ID to remove:");
                    String idToRemove = scanner.nextLine();
                    taskCollection.removeTaskById(idToRemove);
                    System.out.println("Task removed.");
                    break;
                case "l":
                    System.out.println("Tasks in the collection:");
                    for (Task t : taskCollection.getAllTasks()) {
                        System.out.println(t);
                    }
                    System.out.println("Tasks in order of addition:");
                    for (Task t : taskCollection.getTasksInOrderOfAddition()) {
                        System.out.println(t);
                    }
                    // Optionally list tasks from the HashMap
                    taskCollection.listHashMapTasks();
                    break;
                default:
                    System.out.println("Invalid action. Please choose again.");
                    break;
            }
        }
        scanner.close();
    }
}
