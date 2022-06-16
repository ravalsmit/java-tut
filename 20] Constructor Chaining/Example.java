//Constructor Chaining: 
     //Constructor can call other constructors of the same class or superclass.
     //Constructor call from a constructor must be the fist step.
     //Such series of invocation of constructors is called constructor chaining.

class A
{
     public A()
     {
          System.out.println("A 1");
     }
}
class B extends A
{
     public B()
     {
          // super();//compiler writes super() before this line if we don't write super() here.
          this(4); //this(4) is a constructor call.
          System.out.println("B 1");
     }
     public B(int k)
     {
          System.out.println("B 2");
     }
}
class Example
{
     public static void main(String []args)
     {
          B b = new B();
     }
}

// Output:
// A 1
// B 2
// B 1