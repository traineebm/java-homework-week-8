package week8.java;

public class Point {
    int x;
    int y;
    // Declaring no argument constructor
    public Point(){

    }
    // Declaring parameterised constructor
    public Point( int x, int y){
        this.x = x;
        this.y = y;
    }
    //Declaring instance methods
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    //Method without parameters
    public double distance(){
        return distance(0,0);
    }
    //Method distance with parameters - returns distance btwn these points x, y
    public double distance(int x, int y){
        return Math.sqrt((x-this.x)*(x-this.x) + (y-this.y)*(y-this.y));
    }
    //Returns distance btwn this point & another point
    public double distance(Point another){
        return distance(another.x, another.y);
    }

    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0) = " + first.distance());
        System.out.println("distance(second) = " + first.distance(second));
        System.out.println("distance(2,2) = " + first.distance(2, 2));
        Point point = new Point(); System.out.println("distance() = " + point.distance());
    }
}
