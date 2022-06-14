//5] static_members.java

// In Java, static members are members that belong to the class itself, and not to any instance of the class.
// Static members variables are shared by all objects of the class, if it is private then it can't be accessed by any object.
// Static member functions are called by class name, not by object name.

public class Example1
{
     int x = 10; // instance variable
     static int y; // static member variable, default value is 0, static variable is shared by all object
     // if static variable is private then it can't be accessed by any object
     // then we have to access the static variable using statuc member function
     public void fun1() { 
          static int z; // error : static member variable cannot be declared inside a method
     }// instance member method
     public static void fun2() {
          x = 10; // error : instance member variable cannot be accessed inside a static method
          y = 20; // not error : static member variable can be accessed inside a static method
     } // static member method

     static class Test
     {
          public static String Country = "India"; // static variable inside a static class
     }
}
public class Example
{
     // can make static inner class
     static class Test { }
     public static void main(String[] args) {
          Example1 obj1 = new Example1();
          Example1 obj2 = new Example1();
          Example.y = 10;
          Example.fun2();
          System.out.println(Example1.x);
          System.out.println(Example1.y);
          // access country variable using static class
          System.out.println(Example1.Test.Country);
     }
}

// Output:
// 10
// 10
// India