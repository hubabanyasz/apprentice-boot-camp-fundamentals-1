package cards;

public interface CardDeck {

    void shuffle();

    String[] getCards();

    Card deal();

}
