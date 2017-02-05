/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author Zarathustra aka Kevin Baik
 */
public class atm {

    public static void main(String[] args) {
        
        //Account account1;
        
        Account one = new Account(101, 10000.00);
        System.out.println("Balance： " + one.getBalance());
        
        
        Deposit deposit = new Deposit(102,200, one);
        Thread depositThread = new Thread(deposit);
        
        Account two = new Account(102, 9001.00);
        System.out.println("Balance： " + two.getBalance());
        
        
        Withdrawal oneW = new Withdrawal(101,200, two);
        Thread withdrawThread = new Thread(oneW);
        
        
        Transfer t = new Transfer(101,300, one, two);
        Thread transactionThread = new Thread(t);
        
        withdrawThread.start();
        depositThread.start();
        transactionThread.start();
        
    }
}
