package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PlayingCardDeck implements Iterable<PlayingCard>, CardDeck {

    private final List<PlayingCard> cards = new ArrayList<>();

    PlayingCardDeck() {
        for (Suit suit : Suit.values()) {
            for (FaceValue faceValue : FaceValue.values()) {
                cards.add(new PlayingCard(suit, faceValue));
            }
        }
    }

    public PlayingCard[] getDeck() {
        return cards.toArray(new PlayingCard[52]);
    }

    @Override
    public Iterator<PlayingCard> iterator() {
        return new PlayingCardIterator(cards.toArray(new PlayingCard[52]));
    }

    @Override
    public void shuffle() {
        Collections.shuffle(cards);
    }

    @Override
    public String[] getCards() {
        String[] result = new String[cards.size()];
        for (int i = 0; i < cards.size(); i++) {
            PlayingCard card = cards.get(i);
            result[i] = card.toString();
        }
        return result;
    }

    @Override
    public Card deal() {
        return cards.remove(0);
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