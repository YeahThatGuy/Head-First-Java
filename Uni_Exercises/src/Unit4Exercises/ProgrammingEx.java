package Unit4Exercises;

import java.util.Arrays;

public class ProgrammingEx {

    int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public ProgrammingEx() {

    }

    public int monthLength (int monthNumber) {
        if (monthNumber <= monthDays.length) {
            return monthDays[monthNumber - 1];
        }
        else {
            return -1;
        }
    }

    public void marksInRange (int[] marks) {
        int[] counter = new int[4];

        for (int cell : marks) {
            if ((cell >= 0) && (cell <= 24)) {
                counter[0]++;
            }
            else if ((cell >= 25) && (cell <= 49)) {
                counter[1]++;
            }
            else if ((cell >= 50) && (cell <= 74)) {
                counter[2]++;
            }
            else if ((cell >= 75) && (cell <= 100)) {
                counter[3]++;
            }
            else {
                System.out.println("All the marks should be between 0 and 100.");
                break;
            }
        }
        System.out.println("Marks in range:");
        System.out.println("0 to 24: " + counter[0]);
        System.out.println("25 to 49: " + counter[1]);
        System.out.println("50 to 74: " + counter[2]);
        System.out.println("75 to 100: " + counter[3]);
    }

    public void numberOfVowels (String inputString) {
        int[] vowelCounter = new int[5];

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == 'a') {
                vowelCounter[0]++;
            }
            else if (inputString.charAt(i) == 'e') {
                vowelCounter[1]++;
            }
            else if (inputString.charAt(i) == 'i') {
                vowelCounter[2]++;
            }
            else if (inputString.charAt(i) == 'o') {
                vowelCounter[3]++;
            }
            else if (inputString.charAt(i) == 'u') {
                vowelCounter[4]++;
            }
        }
        System.out.println("There were: ");
        System.out.printf("%d A's %n", vowelCounter[0]);
        System.out.printf("%d E's %n", vowelCounter[1]);
        System.out.printf("%d I's %n", vowelCounter[2]);
        System.out.printf("%d O's %n", vowelCounter[3]);
        System.out.printf("%d U's %n", vowelCounter[4]);
    }


    public void printStars (String inputString) {
        int[] vowelCounter = new int[5];
        String[] starCounter = new String[5];
        Arrays.fill(starCounter, "");

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == 'a') {
                vowelCounter[0]++;
                starCounter[0] += "*";
            }
            else if (inputString.charAt(i) == 'e') {
                vowelCounter[1]++;
                starCounter[1] += "*";
            }
            else if (inputString.charAt(i) == 'i') {
                vowelCounter[2]++;
                starCounter[2] += "*";
            }
            else if (inputString.charAt(i) == 'o') {
                vowelCounter[3]++;
                starCounter[3] += "*";
            }
            else if (inputString.charAt(i) == 'u') {
                vowelCounter[4]++;
                starCounter[4] += "*";
            }
        }
        System.out.println(inputString);
        System.out.println("There were: ");
        System.out.printf("%d A's %s %n", vowelCounter[0], starCounter[0]);
        System.out.printf("%d E's %s %n", vowelCounter[1], starCounter[1]);
        System.out.printf("%d I's %s %n", vowelCounter[2], starCounter[2]);
        System.out.printf("%d O's %s %n", vowelCounter[3], starCounter[3]);
        System.out.printf("%d U's %s %n", vowelCounter[4], starCounter[4]);
    }

}
