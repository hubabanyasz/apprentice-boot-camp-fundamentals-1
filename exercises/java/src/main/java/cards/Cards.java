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

        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                Suit currentSuit = new Suit(Suit.convertName(suit));
                FaceValue currentFaceValue = new FaceValue(FaceValue.convertName(faceValue));

                deck.addCard(new PlayingCard(currentSuit, currentFaceValue),suit * 13 + faceValue);
            }
        }

        int cardNumber = 0;
        for (PlayingCard card : deck) {
            result[cardNumber] = card.getFaceValue().getFaceValueName() + " of " + card.getSuit().getName();
            cardNumber++;
        }

        return result;
    }
}
