package enumcardsdemo;

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
        System.out.print("My Deck of Cards: \n");
        System.out.print(deck + " ");
        System.out.print("\nRandom Card: ");
        Card c = deck.pickCard();
        System.out.print(c.shortString());
    }
    
}
