/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Zarathustra
 */
public class ATMIT {
    
    public ATMIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


    /**
     * Test of checkID method, of class ATM.
     */
    @Test
    public void testCheckID() {
        System.out.println("checkID");
        String acctNum = "12345";
        Object pwd = "password";
        String expResult = "Kevin";
        String result = Transaction.checkID(acctNum, pwd);
        assertEquals(expResult, result);
    }


    /**
     * Test of displayBalance method, of class ATM.
     */
    @Test
    public void testDisplayBalance() {
        System.out.println("displayBalance");
        double expResult = 0.0;
        double result = Transaction.displayBalance();
        assertEquals(expResult, result, 1);
    }

    
}
