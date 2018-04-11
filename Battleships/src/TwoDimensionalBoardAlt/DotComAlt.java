package TwoDimensionalBoardAlt;

import java.util.ArrayList;

public class DotComAlt {

    private ArrayList<String> locationCells;
    private int numOfHits = 0;
    private String name;

    public DotComAlt() {
    }

    public void setDotComName (String name) {
        this.name = name;
    }

    public void setLocationCells (ArrayList<String> locs) {
        locationCells = locs;
    }

    public String checkYourself (String stringGuess) {
        String result = "miss";

        int index = locationCells.indexOf(stringGuess);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.printf("You sunk %s%n", name);
            } else {
                result = "hit";
            }
        }
        System.out.println(result);
        return result;
    }

}