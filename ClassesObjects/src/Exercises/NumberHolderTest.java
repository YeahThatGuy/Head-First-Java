package Exercises;

import java.util.Scanner;

public class NumberHolderTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int intValue = sc.nextInt();
        System.out.print("Enter a float number: ");
        float floatValue = sc.nextFloat();

        NumberHolder defHolder = new NumberHolder(intValue, floatValue);

        System.out.printf("Your object holds an integer of %d and a float of %f", intValue, floatValue);
    }
}
