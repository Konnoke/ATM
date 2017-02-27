/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author Zarathustra
 */
public class Deposit extends Transaction implements Runnable {

  private double amount;
  private Account acc;
  private final ReentrantLock lock = new ReentrantLock();

  public Deposit(int tnumber, double amount, Account acc) {
    super(tnumber);
    this.amount = amount;
    this.acc = acc;

  }

  @Override
  public void makeTransaction() {
    acc.setBalance(acc.getBalance() + amount);
    System.out.println(acc.getNumber() + " Deposit: " + amount);
    System.out.println(acc.getNumber() + " Balace： " + acc.getBalance());
    System.out.println();
  }

  @Override
  public void run() {
    synchronized (Integer.class) {
      makeTransaction();
    }
    /*
        lock.lock();
        makeTransaction();
        lock.unlock();
     */
  }

}
