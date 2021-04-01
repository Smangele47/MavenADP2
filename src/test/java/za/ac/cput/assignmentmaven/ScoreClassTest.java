/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignmentmaven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import static java.time.Duration.ofMinutes;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import org.junit.jupiter.api.BeforeAll;

/**
 *
 * @author SMANGELE MABASO 220047154
 */
    //1. Disabling Test
    //@Disabled
  public class ScoreClassTest {
    private ScoreClass score1;
    private ScoreClass score2;
    private ScoreClass test ;

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }
     
    @BeforeEach
    public void setUp() {
    score1 = new ScoreClass();
    score2 = score1;
    test = new ScoreClass();
 
    }

    @AfterEach
    public void tearDown() throws Exception {
    }
    /** 2. Object Equality Test
     * Test of testEquality method, of class ScoreClass.
     */
     @Test
    public void testTestEquality() {
        System.out.println("testEquality");
        int score1 = 0;
        int score2 = 0;
        ScoreClass instance = new ScoreClass();
        int expResult = 0;
        int result = instance.testEquality(score1, score2);
        assertEquals(expResult, result);
        // Failing Test
        //fail("The test case is a prototype.");
    }

    /**3. Object Identity Test
     * Test of testIdentity method, of class ScoreClass.
     */
    @Test
    public void testTestIdentity() {
        System.out.println("testIdentity");
        int score1 = 0;
        int score2 = 0;
        ScoreClass instance = new ScoreClass();
        int expResult = 0;
        int result = instance.testIdentity(score1, score2);
        assertEquals(expResult, result);
        //4. Failing Test
        // fail("The test case is a prototype.");
        
       
    }
        //5. Timeout Test
        @Test
    public void timeoutNotExceededWithResult() {
       String actualResult = assertTimeout(ofMinutes(2), () -> {
       return "a result";
  });
       assertEquals("a result", actualResult);
 }
    
  }
