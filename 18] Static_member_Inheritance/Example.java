//Static members in inheritance
//error: it is a compile-time error if a static method hides an instance method
//it's a compile time error if an instance method overrides a static method

//static member variable can't be inherit it only possible that hides...
class Parent
{ // if the Parent function is instance function then overriding and 
     // if it's static then it hideen by class B.
     public static void f1()
     {
          System.out.println("hello");
     }
}
class Child extends Parent
{
     public static void f1() // this hides the parent f1()
     {
          System.out.println("hi");
     }
}
class Example
{
     public static void main(String []args)
     {
          Child.f1();
     }
}

// Output:
// hi