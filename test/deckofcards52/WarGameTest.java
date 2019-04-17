/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deckofcards52;

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
public class WarGameTest {
    
    public WarGameTest() {
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
     * Test of validNames method, of class WarGame.
     */
    @Test
    public void testValidNamesGood() {
        System.out.println("validNamesGood");
        String name1 = "Aaron";
        String name2 = "Sina";
        WarGame instance = new WarGame();
        boolean expResult = true;
        boolean result = instance.validNames(name1, name2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidNamesBad() {
        System.out.println("validNamesBad");
        String name1 = "";
        String name2 = "";
        WarGame instance = new WarGame();
        boolean expResult = false;
        boolean result = instance.validNames(name1, name2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidNamesBad2() {
        System.out.println("validNamesBad2");
        String name1 = "Aaron";
        String name2 = "Aaron";
        WarGame instance = new WarGame();
        boolean expResult = false;
        boolean result = instance.validNames(name1, name2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidNamesBoundary() {
        System.out.println("validNamesBoundary");
        String name1 = "11";
        String name2 = "22";
        WarGame instance = new WarGame();
        boolean expResult = true;
        boolean result = instance.validNames(name1, name2);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of validChoice method, of class WarGame.
     */
    @Test
    public void testValidChoiceGood() {
        System.out.println("validChoiceGood");
        String choice = "1";
        WarGame instance = new WarGame();
        boolean expResult = true;
        boolean result = instance.validChoice(choice);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidChoiceGood2() {
        System.out.println("validChoiceGood2");
        String choice = "2";
        WarGame instance = new WarGame();
        boolean expResult = true;
        boolean result = instance.validChoice(choice);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidChoiceBad() {
        System.out.println("validChoiceBad");
        String choice = "";
        WarGame instance = new WarGame();
        boolean expResult = false;
        boolean result = instance.validChoice(choice);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidChoiceBoundary() {
        System.out.println("validChoiceBoundary");
        String choice = "1";
        WarGame instance = new WarGame();
        boolean expResult = true;
        boolean result = instance.validChoice(choice);
        assertEquals(expResult, result);
    }
}