package cards;

public class Cards {
    public static void main(String[] args) {
        CardDeck deck = new PlayingCardDeck();

        for (String card : deck.getCards()) {
            System.out.println(card);
        }
    }
}