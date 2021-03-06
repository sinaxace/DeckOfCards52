package deckofcards52;

import javafx.scene.image.ImageView;

/**
 *
 * @author SinaM
 * @modifier Cam Phuong, Maleki-Kheymehsari Sina, Ormond Graham, Tran Aaron
 */
public class Card implements Comparable<Card>
{
    Rank rank;
    Suit suit;
    
    //    ImageView picture;
    
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

//    public ImageView getPicture() {
//        return picture;
//    }
//
//    public void setPicture(ImageView picture) {
//        this.picture = picture;
//    }
    
    /*
        return card name
    */
    @Override
    public String toString()
    {
        return rank.getRankName()+" of "+suit.getUniCode();
    }
    
    /*
        
    */
    public String shortString()
    {
        return rank.getRankName().substring(0)+suit.getUniCode();
    }

    
    /*
        Compare another card with the players card
    */
    @Override
    public int compareTo(Card card) {
        return this.getRank().getRankNum() - card.getRank().getRankNum();
    }
}
