
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AccountController controller = new AccountController();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("\n--- Bank Management Menu ---");
            System.out.println("1. Create Account");
            System.out.println("2. Display Accounts");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    controller.createAccount();
                    break;
                case 2:
                    controller.displayAccounts();
                    break;
                case 3:
                    running = false;
                    System.out.println("Exiting application. Goodbye!");
                    break;
                default:
                    System.out.println("Please enter a valid choice (1-3).");
            }
        }
        scanner.close();
    }
}
