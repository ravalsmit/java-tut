//in inheritance, subclass object when call an instance member function of subclass only, function contains 
//implicit reference variables this and super both reffering to the current object(Object of subclass).

//they only different in this and super is 
     //this reference variable is of subclass type // B class Type ka hai
     //super reference variable is of superclass type // A class Type ka hai

// if your method override one of this superclass's methods, you can invoke the superclass version of the method
// through the use of keyword super.

//it avoids name conflict between member variables of superclass and subclass

class A
{
     // int x;
     int z;
     public void f1()
     {
     }
}

class B extends A
{
     // int y;
     int z;
     public void f1() { // there will no static member function
          // this super
          super.f1();
     }
     public void f2()
     {
          int z;
          z = 2;
          // y = 3;
          this.z = 3;
          // x = 4;
          super.z = 4;
     }
}

public class Example
{
     public static void main(String[] args)
     {
          B obj = new B();
          obj.f1(); // call method of Class B
          System.out.println(obj.z); // call method of Class B
          obj.f2(); // call method of Class B
          System.out.println(obj.z); // call method of Class B
     }
}

// Output:
// 0
// 3