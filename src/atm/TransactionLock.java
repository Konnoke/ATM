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
public class TransactionLock {

  private final ReentrantLock lock = new ReentrantLock();

  public void method() {
    try {
      System.out.println("Locking thread");
    } finally {
      lock.unlock();
    }
  }

}
