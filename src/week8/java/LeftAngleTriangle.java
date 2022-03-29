package week8.java;

public class LeftAngleTriangle {
    public static void main(String[] args) {
        printLeftangleTriangle(5);
    }
    public static void printLeftangleTriangle(int a){
        for(int i=0; i<a+1; i++){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
