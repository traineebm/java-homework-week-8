package week8.java;

import java.util.Scanner;

public class ArmstrongNumber10 {
    public static void main(String[] args) {
    ArmstrongNumber10.number();
    }
    public static void number(){
        int num1, num2, temp, total = 0;
        Scanner t = new Scanner(System.in);
        System.out.print("Input any three digit number: ");
        num1 = t.nextInt();
        num2 = num1;

        for ( ; num2 !=0; num2 /=10){
            temp = num2 % 10;
            total = total + temp*temp*temp;
        }
        if (total ==num1) {
            System.out.println(num1 + " is an Armstrong number");
        } else {
            System.out.println(num1 + " is  not an Armstrong number");
        }
    }
}
