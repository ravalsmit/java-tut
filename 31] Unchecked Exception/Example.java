// java devided Exception into two types: checked(Compile Time Exception) and unchecked (Runtime Exception).

// Unchecked Exception : any of its subclasses can be thrown as unchecked exception.
// ArrayIndexOfBoundsException, NullPointerException are subclass of the java.lang.RuntimeException which is subclass of the Exception.
// 2. Default throw and our catch.

// we have to use three keywords to handle the unchecked exception.
     // try {<code..>} 
     // catch(<exception type><parameter>){ 0 or more<Statements> } 
     // finally{ finally block <statements>}

class Example
{
     public static void main(String []args)
     {
          try
          {
               System.out.println("Result: " + (5/0)); // Throw Exception to the catch block.
               System.out.println("In try block"); // this statement will not be executed.
          }
          catch(NullPointerException e) 
          {// parent class 
               System.out.println("Exception: " + e.getMessage());
          }
          catch(ArithmeticException e) // more than catch can be used to handle multiple exceptions.
          { // child class
               System.out.println("Exception: " + e.getMessage());
          }
          finally // means finally run always.
          {
               System.out.println("In finally block");
          }
          System.out.println("In main"); // now this statement will be executed.
     } // end of main
} // end of class

// Output:
// Result: ArithmeticException: / by zero
// In main
// In finally block