//15] final keyword : final variable can't be changed after initialization in java
//final keyword used in java five times : 1) final instance variable 2) final static variable 3) final local variable 4) final method 5) final class

//1] final Instance Variable :- final instance variable can't be changed after initialization

public class Example
{
     // private int a; //instance member variable // value of a is 0
     private final int b; //final instance member variable // value of b is blank
     // only intialize once
     // final keyword intialize three ways: 1) private final int b = 20 2) in Constructor 3) in Intialization block
     
     { //initialization block
         b = 20;
     }
     
     Example() //constructor
     {
         b = 10;
     }

     public void display() // 3] final lecal variable example: 
     {
          // int k; //local variable
          final int k; //final local variable : must intialize before use
          k = k + 10; //error: k is not defined
     }
     public static void main(String[] args)
     {
          Example e1 =new Example();
     }
}

//2] final static Variable :- final static variable can't be changed after initialization

//final static variable intialize three ways: 1) private final static int b = 20 2) in Intialization block

public class Example1
{
     private static int b; //static member variable // value of b is 0
     private static final int b; //final static member variable // value of b is blank
     
     static
     { //initialization block
         b = 20;
     }

     public static void main(String[] args)
     {
          Example1 e1 =new Example1();
     }
}

// 4] Final class :- final class can't be extended: means you cannot make there child classe: means Restrict Inheritance
// class DUMMY
final class DUMMY //final class
{
     public static void main(String[] args)
     {
          Example1 e1 =new Example1();
     } //error: class DUMMY cannot be extended
} //error: DUMMY is final class

// 5] final methods :- final method can't be overridden: means you cannot make there child method: means Restrict Overriding

class dummy
{
     void final sumFun() //non-final method
     {
          // Some code
     }
} 
class moredummy extends dummy
{
     void sumFun() //final method
     {
          // Some code
     } // error: sumFun is final method
}
