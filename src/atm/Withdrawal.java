package atm;

/**
 *
 * @author Zarathustra aka Kevin Baik
 */

public class Withdrawal extends Transaction {

    private double amount;
    private Account account;

    public Withdrawal(int tNumber, double amt, Account acct) {
        super(tNumber);
        amount = amt;
        account = acct;
    }

    public void makeTransaction() {
        double startingBalance = account.getBalance();
        double transAmount = 0;
        if (amount >= startingBalance) {
            transAmount = amount;
        } else {
            System.out.println("Insufficient funds for this transaction.");
        }
        account.setBalance(startingBalance - transAmount);
    }
}
