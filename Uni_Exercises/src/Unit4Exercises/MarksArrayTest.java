package Unit4Exercises;

public class MarksArrayTest {

    public static void main(String[] args) {

        int[] marksArray = {12, 45, 34, 78, 55, 63};
        MarksArray listOfNo = new MarksArray(marksArray);

        listOfNo.listMarks();
        listOfNo.put(0,14);
        listOfNo.listMarks();
        listOfNo.getMarks(5);
        listOfNo.sizeOf();
        listOfNo.assessMarks();
        listOfNo.meanMark();
        listOfNo.aboveAverage();
        listOfNo.numberOfPasses();
        listOfNo.highestMark();
        listOfNo.getRange();
        listOfNo.bestStudent();
    }
}
