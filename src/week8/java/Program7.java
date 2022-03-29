package week8.java;

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
        Program7.sumFirstAndLastDigit(0);

    }
    public static int sumFirstAndLastDigit(int number){
     //   Scanner sc = new Scanner(System.in);

        //  int sum = sc.nextInt(0);

        if (number <0){
            return -1;
        }
        int lastDigit = 0;
        lastDigit = number % 10;
        while(number >=10){
            number /=10;
        }
        return (number +lastDigit);
    }
}
