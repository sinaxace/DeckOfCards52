/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deckofcards52;

/**
 *
 * @author SinaM
 */
public enum Rank {
    ACE(1,"Ace"),
    TWO(2,"Two"), 
    THREE(3,"Three"), 
    FOUR(4,"Four"), 
    FIVE(5,"Five"), 
    SIX(6,"Six"), 
    SEVEN(7,"Seven"), 
    EIGHT(8,"Eight"), 
    NINE(9,"Nine"), 
    TEN(10,"Ten"),
    JACK(11,"Jack"),
    QUEEN(12,"Queen"),
    KING(13,"King");
    private final int rankNum;
    private final String rankName;
    
    private Rank(int num, String name)
    {
        rankNum = num;
        rankName = name;
    }
    public int getRankNum()
    {
        return rankNum;
    }
    public String getRankName()
    {
        return rankName;
    }
}
