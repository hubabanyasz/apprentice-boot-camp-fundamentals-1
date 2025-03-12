package cards;

public class PlayingCard extends Card {

    private final Suit suit;

    private final FaceValue faceValue;

    PlayingCard(Suit suit, FaceValue faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    private FaceValue getFaceValue() {
        return faceValue;
    }

    @Override
    public String toString() {
        return faceValue + " of " + suit;
    }

    @Override
    boolean snap(Card otherCard) {
        return otherCard instanceof PlayingCard && this.getFaceValue().equals(((PlayingCard) otherCard).getFaceValue());
    }
}