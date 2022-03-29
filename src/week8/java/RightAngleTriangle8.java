package week8.java;

public class RightAngleTriangle8 {
    public static void main(String[]args){
    RightAngleTriangle8.symbol();
    }

    public static void symbol(){
        int a,b, row, column;
        row = 5;
        column = 5;
        for (a=0; a<row; a++){
            for (b=0; b<=a; b++){
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
