/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumcardsdemo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Joey
 */
public class EnumCardsDemoTest {
    
    public EnumCardsDemoTest() {
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
     * Test of main method, of class EnumCardsDemo.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        EnumCardsDemo.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of setUpPlayers method, of class EnumCardsDemo.
     */
    @Test
    public void testSetUpPlayersGood() {
        System.out.println("setUpPlayers");
        EnumCardsDemo.setUpPlayers();

    }
    
        @Test
    public void testSetUpPlayersBad() {
        System.out.println("setUpPlayers");
        EnumCardsDemo.setUpPlayers();
    }
        @Test
    public void testSetUpPlayersBoundary() {
        System.out.println("setUpPlayers");
        EnumCardsDemo.setUpPlayers();

    }

    /**
     * Test of setupPlayerHands method, of class EnumCardsDemo.
     */
    @Test
    public void testSetupPlayerHandsGood() {
        System.out.println("setupPlayerHands");
        EnumCardsDemo.setupPlayerHands();

    }
    
    @Test
    public void testSetupPlayerHandsBad() {
        System.out.println("setupPlayerHands");
        EnumCardsDemo.setupPlayerHands();

    }
    
    @Test
    public void testSetupPlayerHandsBoundary() {
        System.out.println("setupPlayerHands");
        EnumCardsDemo.setupPlayerHands();

    }

    /**
     * Test of playGame method, of class EnumCardsDemo.
     */
    @Test
    public void testPlayGameGood() {
        System.out.println("playGame");
        EnumCardsDemo.playGame();

    }
    
    @Test
    public void testPlayGameBad() {
        System.out.println("playGame");
        EnumCardsDemo.playGame();

    }
    
    @Test
    public void testPlayGameBoundary() {
        System.out.println("playGame");
        EnumCardsDemo.playGame();

    }

    /**
     * Test of getEndScore method, of class EnumCardsDemo.
     */
    @Test
    public void testGetEndScoreGood() {
        System.out.println("getEndScore");
        EnumCardsDemo.getEndScore();

    }
    
    @Test
    public void testGetEndScoreBad() {
        System.out.println("getEndScore");
        EnumCardsDemo.getEndScore();

    }
    
    @Test
    public void testGetEndScoreBoundary() {
        System.out.println("getEndScore");
        EnumCardsDemo.getEndScore();

    }
    
}
