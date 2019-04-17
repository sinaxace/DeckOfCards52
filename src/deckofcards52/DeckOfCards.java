/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deckofcards52;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author SinaM
 */
public final class DeckOfCards{
    Card[] cards = new Card[52]; //Reference of objects
    
    
    private DeckOfCards()
    {
        init();
    }
    
    /*
        Setup deck of cards
    */
    void init()
    {
        
        int i = 0;// loop instance counter 
        for(Suit suit: Suit.values()){ // loop through all suits
            for(Rank rank: Rank.values()){ // loop through all card values
                cards[i] = new Card(rank, suit); // add the card to the deck
//                cards[i].setPicture(new ImageView("card/" + (i + 1) + ".png"));
                i++;
            }
        }
    }
    
    /*
        return a card from the deck
    */
    
    Card pickCard()
    {
        return cards[(int)(Math.random()*(52-0)+0)];
    }
    
    private static DeckOfCards myInstance = null;


    public static DeckOfCards getInstance() {
        if (myInstance == null) {
            myInstance = new DeckOfCards();
        }
        return myInstance;
    }
    /*
        output card name
    */
    @Override
    public String toString()
    {
        int i = 0; // loop instance counter
        System.out.println(cards.length);
        for (Card card : cards) { // loop through all cards
            System.out.print(card + " "); // prompt card name
            i++;
            if(i == 13 || i == 26 || i == 39){ // add space at spots
                System.out.println();
            }
        }
        return "\n"; 
    }
}
