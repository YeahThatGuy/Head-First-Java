package OneDimensionalBoard;

import java.util.ArrayList;

public class SimpleDotComTestDrive {

    public static void main(String[] args) {

        SimpleDotCom dot = new SimpleDotCom();

        ArrayList<String> locations = new ArrayList<>();
        locations.add(Integer.toString(1));
        locations.add(Integer.toString(2));
        locations.add(Integer.toString(3));

        dot.setLocationCells(locations);

        String userGuess = "3";

        String result = dot.checkYourself(userGuess);

        String testResult = "failed";

        if (result.equals("hit")) {
            testResult = "passed";
        }

        System.out.println(testResult);

    }
}
