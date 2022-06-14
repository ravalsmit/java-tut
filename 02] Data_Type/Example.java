//2] Data_types and Keywords

//set of values and a set of operations that transform these values intp other values of that set
//java is strongly typed language : primitive data types and user defined data types
//primitive data types : int, float, double, char, boolean, short, long, byte
//user defined data types : String, ArrayList, HashMap, etc.

// Primitive Data Type :
     //1. byte : 8 bit integer ( -128 to 127 ) ( -2^7 to 2^7 - 1 ) ( 0 to 255 ) ( 0 to 2^8 - 1 ) 
     //2. short : 16 bit integer ( -32,768 to 32,767 ) ( -2^15 to 2^15 - 1 ) ( 0 to 2^16 - 1 )
     //3. int : 32 bit integer ( -2,147,483,648 to 2,147,483,647 ) ( -2^31 to 2^31 - 1 ) ( 0 to 2^32 - 1 )
     //4. long : 64 bit integer ( -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 ) ( -2^63 to 2^63 - 1 ) ( 0 to 2^64 - 1 )
     //5. float : 32 bit floating point number ( -3.4E38 to 3.4E38 ) ( -2^31 to 2^31 - 1 ) ( 0 to 2^32 - 1 )
     //6. double : 64 bit floating point number ( -1.7E308 to 1.7E308 ) ( -2^63 to 2^63 - 1 ) ( 0 to 2^64 - 1 )
     //7. boolean : true or false
     //8. char : 16 bit Unicode character ( 0 to 65,535 ) ( 0 to 2^16 - 1 )

// Reference Type :
     //1. Array : sequence of objects of same type ( ex : int[] )
     //2. Class : class type ( ex : class_name ) 
     //3. Interface : interface type ( ex : interface_name )
     //4. Object : object type ( ex : object_name )
     //5. String : sequence of characters ( ex : "string" )
     
public class Example
{ 
    public static void main(String[] args) {
          // Example of a basic data type
          // int, float, double, char, String
          int counter = 123L; // decimal ''234, hexadecimal '0x'2321, octal '0'177, binary '0b'01010101 
          float data = 340; // float is a single-precision 32-bit IEEE 754 floating point number.
          double temp = 123.23; // double is a double-precision 64-bit IEEE 754 floating point number.
          String name = "Smith"; // String is a sequence of characters.
          int[] ages = new int[10]; // Array is a sequence of objects.
          char letters[] = {'a','b','c','d','e','f','g','h','i','j'}; // Array of characters.

          System.out.println("counter = " + counter);
          System.out.println("data = " + data);
          System.out.println("temp = " + temp);
          System.out.println("name = " + name);
          System.out.println("ages = " + ages);
          System.out.println("letters = " + letters);
    } // end main
} // end class basic

// Output:
// counter = 123
// data = 340.0
// temp = 123.23
// name = Smith
// ages = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
// letters = [a, b, c, d, e, f, g, h, i, j]