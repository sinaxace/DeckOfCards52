/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumcardsdemo;

/**
 *
 * @author SinaM
 */
public final class DeckOfCards{
    Card[] cards = new Card[52]; //Reference of objects
    
    
    DeckOfCards()
    {
        init();
    }
    void init()
    {
        int i = 0;
        for(Suit suit: Suit.values()){
            for(Rank rank: Rank.values()){
                cards[i] = new Card(rank, suit);
                i++;
            }
        }
    }
    Card pickCard()
    {
        return cards[(int)(Math.random()*(52-0)+0)];
    }
    @Override
    public String toString()
    {
        int i = 0;
        for (Card card : cards) {
            System.out.print(card + " ");
            i++;
            if(i == 13 || i == 26 || i == 39){System.out.println();}
        }
        return "\n";
    }
}
