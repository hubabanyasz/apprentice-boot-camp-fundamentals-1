package cards;

public class PlayingCard {

    private final Suit suit;

    private final FaceValue faceValue;

    public PlayingCard (Suit suit, FaceValue faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    public FaceValue getFaceValue() {
        return faceValue;
    }

    public Suit getSuit() {
        return suit;
    }

}
