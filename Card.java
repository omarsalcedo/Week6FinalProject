package finalProject;


//Here I create the class named Card, and create the variables named value (to hold the cards) and the name of the card.
class Card {
    private int value;
    private String name;
//Here I am giving the Card the value and the name that are passed in through the variables 
    public Card(int value, String name) {
        this.value = value;
        this.name = name;
    }
//Here I get the the value of the variable value
    public int getValue() {
        return value;
    }
//Here I get the value of the variable name
    public String getName() {
        return name;
    }

    public void describe() {
        System.out.println(name);
    }
}