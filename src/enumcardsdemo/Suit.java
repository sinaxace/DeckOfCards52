package enumcardsdemo;
/**
 *
 * @author SinaM
 */
public enum Suit {
    CLUBS(1,'\u2663'),DIAMONDS(2,'\u2662'),HEARTS(3,'\u2661'),SPADES(4,'\u2660');
    private final int suitNum;
    private final char uniCode;
    private Suit(int num, char uni)
    {
        suitNum = num;
        uniCode = uni;
    }
    public int getSuitNum()
    {
        return suitNum;
    }
    public char getUniCode()
    {
        return uniCode;
    }
}
