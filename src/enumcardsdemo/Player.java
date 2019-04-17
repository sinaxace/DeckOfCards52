
package enumcardsdemo;

import java.util.ArrayList;

/**
 *
 * @author Aaron Tran
 */
public class Player implements Comparable<Player>{
    private String name;
    public ArrayList<Card> myDeck = new ArrayList<>();
    private int score;
    
    public Player(String name){
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void addPoint(int amount) {
        this.score += amount;
    }
    
    @Override
    public int compareTo(Player p){
        return this.getScore() - p.getScore();
    }
    
    

}
