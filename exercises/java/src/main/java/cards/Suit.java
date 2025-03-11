package cards;

public class Suit {

    private final String name;

    public Suit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static String convertName(int suitId) {
        switch (suitId){
            case  0: return "clubs";
            case  1: return "diamonds";
            case  2: return "hearts";
            case  3: return "spades";
            default: throw new IllegalArgumentException("Something went wrong " + suitId + "is not a valid suitId!");
        }
    }

}
