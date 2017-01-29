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
        Account acct1 = new Account(101, 10000.00);
        System.out.println("Account Balance: " + acct1.getBalance());

        Withdrawal w = new Withdrawal(100, 100, acct1);
        System.out.println("Account Balance: " + acct1.getBalance());
    }
}
