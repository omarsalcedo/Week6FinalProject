package finalProject;

public class App {
			
		//In this main method I instantiate a Deck and two Players
		    public static void main(String[] args) {
		        Deck deck = new Deck();
		        Player player1 = new Player("Michael");
		        Player player2 = new Player("Dwight");

		// I call the shuffle method on the deck
		        deck.shuffle();
		        
		// Using a for loop, I iterate 52 times calling the 
		// Draw method on the other player each iteration using the Deck I instantiated
		        for (int i = 0; i < 52; i++) {
		            player1.draw(deck);
		            player2.draw(deck);
		        }

		// Using a for loop, I iterate 26 times and call the flip method for each player
		        for (int i = 0; i < 26; i++) {
		            Card card1 = player1.flip();
		            Card card2 = player2.flip();

		//Here I compare the value of each card returned by the two player’s flip methods and 
		// Call the incrementScore method on the player whose card has the higher value.           
		            card1.describe();
		            card2.describe();

		            if (card1.getValue() > card2.getValue()) {
		                player1.incrementScore();
		                System.out.println("Michael wins this round");
		            } else if (card2.getValue() > card1.getValue()) {
		                player2.incrementScore();
		                System.out.println("Dwight wins this round");
		            } else {
		                System.out.println("It's a draw this round");
		            }
		// This line creates a new blank line in the console to separate the rounds
		            System.out.println();
		        }

		//  I compare the final score from each player here        
		        int player1Score = player1.getScore();
		        int player2Score = player2.getScore();

		// Here I print the final score of each player and either Player 1 (Michael, Player 2(Dwight, 
		// or “Draw” depending on which score is higher or if they are both the same.        
		        System.out.println("Final scores:");
		        System.out.println("Michael: " + player1Score);
		        System.out.println("Dwight: " + player2Score);

		        if (player1Score > player2Score) {
		            System.out.println("Michael wins!");
		        } else if (player2Score > player1Score) {
		            System.out.println("Dwight wins!");
		        } else {
		            System.out.println("Draw!");
		        }
		    }
		}		