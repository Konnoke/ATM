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
public class Transfer extends Transaction implements Runnable {
    
    private double amount;
    private Account sender;
    private Account receiver;
    private final ReentrantLock lock = new ReentrantLock();
    
    public Transfer(int tnumber,double amount,Account sender,Account receiver) {
        super(tnumber);
        this.amount = amount;
        this.sender = sender;
        this.receiver = receiver;
        
    }

    @Override
    public void makeTransaction() {
        
        lock.lock();
        
        if(amount > sender.getBalance())
        {
            System.out.println("You do not have enought balance");
            
        }
        else{
            try {
                sender.setBalance(sender.getBalance()-amount);
                System.out.println("Transfer $" +amount +" from "+ sender.getNumber()+ " to " + receiver.getNumber());
                Thread.sleep(3000);
                receiver.setBalance(sender.getBalance()+amount);
                System.out.println("Transaction completed");
                
                
                System.out.println("Account number:"+sender.getNumber()+" balance:"+ sender.getBalance());
                System.out.println("Account number:"+receiver.getNumber() +" balance:"+ receiver.getBalance());
            } catch (InterruptedException ex) {
                System.out.println("Thread has been interrputed");
            }
        }
        
        lock.unlock();
    }

    @Override
    public void run() {
         makeTransaction();
    }
    
}