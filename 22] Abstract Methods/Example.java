//Abstract Methods: abstract class can include methods that contain no implementation. These are called abstract methods.
// The Abstract method declaration must then end with a semicolon rather than a block.

// if a class has any abstract methods, whether declared or inherited,
     //the entire class must be declared abstract

// class Person
// {
//      abstract void show(); // error: abstract method must have abstract keyword in class
// }

abstract class Person
{
     abstract void show(); 
}

class Student extends Person // error: abstract method inherited from abstract class
{
     void show()
     {
          System.out.println("Hello");
     }
}
class Example
{
     public static void main(String []args)
     {
          Person s = new Student(); // error: cannot create an object of abstract class
          s.show();
     }
}

// Output:
// Hello