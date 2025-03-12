package cards;

public class PlayingCard implements Card {

    private final Suit suit;

    private final FaceValue faceValue;

    public PlayingCard(Suit suit, FaceValue faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    public FaceValue getFaceValue() {
        return faceValue;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return faceValue + " of " + suit;
    }

    @Override
    public boolean snap(Card otherCard) {
        return otherCard instanceof PlayingCard && this.getFaceValue().equals(((PlayingCard) otherCard).getFaceValue());
    }
}