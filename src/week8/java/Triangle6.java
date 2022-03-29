package week8.java;

import java.util.Scanner;

public class Triangle6 {
    public static void main(String[] args) {
        Triangle6.number();
    }
    public static void number() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int number = in.nextInt();
        int i=1;
        while(i<=number){
            int j=1;
            while(j<=i){
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }


    }
}
