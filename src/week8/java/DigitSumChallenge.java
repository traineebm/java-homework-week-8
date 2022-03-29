package week8.java;


public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println("Sum of 125 is = " + sumDigits(125));
        System.out.println("Sum of 1 is =" + sumDigits(1));

    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int sumDigits = 0;
        String numberToString = Integer.toString(number);
        for (char c : numberToString.toCharArray()) {
            sumDigits += Integer.parseInt(String.valueOf(c));
        }
        return sumDigits;
    }
}