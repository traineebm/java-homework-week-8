package week8.java;

public class FibonacciNumber {
    public static void main(String[] args) {
        FibonacciNumber.number();
    }

    public static void number() {
        int maxNumber = 8;
        int previousNumber = 1;
        int nextNumber = 1;
        System.out.print("Fibonacci series of " + maxNumber + " numbers: ");
        for (int i = 1; i <= maxNumber; ++i) {
            System.out.print(previousNumber + "  ");

            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;

        }
    }
}