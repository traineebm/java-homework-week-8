package week8.java;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
    PrimeNumber obj = new PrimeNumber();
    obj.primenum();
    }
    public void primenum(){
        int temp;
        boolean primeNumber = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        sc.close();

        for (int i = 2; i <= num/2; i++){
            temp = num%i;
            if (temp ==0){
                primeNumber = false;
                break;
            }
        }
         if (primeNumber){
             System.out.println(num + " is a prime number");
         } else{
             System.out.println(num + " is not a prime number");
         }
    }
}
