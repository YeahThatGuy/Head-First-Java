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

            /*
            String firstLocationV;
            switch (firstLocationVInteger) {
                case 0:     firstLocationV = "A";
                    break;
                case 1:     firstLocationV = "B";
                    break;
                case 2:     firstLocationV = "C";
                    break;
                case 3:     firstLocationV = "D";
                    break;
                case 4:     firstLocationV = "E";
                    break;
                case 5:     firstLocationV = "F";
                    break;
                case 6:     firstLocationV = "G";
                    break;
                default:    firstLocationV = "Invalid range";
                    break;
            }

            String secondLocationV;
            switch (secondLocationVInteger) {
                case 0:     secondLocationV = "A";
                            break;
                case 1:     secondLocationV = "B";
                            break;
                case 2:     secondLocationV = "C";
                            break;
                case 3:     secondLocationV = "D";
                            break;
                case 4:     secondLocationV = "E";
                            break;
                case 5:     secondLocationV = "F";
                            break;
                case 6:     secondLocationV = "G";
                            break;
                default:    secondLocationV = "Invalid range";
                            break;
            }

            String thirdLocationV;
            switch (thirdLocationVInteger) {
                case 0:     thirdLocationV = "A";
                            break;
                case 1:     thirdLocationV = "B";
                            break;
                case 2:     thirdLocationV = "C";
                            break;
                case 3:     thirdLocationV = "D";
                            break;
                case 4:     thirdLocationV = "E";
                            break;
                case 5:     thirdLocationV = "F";
                            break;
                case 6:     thirdLocationV = "G";
                            break;
                default:    thirdLocationV = "Invalid range";
                            break;
            }
            */

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