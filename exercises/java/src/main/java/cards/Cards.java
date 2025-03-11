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
        PlayingCard[] deck = new PlayingCard[52];

        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                Suit suitTemp = new Suit(Suit.convertName(suit));
                FaceValue faceValueTemp = new FaceValue(FaceValue.convertName(faceValue));
                deck[suit * 13 + faceValue] = new PlayingCard(suitTemp, faceValueTemp);
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
