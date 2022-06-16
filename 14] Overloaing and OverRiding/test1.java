//Overriding: Overriding is the process of inheriting the behavior of a parent class 
     //and overriding it with the behavior of a child class.
// same signature: same name and same number of parameters.

// Why Overriding?
     //To provide a new implementation of an existing method

class A //Car
{
     public void f1(int x) // shiftGear() 
     {
          System.out.println("Class A"); 
     } // end of f1()

} // end of class A

class B extends A // SportsCar 
{
     public void f1(int x) // ShiftGear() to implement in different functionality means Overriding
     {
          System.out.println("Class B");
     } // end of f1()
} // end of class B

public class test1
{
     public static void main(String[] args)
     {
          B obj = new B();
          obj.f1(10);// only called f1(one Parameter) method of class B
          //does not call f1(two Parameter) method of class A
     } // end of main()
} // end of class Test

// Output:
// Class B