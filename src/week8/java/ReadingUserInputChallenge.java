package week8.java;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        ReadingUserInputChallenge.number();
    }

    public static void number() {
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        int sum = 0;

        //enter any number until 10 counts
        while (counter <= 10) {
            System.out.print("Enter number #: ");
            boolean validNumber = sc.hasNextInt();
            if (validNumber) {
                int number = sc.nextInt();
                sum += number;
                counter++;
            } else {
                System.out.print("Invalid number");
            }
            // Always return new userInput
            sc.nextLine();
        }
        System.out.print("Sum of all numbers = " + sum);
        sc.close();
    }
}
