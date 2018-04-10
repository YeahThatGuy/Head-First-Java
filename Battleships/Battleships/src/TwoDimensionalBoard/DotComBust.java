    package TwoDimensionalBoard;

    import java.util.ArrayList;
    import java.util.Scanner;

    public class DotComBust {

        public static void main(String[] args) {

            int numOfGuesses = 0;

            DotCom dot = new DotCom();

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
            }
            else {
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

            String firstLocationV = GameHelper.intToString(firstLocationVInteger);
            String secondLocationV = GameHelper.intToString(secondLocationVInteger);
            String thirdLocationV = GameHelper.intToString(thirdLocationVInteger);

            //concatenate
            String firstLocation = firstLocationV + Integer.toString(firstLocationH);
            String secondLocation = secondLocationV + Integer.toString(secondLocationH);
            String thirdLocation = thirdLocationV + Integer.toString(thirdLocationH);

            ArrayList<String> locations = new ArrayList<>();
            locations.add(firstLocation);
            locations.add(secondLocation);
            locations.add(thirdLocation);
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