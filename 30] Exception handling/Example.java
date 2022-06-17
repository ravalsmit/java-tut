//Exception handling is a way to handle the exceptions in Java.
//Exceptions in java are any abnormal, unexpected or erroneous events or extraordinary conditions 
     // that may occur during the execution of a program.
// java has some built-in exception handling mechanism in the form of catch.
// when the exceprtion situation occur, the controls are transferred to the catch block.- run time error message.
// what happen when the exception is occur java create an object and throw the exception 
     //to the catch block, and then the program ends
// what we can do now to write our own exception handling mechanism in java. 
     // benifit is our program is more robust and stable also not end in the middle of the program.
//four types of exception handling mechanism in java.
     //1. Default throw and default catch. // not need to work on it beacuse it is the default.
     //2. Default throw and our catch.
     //3. Our throw and default catch.
     //4. Our throw and our catch.

// handling is used to handle error conditions in a progam systematically by taking neccessary actions.

// class hierarchy of exception handling mechanism in java.
//                                            Throwable
//                                                |   
//                                         |             |
//                                       Error       Exception
//                                                         |
//                                         |               |               |
//                                    ioException     classnotfound   RUNTIME_Exception
//                                                                          |
//                                                       |                  |              |
//                                                illegelArgumentEx   NullPointerEx  ArithmaticEx
//                                                        |
//                                                  numberFormatEx

// Throwable is the super class of all the exception classes.
// provides a String variable that can be set by the subclass to provide a detail message that provide more
// information about the exception.

// All classes of Throwable define a one-parameter constructor that accepts a  String argument.
// the class Throwable provides getMessage() method that returns an Exception's message.

// Example: 
// 1. Default throw and default catch.
class Example
{
     public static void main(String[] args)
     { 
          String s1 = null;
          // System.out.println("Result is: " + (3 / 0)); // it will throw ArithmeticException.
          System.out.println("String length: " + s1.length()); // it will throw NullPointerException.
     } // end of main.
} // end of class.

// no error at compile time, beacuse our coding has no error.
// error at run time. and program end.
// output: 

// 1. Default throw and default catch.
// Exception in thread "main" java.lang.ArithmeticException: / by zero
// at Example.main(Example.java:38)

// Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null
// at Example.main(Example.java:41)