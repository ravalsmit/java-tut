// Interface : same as class declaration also it has variables and methods
// Interface just specify the methods declaration and can only contain fields
// same as abstract class interface also can not make an object of interface
// do not have constructors.

// syntax :
interface I {
	// interface body
     int x = 56; // public static final int x;
     void SomeFun(); // implicitly public and abstract
}
class A implements I
{
     public void SomeFun()
     {
          System.out.println("SomeFun");
     }
}

//Interface can do multiple inheritance
interface I1
{
     void fun();
}
interface I2
{
     void fun2();
}
class A1 implements I
{
     public void fun()
     {
          System.out.println("A");
     }
     public void fun2()
     {
          System.out.println("A2");
     }
     public void fun3()
     {
          System.out.println("A3");
     }
}

class Example
{
     public static void main(String[] args) {
          I1 obj = new A1(); // interface can make reference variable of class
          obj.fun(); 
          // obj.fun2(); // error
          // obj.fun3(); // error
     }
}

// interface J
// {
//      void fun1();
// }
// interface K extends I,J //'I,J' // possible to do multiple inheritance
// //but in inherirance cannot do that multiple inheritance....
// {
//      void fun2();
// }

//output:
// SomeFun
// A
// error
// error