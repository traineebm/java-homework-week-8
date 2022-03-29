package week8.java;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the number of rows in pattern:" + "\t");
        int number = num.nextInt();
        diamond(number);
    }

    public static void diamond(int number) {
        int i = 1;
        number = number / 2 + 1;
        int raw = number;

        while (i < number) {
            int j = 1;
            while (j <= raw - 1) {
                System.out.print("");
                j++;
            }
            j = 1;
            while (j < +i * 2 - 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
            raw--;
        }
        raw = number;
        i = 1;
        while (i <= number) {
            int j = 1;
            while (j <= i - 1) {
                System.out.print(" ");
                j++;
            }
            j = 1;
            while (j <= raw * 2 - 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
            raw--;
        }

    }

}
