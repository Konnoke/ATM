package atm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Zarathustra aka Kevin Baik
 */
public class Account extends Thread {

  public int accountNumber;
  public double accountBalance;
  public boolean ready;

  public Account(int number, double initialBalance) {
    accountNumber = number;
    accountBalance = initialBalance;
    ready = true;
  }

  public int getNumber() {
    return accountNumber;
  }

  public double getBalance() {
    return accountBalance;
  }

  public void setNumber(int number) {
    accountNumber = number;
  }

  public void setBalance(double balance) {
    accountBalance = balance;
  }

  public void run() {
    while (!ready) {
      Thread.yield();

    }
    System.out.println(getBalance());
  }

}
