package cards;

public class FaceValue {

    private final String faceValueName;

    public FaceValue(String faceValueName) {
        this.faceValueName = faceValueName;
    }

    public String getFaceValueName() {
        return faceValueName;
    }

    public static String convertName(int faceValue) {
        switch (faceValue){
            case  0: return "ace";
            case  1:
            case  2:
            case  3:
            case  4:
            case  5:
            case  6:
            case  7:
            case  8:
            case  9: return Integer.toString(faceValue + 1);
            case 10: return "jack";
            case 11: return "queen";
            case 12: return "king";
            default: throw new IllegalArgumentException("Something went wrong " + faceValue + "is not a valid faceValue!");
        }
    }
}
