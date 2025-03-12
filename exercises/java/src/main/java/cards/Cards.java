package cards;

import java.util.stream.Stream;

public class Cards {
    public static void main(String[] args) {
        Cards cards = new Cards();
        String[] deckInOrder = cards.getCards();

        for (String card : deckInOrder) {
            System.out.println(card);
        }
    }

    public String[] getCards() {
        String[] result = new String[52];
        PlayingCardDeck deck = new PlayingCardDeck();

        Stream.of(deck.getDeck())
                .map(PlayingCard::toString)
                .toArray(size -> result);

        return result;
    }
}