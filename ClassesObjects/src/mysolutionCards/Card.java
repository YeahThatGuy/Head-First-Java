package mysolutionCards;

public class Card {

    private String rank;
    private String suit;

    public Card(String rank, String suit) {
        if (rank.matches("6|7|8|9|10|J|Q|K|A")) {
            this.rank = rank;
        } else {
            this.rank = null;
        }
        if (suit.matches("Diamonds|Clubs|Hearts|Spades")) {
            this.suit = suit;
        } else {
            this.suit = null;
        }
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }
}
