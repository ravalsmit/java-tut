//14] Overloaing and OverRiding\Test.java
//if two methods of a class (whether both declared in the same class, or both inherited from a superclass) 
     //have the same name, but different signatures, then the one that is overridden is called an overLoading method.

//Method Overloading is a way to implement polymorphism in Java.
//Method Overloading is a way to define a method with the same name but different signatures.

//IN C++: known as overHiding : B overriding A
class A //A is a Super class for B.
{
     public void f1(int x)
     {
          System.out.println("Class A"); 
     } // end of f1()

     // public void f1(int x, int y)
     // {
     //      System.out.println("Class B");
     // }
} // end of class A

class B extends A // B extends A means B is a subclass of A
{
     // public void f1(int x)
     // {
     //      System.out.println("Class A");
     // }

     public void f1(int x , int y) // function overloading
     {
          System.out.println("Class B");
     } // end of f1()
} // end of class B

public class Test
{
     public static void main(String[] args)
     {
          B obj = new B(); // obj is an object of class B
          obj.f1(10); // function overloading is used here to call f1(one Parameter) method of class A
          obj.f1(10,20); // function overloading is used here to call f1(Two Parameter) method of class B
     } // end of main()
} // end of class Test

// Output:
// Class A
// Class B