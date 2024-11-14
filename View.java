import java.util.List;

public class View {
    public void displayTasks(List<Task> tasks) {
        for (Task task : tasks) {
            System.out.println("ID: " + task.getId() + ", Title: " + task.getTitle() +
                    ", Description: " + task.getDescription() +
                    ", Completed: " + (task.isCompleted() ? "Yes" : "No"));
        }
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}
