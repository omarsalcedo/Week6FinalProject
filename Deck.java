package finalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Here I make the class named Deck and create a list to hold the cards
class Deck {
    private List<Card> cards;
//Here I make the ArrayList cards and populate it with the suits in the deck
    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
//Here I make a nested for loop, in the first loop it creates a String variable named suit and goes
// through every suit in suits, in the second loop it checks if the value of that suit is between 2 and 14 
//then it takes the name of the card and adds the value and the suit to it then adds a new Card to the cards
// list using Card from the Card class.
        for (String suit : suits) {
            for (int value = 2; value <= 14; value++) {
                String name = value + " of " + suit;
                cards.add(new Card(value, name));
            }
        }
    }
//Here I make the method shuffle to shuffle the cards, it takes in the cards array and shuffles them 
    public void shuffle() {
        Collections.shuffle(cards);
    }
//Here I make the method draw which uses the cards form the cards class
// and if the list of cards is not empty it draws another card, removing a card for every draw
    public Card draw() {
        if (!cards.isEmpty()) {
            return cards.remove(0);
        }
        return null;
    }
}