package TwoDimensionalBoardAlt;

import java.util.ArrayList;
import java.util.Scanner;

public class DotComBustAlt {

    public static void main(String[] args) {

        int numOfGuesses = 0;
        int numberOfDotComs = 3;
        DotComAlt dot = new DotComAlt();
        ArrayList<String> locations = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (numberOfDotComs > 0) {
            dot = new DotComAlt();
            System.out.print("Name the DotCom: ");
            dot.setDotComName(sc.next());

            int firstLocationVInteger = (int) (Math.random() * 7);
            int firstLocationH = (int) (Math.random() * 7);
            int secondLocationVInteger = 0;
            int thirdLocationVInteger = 0;
            int secondLocationH = 0;
            int thirdLocationH = 0;
            int directionChoice;
            if (((firstLocationVInteger >= 0) && (firstLocationVInteger <= 4)) && ((firstLocationH >= 0) && (firstLocationH <= 4))) {
                // 0 for down, 1 for right
                directionChoice = (int) (Math.random() * 2);
                if (directionChoice == 0) {
                    secondLocationVInteger = firstLocationVInteger + 1;
                    thirdLocationVInteger = firstLocationVInteger + 2;
                    secondLocationH = firstLocationH;
                    thirdLocationH = firstLocationH;
                } else {
                    secondLocationH = firstLocationH + 1;
                    thirdLocationH = firstLocationH + 2;
                    secondLocationVInteger = firstLocationVInteger;
                    thirdLocationVInteger = firstLocationVInteger;
                }
            } else {
                // 0 for up, 1 for left
                directionChoice = (int) (Math.random() * 2);
                if (directionChoice == 0) {
                    secondLocationVInteger = firstLocationVInteger - 1;
                    thirdLocationVInteger = firstLocationVInteger - 2;
                    secondLocationH = firstLocationH;
                    thirdLocationH = firstLocationH;
                } else {
                    secondLocationH = firstLocationH - 1;
                    thirdLocationH = firstLocationH - 2;
                    secondLocationVInteger = firstLocationVInteger;
                    thirdLocationVInteger = firstLocationVInteger;
                }
            }

            String firstLocationV = GameHelperAlt.intToString(firstLocationVInteger);
            String secondLocationV = GameHelperAlt.intToString(secondLocationVInteger);
            String thirdLocationV = GameHelperAlt.intToString(thirdLocationVInteger);

            //concatenate
            String firstLocation = firstLocationV + Integer.toString(firstLocationH);
            String secondLocation = secondLocationV + Integer.toString(secondLocationH);
            String thirdLocation = thirdLocationV + Integer.toString(thirdLocationH);

            locations.add(firstLocation);
            locations.add(secondLocation);
            locations.add(thirdLocation);
            dot.setLocationCells(locations);

            boolean isAlive = true;
            while (isAlive) {
                System.out.print("Enter your guess: ");
                String userGuess = sc.next();
                String result = dot.checkYourself(userGuess);
                numOfGuesses++;

                if (result.equals("kill")) {
                    isAlive = false;
                }
            }

            numberOfDotComs--;
        }
        System.out.println("You took " + numOfGuesses + " guesses.");
    }
}