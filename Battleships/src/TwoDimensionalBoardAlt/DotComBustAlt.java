//the difference between TwoDimensionalBoard.DotComBurst and this lies in the reduction of local variables
//they've been replaced by 2x ArrayList, one for vertical coordinates, the other for horizontal
//DotComs should not overlap, their historic locations are logged in locationsLog
package TwoDimensionalBoardAlt;

import java.util.ArrayList;
import java.util.Scanner;

public class DotComBustAlt {

    public static void main(String[] args) {

        int numOfGuesses = 0;
        int numberOfDotComs = 3;
        DotComAlt dot = new DotComAlt();
        ArrayList<String> locations = new ArrayList<>();
        ArrayList<Integer> locationsVertical = new ArrayList<>();
        ArrayList<Integer> locationsHorizontal = new ArrayList<>();
        ArrayList<String> locationsLog = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        restart:
        while (numberOfDotComs > 0) {
            dot = new DotComAlt();
            System.out.print("Name the DotCom: ");
            dot.setDotComName(sc.next());

            locationsVertical.add((int) (Math.random() * 7));
            locationsHorizontal.add((int) (Math.random() * 7));
            int directionChoice;

            if ((locationsVertical.get(0) <= 4) && (locationsHorizontal.get(0) <= 4)) {
                // 0 for down, 1 for right
                directionChoice = (int) (Math.random() * 2);
                if (directionChoice == 0) {
                    locationsVertical.add(locationsVertical.get(0) + 1);
                    locationsVertical.add(locationsVertical.get(0) + 2);
                    locationsHorizontal.add(locationsHorizontal.get(0));
                    locationsHorizontal.add(locationsHorizontal.get(0));
                } else {
                    locationsHorizontal.add(locationsHorizontal.get(0) + 1);
                    locationsHorizontal.add(locationsHorizontal.get(0) + 2);
                    locationsVertical.add(locationsVertical.get(0));
                    locationsVertical.add(locationsVertical.get(0));
                }
            }
            else if ((locationsVertical.get(0) > 4) && (locationsHorizontal.get(0) > 4)) {
                // 0 for up, 1 for left
                directionChoice = (int) (Math.random() * 2);
                if (directionChoice == 0) {
                    locationsVertical.add(locationsVertical.get(0) - 1);
                    locationsVertical.add(locationsVertical.get(0) - 2);
                    locationsHorizontal.add(locationsHorizontal.get(0));
                    locationsHorizontal.add(locationsHorizontal.get(0));
                } else {
                    locationsHorizontal.add(locationsHorizontal.get(0) - 1);
                    locationsHorizontal.add(locationsHorizontal.get(0) - 2);
                    locationsVertical.add(locationsVertical.get(0));
                    locationsVertical.add(locationsVertical.get(0));
                }
            }
            else if ((locationsVertical.get(0) > 4) && (locationsHorizontal.get(0) <= 4)) {
                // 0 for up, 1 for right
                directionChoice = (int) (Math.random() * 2);
                if (directionChoice == 0) {
                    locationsVertical.add(locationsVertical.get(0) - 1);
                    locationsVertical.add(locationsVertical.get(0) - 2);
                    locationsHorizontal.add(locationsHorizontal.get(0));
                    locationsHorizontal.add(locationsHorizontal.get(0));
                } else {
                    locationsHorizontal.add(locationsHorizontal.get(0) + 1);
                    locationsHorizontal.add(locationsHorizontal.get(0) + 2);
                    locationsVertical.add(locationsVertical.get(0));
                    locationsVertical.add(locationsVertical.get(0));
                }
            }
            else if ((locationsVertical.get(0) <= 4) && (locationsHorizontal.get(0) > 4)) {
                // 0 for down, 1 for left
                directionChoice = (int) (Math.random() * 2);
                if (directionChoice == 0) {
                    locationsVertical.add(locationsVertical.get(0) + 1);
                    locationsVertical.add(locationsVertical.get(0) + 2);
                    locationsHorizontal.add(locationsHorizontal.get(0));
                    locationsHorizontal.add(locationsHorizontal.get(0));
                } else {
                    locationsHorizontal.add(locationsHorizontal.get(0) - 1);
                    locationsHorizontal.add(locationsHorizontal.get(0) - 2);
                    locationsVertical.add(locationsVertical.get(0));
                    locationsVertical.add(locationsVertical.get(0));
                }
            }

            String firstLocationV = GameHelperAlt.intToString(locationsVertical.get(0));
            String secondLocationV = GameHelperAlt.intToString(locationsVertical.get(1));
            String thirdLocationV = GameHelperAlt.intToString(locationsVertical.get(2));

            //concatenate
            String firstLocation = firstLocationV + Integer.toString(locationsHorizontal.get(0));
            String secondLocation = secondLocationV + Integer.toString(locationsHorizontal.get(1));
            String thirdLocation = thirdLocationV + Integer.toString(locationsHorizontal.get(2));

            //check if DotComs overlap; if yes then randomise the initial location again
            for (String cell : locationsLog) {
                if (cell.equals(firstLocation) || (cell.equals(secondLocation) || (cell.equals(thirdLocation)))) {
                    continue restart;
                }
            }

            locations.add(firstLocation);
            locations.add(secondLocation);
            locations.add(thirdLocation);
            dot.setLocationCells(locations);

            locationsVertical.clear();
            locationsHorizontal.clear();

            locationsLog.add(firstLocation);
            locationsLog.add(secondLocation);
            locationsLog.add(thirdLocation);

            boolean isAlive = true;
            while (isAlive) {
                System.out.print("Enter your guess (A0 to G6: ");
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