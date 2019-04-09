package enumcardsdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author SinaM
 * @modifier Cam Phuong, Maleki-Kheymehsari Sina, Ormond Graham, Tran Aaron
 */
public class EnumCardsDemo {
    // setup public game variables
    public static DeckOfCards deck;
    public static ArrayList<Card> cards;
    public static ArrayList<Card> aDeck ;
    public static Scanner input;
    public static Player p1, p2;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // setup variables
        deck = new DeckOfCards();
        cards = new ArrayList<>(Arrays.asList(deck.cards));
        aDeck = new ArrayList<>();
        input = new Scanner(System.in);
        
        // create the player references
        p1 = new Player("");
        p2 = new Player("");
        
        // setup game methods
        Collections.shuffle(cards); // shuffle the cards
        setUpPlayers(); // get player infomation
        setupPlayerHands(); // give each player half the deck
        
        // game method
        playGame();
        
        // end game method
        getEndScore();
    }   
    
    /*
        Setup player infomation
    */
    public static void setUpPlayers(){
        System.out.println("Enter Number of Players 1 or 2"); // prompt the user
        OUTER:
        // continue to run until a correct player amount is entered
        while (true) {
            switch (input.nextLine()) { // switch case for input
                case "2": // 2 players
                    // get player ones name
                    System.out.println("Enter player 1 name"); 
                    p1.setName(input.nextLine());
                    // get player twos name
                    System.out.println("Enter player 2 name");
                    p2.setName(input.nextLine());
                    break OUTER; // break out of while loop
                case "1": // one player
                    // setup player one
                    System.out.println("Enter player 1 name");
                    p1.setName(input.nextLine());
                    // setup player two default
                    p2.setName("Computer"); // set player 2s name to computer
                    break OUTER; // break out of while loop
                default:
                    System.out.println("Enter Number of Players 1 or 2"); // prompt the user again
                    break; // break switch, stay in loop
            }
        }
        
    }
   
    /*
        Give each player half the deck
    */
    public static void setupPlayerHands(){
        // setup player hands
        for(int i = 0; i < 52; ++i){// loop through the deck
            if(i%2 == 0){ // every other card
                p1.myDeck.add(cards.get(i)); // add to player 1
            }
            else{
                p2.myDeck.add(cards.get(i)); // add to player 2
            }
        }
    }
    
    /*
        Play through the game for the users
    */
    public static void playGame(){
        int war = 0; // keep trace of the war round
        for(int i = 0; i < 52/2; ++i){ // loop through half the deck size
            // create card refences for each player
            Card p1Card = p1.myDeck.get(i); // player ones card
            Card p2Card = p2.myDeck.get(i); // player twos card
            int result = p1Card.compareTo(p2Card); // compare the cards            
            if(result > 0){ // player ones card is higher
                if (war > 0){
                    System.out.println(p1.getName() + " Wins War! : "+" "+p1Card+" > "+p2Card);
                }else{
                    System.out.println(p1.getName() + " Wins! : "+" "+p1Card+" > "+p2Card);
                }
                p1.addPoint(1 + war); // +1 + any war round points for player one
                war = 0; // no more war
            }
            else if(result < 0){ // player twos card is higher
                if (war > 0){
                    System.out.println(p2.getName() + " Wins War! : "+" "+p2Card+" > "+p1Card);
                }else{
                    System.out.println(p2.getName() + " Wins! : "+" "+p2Card+" > "+p1Card);
                }
                p2.addPoint(1 + war); // +1 + any war round points for player one
                war = 0; // no more war
            }
            else{ // THIS MEANS WAR
                System.out.println("Tie this round"); // tie round
                System.out.println("Both place one card face down"); // tie round
                i += 1; // players give away a card to add the war points
                war += 1; // add a point to the war counter
            }
        }
    }
    
    /*
        get the score at the end of the game
    */
    public static void getEndScore(){
        if(p1.getScore() > p2.getScore()){ // player one wins
            System.out.println(p1.getName()+" wins the game");
        }
        else if(p1.getScore() < p2.getScore()){ // playe two wins
            System.out.println(p2.getName() +" wins the game");
        }
        else{ // tie game
            System.out.println("Tie");
        }
    }
}

