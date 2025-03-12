package cards;

public class PlayingCardDeck extends CardDeck {

    PlayingCardDeck() {
        for (Suit suit : Suit.values()) {
            for (FaceValue faceValue : FaceValue.values()) {
                cards.add(new PlayingCard(suit, faceValue));
            }
        }
    }
}
