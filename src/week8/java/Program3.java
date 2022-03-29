package week8.java;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        alphabets();
    }
    public static void alphabets() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any letter from aA to zZ: ");
        String letter = sc.next();
        // checking the length
        if (letter.length() == 1) {
            letter = letter.toLowerCase(); //converting letter to lowercase

            if (letter.compareTo("a") >= 0) { // letter is an alphabet and not a number or character

                if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) {
                    System.out.println(letter + " is a Vowel");
                } else {
                    System.out.println(letter + " is a Consonant");
                }  //output decision end
            } else {
                System.out.println(letter + " is an invalid character");
            }
        } else {
            System.out.println(letter + " is invalid. You might have entered multiple letters");
        }
    }  //my method ends here

} // class ends here