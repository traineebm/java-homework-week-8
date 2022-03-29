package week8.java;

public class Program11 {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
        Program11.getEvenDigitSum(0);
    }
    public static int getEvenDigitSum(int number){
        int EvenDigitSum =0;
        int lastDigit = 0;
        if (number < 0)
            return -1;
        while(number!=0){
            lastDigit = number % 10;

            if (lastDigit % 2 ==0)
                EvenDigitSum += lastDigit;
            number /= 10;
        }
        return EvenDigitSum;
    }
    }

