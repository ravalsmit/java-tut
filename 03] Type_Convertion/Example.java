// 3] type_conversion.java

// comment style in java: //, /* */, ///* */, /* // */
    // single line comment: //
    // multi line comment: /* */
    // documentation comment: /** */
    // javadoc comment: /** */

// type conversion:
    // Widening conversion:
        // byte -> short -> int -> long -> float -> double
        // char -> int -> long -> float -> double
        // boolean -> int -> long -> float -> double
   
    // Narrowing conversion:
        // float to int (downgrade)
        // double to float (downgrade)
        // long to double (downgrade)
        // int to long (downgrade)
        // short to int (downgrade)
        // byte to short (downgrade)
        // char to int (downgrade)

public class Example {
    public static void main(String[] args) {
        int x = 23; // int is a 32-bit signed two's complement integer.
        float y = x; // x is converted to float
        float z = 34.5; // error - cannot convert float to int
        float a = 54.5f;
        int s = (int) z; // z is converted to int
        int b = (int) a; // a is converted to int

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
        System.out.println(s);
        System.out.println(b);
    } // end main
} // end class type_conversion

// Output:
// 23
// 23.0
// 34.5
// 54.5
// 34
// 54