// Inner Class : just like methods, variables of the class too can have another class as its member.
// The class written within is called the nested class. The class that holds the inner class is called the outer class.

// Inner class can be two types : static inner class and non static inner class.
// You can make object of inner class without outer class object.

class Outer // Outer Class
{
     // int x = 10;
     static int x = 10;

     static class Inner // class inner (non static class) //can be private and protected
     { // static inner class
          void Fun() {
               // System.out.println("Fun()" + x); // beacuse non static can use outer class
               // "any" member variable
               System.out.println("Fun()" + x); // can use static member variable of Outer class but not Instance member
                                                // variable.
          }
     }
}

public class Example {
     public static void main(String[] args) {
          // Outer Out = new Outer();
          // Outer.Inner o1 = out.new Inner(); // for non - static inner class
          Outer.Inner o1 = new Outer.Inner(); // only create in static inner class
          o1.Fun();
     }
}