package enumcardsdemo;
/**
 *
 * @author SinaM
 */
public class Card 
{
    Rank rank;
    Suit suit;
    
    Card(){}
    Card(Rank rank, Suit suit)
    {
        this.rank = rank;
        this.suit = suit;
    }
    void setRank(Rank rank)
    {
        this.rank = rank;
    }
    Rank getRank()
    {
        return rank;
    }
    void setSuit(Suit suit)
    {
        this.suit = suit;
    }
    Suit getSuit()
    {
        return suit;
    }
    @Override
    public String toString()
    {
        return rank.getRankName()+" of "+suit.getUniCode();
    }
    public String shortString()
    {
        return rank.getRankName().substring(0)+suit.getUniCode();
    }
}
