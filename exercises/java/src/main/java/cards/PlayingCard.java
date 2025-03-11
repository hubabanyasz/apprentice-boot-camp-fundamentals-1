package cards;

public class PlayingCard {

    private final Suit suit;

    private final int faceValue;

    public PlayingCard (Suit suit, int faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public Suit getSuit() {
        return suit;
    }

}
