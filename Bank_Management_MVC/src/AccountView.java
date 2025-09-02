import java.util.List;
import java.util.Scanner;

public class AccountView {
    private final Scanner scanner = new Scanner(System.in);

    public void displayAccounts(List<Account> accounts) {
        System.out.println("-- Account List --");
        for (Account account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Account Holder: " + account.getAccountHolder());
            System.out.println("Balance: $" + account.getBalance());
            System.out.println("--------");
        }
    }

    public Account createAccount() {
        Account account = new Account();
        System.out.println("-- Create New Account --");

        System.out.print("Enter Account Number: ");
        account.setAccountNumber(scanner.nextLine());

        System.out.print("Enter Account Holder Name: ");
        account.setAccountHolder(scanner.nextLine());

        System.out.print("Enter Initial Balance: ");
        account.setBalance(scanner.nextDouble());
        scanner.nextLine(); // consume leftover newline

        return account;
    }
}
