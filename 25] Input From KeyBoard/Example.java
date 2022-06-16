// Input from the keyboard
// we can read java input from System.in using Scanner class
// Scanner is final class, that is can not be extended : cant be Inherited
// Scanner class is part of java.util package 
// Scanner breaks the input into tokens, using a delimiter pattern
// which by default is whitespace
// System.in is the input stream from keyboard
// which connects to the keyboard and Buffer.
// The resulting tokens may then be converted into values of different types
// using the various next methods of the Scanner class.

import java.util.Scanner;

public class Example
{
     public static void main(String[] args)
     {
          System.out.println("Enter your name");
          Scanner sc = new Scanner(System.in);
          String name = sc.nextLine();
          System.out.println("Enter your age");
          int age = sc.nextInt();
          System.out.println("Your name is " + name);
          System.out.println("Your age is " + age);
     }
}
// Output:
// Enter your name
// John
// Enter your age
// 25
// Your name is John
// Your age is 25


//Methods in the Scanner class
// next() : reads the next token from the input stream
// nextLine() : reads the next line from the input stream
// nextBoolean() : reads the next boolean from the input stream
// nextByte() : reads the next byte from the input stream
// nextChar() : reads the next char from the input stream
// nextDouble() : reads the next double from the input stream
// nextFloat() : reads the next float from the input stream
// nextInt() : reads the next integer from the input stream
// nextLong() : reads the next long from the input stream
// nextShort() : reads the next short from the input stream
// hasNext() : returns true if the next token in the input stream can be read
// hasNextLine() : returns true if the next line in the input stream can be read
// close() : closes the input stream