package cards;

public class PlayingCard {

    private final int suit;

    private final int faceValue;

    public PlayingCard (int suit, int faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public int getSuit() {
        return suit;
    }

}
