/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Zarathustra
 */

public class ATM {

    static Scanner keyboard = new Scanner(System.in);
    static String acctNum, pwd, result;
    static double oldBalance, newBalance, deposit, withdraw, currentBalance;
    static int choose;

    public static void main(String[] args) {
        for (int run = 0; run < 3; run++) {
            System.out.println("Enter your account number");
            acctNum = keyboard.nextLine();
            System.out.println("Enter your account password");
            pwd = keyboard.nextLine();

            result = checkID(acctNum, pwd);
            if (!result.equals("ERROR")) {
                break;
            } else if (run == 2) {// you cannot try to log in anymore than 3
                // times
                System.out.println("MAXIMUM TRIES EXCEEDED");
                return;
            }

        }
        menu();
    }

    public static String checkID(String acctNum, Object pwd) {
        String result = "ERROR";
        /*
        String a = "12345 password Kevin";
        String b = "1234567 password Kiba";
        String c = "123123 password Zara";
            */
        if (acctNum.equals("12345") && pwd.equals("password")) {
            result = "Kevin";
        } else if (acctNum.equals("1234567") && pwd.equals("password")) {
            result = "Kiba";
        } else if (acctNum.equals("123123") && pwd.equals("password")) {
            result = "Zara";
        }
        System.out.println("You are logged in as "+result);
        return result;
    }

    public static int menu() {
        System.out.println("Choose one of the following: \n1.Display Balance\n2.Deposit\n3.Withdraw\n4.Log Out");
        choose = keyboard.nextInt();

        if (choose == 1) {// 1. Display Balance
            displayBalance();
            menu();
            return 1;

        }
        if (choose == 2) {// 2. Deposit
            deposit();
            menu();
            return 2;

        }
        if (choose == 3) {// 3. Withdraw
            withdraw();
            menu();
            return 3;

        }
        if (choose == 4) {// 4. Log out
            System.out.println("You are logged out.");
            return 4;

        }
        if (choose <= 5) {// type in anything greater than 4 and you will get a
            // system error
            System.out.println("System Error");
            menu();
            return 5;
        }
        if (choose >= 1) {// type in anything less than 1 and you will get a
            // system error
            System.out.println("System Error");
            menu();
            return 6;
        }
        return choose;

    }

    public static void deposit() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter deposit amount:");
        double amount = input.nextDouble();
        System.out.println("Your deposit amount: " + amount);
        currentBalance += amount;
        System.out.println("Your new balance is: " + currentBalance);
    }

    public static double displayBalance() {
        System.out.println("Total balance is: $" + currentBalance);
        oldBalance = 0.00;
        return 1;
    }

    public static void withdraw() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter withdrawal amount: ");
        double amount = input.nextDouble();
        System.out.println("Your withdrawal amount: " + amount);
        currentBalance -= amount;
        System.out.println("Your new balance is: " + currentBalance);
    }
}
