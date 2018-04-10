package OneDimensionalBoard;

import java.util.Scanner;
import java.util.ArrayList;

public class SimpleDotComGame {

    public static void main(String[] args) {

        int numOfGuesses = 0;

        SimpleDotCom dot = new SimpleDotCom();

        int firstLocation = (int) (Math.random() * 5);
        int secondLoc = firstLocation + 1;
        int thirdLoc = firstLocation + 2;
        ArrayList<String> locations = new ArrayList<>();
        locations.add(Integer.toString(firstLocation));
        locations.add(Integer.toString(secondLoc));
        locations.add(Integer.toString(thirdLoc));
        dot.setLocationCells(locations);

        Scanner sc = new Scanner(System.in);

        boolean isAlive = true;
        while (isAlive) {
            System.out.print("Enter your guess: ");
            String userGuess = sc.next();
            String result = dot.checkYourself(userGuess);
            numOfGuesses++;

            if (result.equals("kill")) {
                    isAlive = false;
                    System.out.println("You took " + numOfGuesses + " guesses.");
            }
        }

    }
}
