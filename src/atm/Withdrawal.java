package atm;

import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author Zarathustra aka Kevin Baik
 */
public class Withdrawal extends Transaction implements Runnable {

  private double amount;
  private Account account;
  public boolean ready;
  private final ReentrantLock lock = new ReentrantLock();

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

  @Override
  public void run() {

    synchronized (Integer.class) {
      makeTransaction();
    }
    /*
        lock.lock();
        
        
        makeTransaction();
        lock.unlock();*/
  }

}
