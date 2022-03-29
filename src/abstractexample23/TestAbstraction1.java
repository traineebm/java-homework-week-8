package abstractexample23;
//in real scenario, method is called by programmer or user
 class TestAbstraction1 {
     public static void main(String args[]){
         Shape s = new Circle1(); // In a real scenario, object is provided through method,
            s.draw();                      //  e.g. getShape()method
     }

}
