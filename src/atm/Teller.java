/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author Zarathustra
 */
public class Teller {
    String name, password;
    int accountNumber;
    double balance;
    
    public Teller(String name, String password, int accountNumber, double balance){
        this.name = name;
        this.password = password;
        this.accountNumber = accountNumber;
        this.balance = balance;
        
    }
    
    public String getName(){
        return name;
    }
    
    public String getPassword(){
        return password;
    }
    
    public int getAccountNumber(){
        return accountNumber;
    }
    
    public double getBalance(){
        return balance;
    }
    
    
}
