import java.util.ArrayList;
import java.util.List;

public class TaskController {
    private List<Task> tasks = new ArrayList<>();
    private View view = new View();
    private int nextId = 1;

    public void addTask(String title, String description) {
        Task task = new Task(nextId++, title, description);
        tasks.add(task);
        view.displayMessage("Task added successfully.");
    }

    public void displayTasks() {
        view.displayTasks(tasks);
    }

    public void markTaskAsCompleted(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setCompleted(true);
                view.displayMessage("Task marked as completed.");
                return;
            }
        }
        view.displayMessage("Task not found.");
    }
}
