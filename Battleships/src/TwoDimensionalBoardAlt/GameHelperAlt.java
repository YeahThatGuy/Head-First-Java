package TwoDimensionalBoardAlt;

public class GameHelperAlt {

    private GameHelperAlt() {

    }

    public static final String intToString(int userInput) {
        String convertedLocation;
        switch (userInput) {
            case 0:     convertedLocation = "A";
                break;
            case 1:     convertedLocation = "B";
                break;
            case 2:     convertedLocation = "C";
                break;
            case 3:     convertedLocation = "D";
                break;
            case 4:     convertedLocation = "E";
                break;
            case 5:     convertedLocation = "F";
                break;
            case 6:     convertedLocation = "G";
                break;
            default:    convertedLocation = "Invalid range";
                break;
        }
        return convertedLocation;
    }
}