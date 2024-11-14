import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskController controller = new TaskController();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add");
            System.out.println("2. Display");
            System.out.println("3. Mark Task");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    controller.addTask(title, description);
                    break;
                case 2:
                    controller.displayTasks();
                    break;
                case 3:
                    System.out.print("Enter task ID to mark as completed: ");
                    int id = scanner.nextInt();
                    controller.markTaskAsCompleted(id);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}

