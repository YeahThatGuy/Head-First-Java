public class InsertionSort {

    public static void main(String[] args) {

        int[] testArray = new int[10];

        System.out.print("Default: ");
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = (int) (Math.random() * 100);
            System.out.print(testArray[i] + " ");
        }


        System.out.print("Insertion sort: ");
        int x = 0;
        for (int i = 0; i < testArray.length; i++) {
            if ((i < testArray.length-1) && (testArray[i] > testArray[i+1])) {
                x = testArray[i];
                testArray[i] = testArray[i+1];
                testArray[i+1] = x;

                for (int j = i; j > 0; j--) {
                    if (testArray[j] < testArray[j-1]) {
                        x = testArray[j-1];
                        testArray[j-1] = testArray[j];
                        testArray[j] = x;
                    }
                }
            }
        }

        for (int cell : testArray) {
            System.out.print(cell + " ");
        }


    }

}
