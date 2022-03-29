package week8.java;

public class SharedDigit13 {
    public static void main(String[] args) {
        System.out.println(hasShareDigit(12,23));
        System.out.println(hasShareDigit(9,99));
        System.out.println(hasShareDigit(15,55));
    }

    public static boolean hasShareDigit(int x, int y){
        if (x<10 || x>99 || y<10 || y>99) {
            return false;
        }
        int xlastDigit = x % 10;
        int ylastDigit = y % 10;
            x /= 10;
            y /= 10;
            int xfirstDigit = x;
            int yfirstDigit = y;

            return ((xfirstDigit == yfirstDigit) || (xfirstDigit == ylastDigit) || (xlastDigit == yfirstDigit) || (xlastDigit == ylastDigit));
        }
    }

