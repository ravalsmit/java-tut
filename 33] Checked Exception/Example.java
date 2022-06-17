// Checked Exception : (Compile time Exception)

// checked exception forces programmers to deal with the exception that may be thrown.
// IOException, SQLException, IllegalArgumentException, etc are checked exceptions.
// "Checkded" means they will be checked at compile time itself.

     // A checked exception is caught at compile time whereas a runtime or unchecked 
// exception is, as it states, at runtime. A checked exception must be handled either by 
// re-throwing or with a try catch block, whereas an unchecked isn't required to be handled

// throws : a throws clause can be used in the method prototype
// Syntax:
// Method() throws <ExceptionType1> , ..., <ExceptionTypeN>
// { }

import java.io.*;

public class Example
{
     public static void main(String []args) // throws IOException
     {
          // throw new IOException(); // without a try catch block, this will throws clause.
          // System.out.println("After throwing exception");

          try{
               throw new IOException(); // with a try catch block.
               // System.out.println("After throwing exception");
          } // try block
          catch(IOException e)
          {
               System.out..println("Exception: " + e.getMessage());
          } // catch block
     } // end main method
} // end Example class

// Output: without try and catch and throws clause.
// .\Example.java:23: error: unreachable statement

// try and catch and throws clause Output:
// no exception