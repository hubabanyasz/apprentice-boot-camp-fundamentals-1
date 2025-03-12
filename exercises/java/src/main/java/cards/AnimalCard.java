package cards;

public class AnimalCard extends Card {

    private final Animal animal;

    AnimalCard(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return animal.toString();
    }

    @Override
    boolean snap(Card otherCard) {
        return otherCard instanceof AnimalCard && this.animal.equals(((AnimalCard) otherCard).animal);
    }
}
