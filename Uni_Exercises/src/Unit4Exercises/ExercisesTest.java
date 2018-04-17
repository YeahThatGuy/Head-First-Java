package Unit4Exercises;

public class ExercisesTest {

    public static void main(String[] args) {
        ProgrammingEx testProgrammingEx = new ProgrammingEx();

        int resultMonthLength = testProgrammingEx.monthLength(2);
        int[] testMarks = {15, 20, 49, 59, 80, 90, 10, 100};
        String sentence = "There is a wolf in the woods";

        System.out.println(resultMonthLength);
        testProgrammingEx.marksInRange(testMarks);
        testProgrammingEx.numberOfVowels(sentence);
        testProgrammingEx.printStars(sentence);


    }

}