//Constructor in inheritance
//Rule: Constructor are not inherited by subclass

// Sub class's constructor invokes constructor of super class.
// Explicit call to the super class consturctor can be made using super().
// You can write a subclass constructor that invokes the constructor of the superclass,
// Either implicitly or by using the keyword super.

class Parent
{
     int a;
     public Parent(int x)
     {
          a = x;
          System.out.println("Parent class constructor");
     }
}
class Child extends Parent
{
     int b;
     public Child()
     {
          super(10); // Exaplicit call to the super class constructor
          System.out.println("Child class constructor");
     }
}
class Example
{
     public static void main(String[] args)
     {
          Child c = new Child();
     }
}

// Output:
// Parent class constructor
// Child class constructor