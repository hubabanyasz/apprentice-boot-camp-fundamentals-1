package cards;

public class Cards {
    public static void main(String[] args) {
        Cards cards = new Cards();
        String[] deckInOrder = cards.getCards();

        for(String card: deckInOrder){
            System.out.println(card);
        }
    }

    public String[] getCards() {
        String[] result = new String[52];
        PlayingCardDeck deck = new PlayingCardDeck();

        int cardNumber = 0;
        for (PlayingCard card : deck) {
            result[cardNumber] = card.getFaceValue().getName() + " of " + card.getSuit().getName();
            cardNumber++;
        }

        return result;
    }
}
