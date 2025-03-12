package cards;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SnapTest {

    @Test
    public void snapTest_usingAnimalCard() {
        AnimalCard card1 = new AnimalCard(Animal.AARDVARK);
        AnimalCard card2 = new AnimalCard(Animal.AARDVARK);
        AnimalCard card3 = new AnimalCard(Animal.HARE);
        assertThat(card1.snap(card2)).isTrue();
        assertThat(card1.snap(card3)).isFalse();
    }

    @Test
    public void snapTest_usingCard() {
        Card card1 = new AnimalCard(Animal.AARDVARK);
        Card card2 = new AnimalCard(Animal.AARDVARK);
        Card card3 = new AnimalCard(Animal.HARE);
        assertThat(card1.snap(card2)).isTrue();
        assertThat(card1.snap(card3)).isFalse();
    }
}