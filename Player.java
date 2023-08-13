package finalProject;

import java.util.ArrayList;
import java.util.List;
//Here I create the class named Player
class Player {
	
//Here I assign the list of Card to hand, I create the variable score and name
    private List<Card> hand;
    private int score;
    private String name;

//Here I give the player a new array that comes from the the hand array  
// and I set the score to 0 to begin. I also get the name of the player
// and assign it to this instance of the variable
    public Player(String name) {
        hand = new ArrayList<>();
        score = 0;
        this.name = name;
    }

//Here the method prints out information about the player and calls the 
// describe method for each card in the Hand List
    public void describe() {
        System.out.println(name + "'s hand:");
        for (Card card : hand) {
            card.describe();
        }
    }
// Here the method removes and returns the top card of the hand
    public Card flip() {
        if (!hand.isEmpty()) {
            return hand.remove(0);
        }
        return null;
    }
// the draw method takes a deck as an argument and calls the draw method 
// on the deck, adding the returned Card to the hand field
    public void draw(Deck deck) {
        Card drawnCard = deck.draw();
        if (drawnCard != null) {
            hand.add(drawnCard);
        }
    }

//In this method I am adding 1 to the players score field
    public void incrementScore() {
        score++;
    }

    public int getScore() {
        return score;
    }
}