package OneDimensionalBoard;

import java.util.ArrayList;

public class SimpleDotCom {

    private ArrayList<String> locationCells;
    private int numOfHits = 0;
    private int lastGuess = 999;

    public void setLocationCells(ArrayList<String> locs) {
        locationCells = locs;
    }

    public String checkYourself (String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";

        int index = locationCells.indexOf(stringGuess);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }
        System.out.println(result);
        return result;
    }

}
