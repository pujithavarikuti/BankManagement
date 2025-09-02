import java.util.ArrayList;
import java.util.List;

public class AccountController {
    private final List<Account> accounts;
    private final AccountView accountView;

    public AccountController() {
        accounts = new ArrayList<>();
        accountView = new AccountView();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void displayAccounts() {
        accountView.displayAccounts(accounts);
    }

    public void createAccount() {
        Account account = accountView.createAccount();
        addAccount(account);
        System.out.println("Account created successfully!");
    }
}