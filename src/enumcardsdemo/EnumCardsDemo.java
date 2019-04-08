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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        DeckOfCards deck = new DeckOfCards();
        ArrayList<Card> cards = new ArrayList<>(Arrays.asList(deck.cards));
        Collections.shuffle(cards);
        ArrayList<Card> aDeck = new ArrayList<>();
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number of Players 1 or 2");
        Player p1;
        Player p2 = new Player("Computer");
        int choice = input.nextInt();
        input.nextLine();
        if (choice == 2){
            System.out.println("Enter player 1 name");
            p1 = new Player(input.nextLine());
            System.out.println("Enter player 2 name");
            p2 = new Player(input.nextLine());
        }
        else{
            System.out.println("Enter player 1 name");
            p1 = new Player(input.nextLine());
        }
        
        for(int i = 0; i < 52; ++i){
            if(i%2 == 0){
                p1.myDeck.add(cards.get(i));
            }
            else{
                p2.myDeck.add(cards.get(i));
            }
        }
        
        for(int i = 0; i < 52/2; ++i){
            Card p1Card = p1.myDeck.get(i);
            Card p2Card = p2.myDeck.get(i);
            int temp = p1Card.compareTo(p2Card);
            if(temp > 0){
                System.out.println("Player 1 won round"+" "+p1Card+" > "+p2Card);
                p1.addPoint();
            }
            else if(temp < 0){
                System.out.println("Player 2 won round"+" "+p1Card+" < "+p2Card);
                p2.addPoint();
            }
            else{
                System.out.println("Tie this round");
            }
        }
        if(p1.getScore() > p2.getScore()){
            System.out.println(p1.getName()+" wins the game");
        }
        else if(p1.getScore() < p2.getScore()){
            System.out.println(p2.getName() +" wins the game");
        }
        else{
            System.out.println("Tie");
        }
    }    
}
