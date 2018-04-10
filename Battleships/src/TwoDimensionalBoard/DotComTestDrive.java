package TwoDimensionalBoard;

import java.util.ArrayList;

public class DotComTestDrive {

    public static void main(String[] args) {

        DotCom dot = new DotCom();

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
