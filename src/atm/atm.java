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
        new Account(101, 10000.00).start();
        
        new Account(102, 9001.00).start();
    }
}
