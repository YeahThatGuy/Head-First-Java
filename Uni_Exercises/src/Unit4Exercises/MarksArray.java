package Unit4Exercises;

import java.util.ArrayList;

public class MarksArray {

    private int[] marks;

    public MarksArray(int[] marksArray) {
        marks = marksArray;
    }

    public void put(int index, int number) {
        marks[index] = number;
    }

    public int getMarks(int index) {
        if ((index <= marks.length - 1) && (index >= 0)) {
            return marks[index];
        }
        else {
            return -1;
        }
    }

    public int sizeOf() {
        return marks.length;
    }

    public double meanMark() {
        double mean = 0;
        int sum = 0;
        for (int cell : marks) {
            sum += cell;
        }
        mean = sum / (marks.length);
        return mean;
    }

    public void aboveAverage() {
        double mean = meanMark();
        for (int cell : marks) {
            if (cell > mean) {
                System.out.print(cell + " ");
            }
        }
        System.out.println();
    }

    public int numberOfPasses() {
        int passes = 0;
        for (int cell : marks) {
            if (cell >= 45) {
                passes++;
            }
        }
        return passes;
    }

    public int highestMark() {
        int largestSoFar = 0;
        for (int cell : marks) {
            if (cell > largestSoFar) {
                largestSoFar = cell;
            }
        }
        return largestSoFar;
    }

    public int getRange() {
        int largest = highestMark();
        int smallestSoFar = marks[0];
        for (int cell : marks) {
            if (cell < smallestSoFar) {
                smallestSoFar = cell;
            }
        }
        return largest - smallestSoFar;
    }

    public int bestStudent() {
        int highestMark = highestMark();
        int indextBestStudent = -1;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == highestMark) {
                indextBestStudent = i;
            }
        }
        return indextBestStudent;
    }

    public void listMarks() {
        for (int cell : marks) {
            System.out.print(cell + " ");
        }
        System.out.println();
    }

    public void assessMarks() {
        for (int cell : marks) {
            if (cell < 45) {
                System.out.println(cell + ": FAIL");
            }
            else if ((cell >= 45) && (cell < 75)) {
                System.out.println(cell + ": PASS");
            }
            else if (cell >= 75) {
                System.out.println(cell + ": DISTINCTION");
            }

        }
        System.out.println();
    }

}