package mysolutionCards;

import java.util.Scanner;

public class CardTest {

    public static void main(String[] args) {

        //Test the full deck
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of players: ");
        int playerNo = sc.nextInt();

        for (int instances = 1; instances <= playerNo; instances++) {

                System.out.print("Choose a rank for your card (6,7,8,9,10,J,Q,K,A): ");
                String testRank = sc.next();
                System.out.print("Choose a suit for your card (Diamonds,Clubs,Hearts,Spades): ");
                String testSuit = sc.next();

                Card testCard = new Card(testRank, testSuit);

                System.out.printf("Player %d You have a %s of %s%n", instances, testCard.getRank(), testCard.getSuit());
        }



        //Test a single card shared throughout the instances
        CardStatic testCardSharedOne = new CardStatic("Q", "Clubs");
        CardStatic testCardSharedTwo = new CardStatic("7", "Diamonds");

        //Use Class name to access the method; used the 1st object in order to show that the static variable
        //will get the last assigned value and use it for the whole class, irrespective of instance
        System.out.printf("Players, you share a %s of %s%n", testCardSharedOne.getRankStatic(), testCardSharedOne.getSuitStatic());

    }
}
