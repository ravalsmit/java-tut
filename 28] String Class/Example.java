// String Class : String class is a class that represents a sequence of characters.
// A java.lang.String class is final which implies that it cannot be extend.
// String class is imutable which means that it cannot be changed on same on the reference variable.
// cannot expanded in run time.
// Creating an object of String class is done by using the new keyword.

// String str = new String("John");

// **** Example 2:
// String str = "John";
// String str1 = "John";
// String str2 = "Jo" + "hn"; // + is concatenation operator
// NOTE : So, all the string reference str, str1, str2 are pointing to same object. 


//Creating Object with new keyword
     // String str = new String("John");
     // this implies that every time creating new string 
     // even if the string character sequence is same
import java.lang.String; // Importing the String class from java.lang package.

class Example
{
     public static void main(String[] args)
     {
          String str = "Doe"; // creating an object of String class.
          String str1 = "Doe";
          String str2 = "Lee";
          String str3 = new String("Doe"); // creating an object of String class.
          System.out.println("str : " + str); // printing the string.
          System.out.println("str1 : " + str1); 
          System.out.println("str == str1 : " + (str == str1)); // true
          System.out.println("str2 : " + str2); 
          System.out.println("str3 : " + str3); 
          System.out.println("str == str3 : " + (str == str3)); // false
          System.out.println("str == str3 : " + (str.equals(str3))); // true
     } // end of main method.
} // end of class.

// Output:
// str : Doe
// str1 : Doe
// str == str1 : false
// str2 : Lee
// str3 : Doe
// str == str3 : false
// str == str3 : true