package cards;

import java.util.Iterator;

public class PlayingCardDeck implements Iterable<PlayingCard> {

    private PlayingCard[] deck = new PlayingCard[52];

    PlayingCardDeck () {
        int cardNumber = 0;
        for (Suit suit : Suit.values()) {
            for (FaceValue faceValue : FaceValue.values()) {
                deck[cardNumber] = new PlayingCard(suit, faceValue);
                cardNumber++;
            }
        }
    }

    public void addCard(PlayingCard card, int index) {
        deck[index] = card;
    }

    public PlayingCard[] getDeck() {
        return deck;
    }

    @Override
    public Iterator<PlayingCard> iterator() {
        return new PlayingCardIterator(deck);
    }

    private static class PlayingCardIterator implements Iterator<PlayingCard> {
        private int currentIndex = 0;
        private final PlayingCard[] cards;

        public PlayingCardIterator(PlayingCard[] cards) {
            this.cards = cards;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < cards.length && cards[currentIndex] != null;
        }

        @Override
        public PlayingCard next() {
            return cards[currentIndex++];
        }
    }
}