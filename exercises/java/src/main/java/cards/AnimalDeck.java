package cards;

class AnimalDeck extends CardDeck {

    AnimalDeck() {
        for (Animal animal : Animal.values()) {
            cards.add(new AnimalCard(animal));
            cards.add(new AnimalCard(animal));
        }
    }

}
