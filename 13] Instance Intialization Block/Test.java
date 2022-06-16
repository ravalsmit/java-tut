//13] Instance and Static Initialization Block - Test.java

//Instance Intialization Block: x = 0
//Constructor: x = 5

// it run when the object is created and it is called before the constructor.
// if you have multiple instance intialization block, it will run in the order of the block
// if you have multiple constructor, it will run in the order of the constructor.
// there is no return type in the instance intialization block.
// but we can use this and super in the instance intialization block, refer to current object.

// Static Intialization Block: k = 0
// Constructor: k = 10

// it run when the class is loaded before class execution.
// if you have multiple static intialization block, it will run in the order of the block
// only run once, it is called before the constructor.
// cannot use this and super and return keyword in the static intialization block. 
public class Test
{
     private int x;
     private static int k;

     { // Instance Intialization Block
          System.out.println("Instance Intialization Block: x = " + x);
          x = 5;
     } // Instance Intialization Block
     
     static // Static Intialization Block
     {
          System.out.println("Static Intialization Block: k = " + k);
          k = 10;
     }
     public Test()
     {
          System.out.println("Constructor: x = " + x + "\n");
          System.out.println("Constructor: k = " + k + "\n");
     }
     public static void main(String[] args)
     {
          Test t1 = new Test();
          Test t2 = new Test();
     }
}

// Output:
// Instance Intialization Block: x = 0
// Static Intialization Block: k = 0

// Constructor: x = 5
// Constructor: k = 10

// Instance Intialization Block: x = 0

// Constructor: x = 5
// Constructor: k = 10