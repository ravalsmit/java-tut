//6] wrpper_class.java

//Wrapper Class : 
    //java is 99% oop language and as said in the book, java is a object oriented language.
    //but, what about the primitive data types? there are sort of the object that cant be participate in the object activity.
    //so, java has wrapper classes that can be used to wrap the primitive data types.

//Classes :
    //boolean : Boolean // boolean is a wrapper class that can wrap the primitive data type boolean. // Boolean is the class name.
    //byte : Byte // byte is a wrapper class that can wrap the primitive data type byte. // Byte is the class name.
    //char : Character // char is a wrapper class that can wrap the primitive data type char. // Character is the class name.
    //short : Short // short is a wrapper class that can wrap the primitive data type short. // Short is the class name.
    //int : Integer // int is a wrapper class that can wrap the primitive data type int. // Integer is the class name.
    //long : Long // long is a wrapper class that can wrap the primitive data type long. // Long is the class name.
    //float : Float // float is a wrapper class that can wrap the primitive data type float. // Float is the class name.
    //double : Double // double is a wrapper class that can wrap the primitive data type double. // Double is the class name.

//example :
    //Boolean b = new Boolean(true); // b is a object of the class Boolean.
    //Byte b = new Byte((byte)10); // b is a object of the class Byte.
    //Character c = new 'Character'('a'); // c is a object of the class Character.
    //Short s = new Short((short)10); // s is a object of the class Short.
    //Integer i = new 'Integer'(10); // i is a object of the class Integer.
    //Long l = new Long(10); // l is a object of the class Long.
    //Float f = new Float(10.0); // f is a object of the class Float.
    //Double d = new Double(10.0); // d is a object of the class Double.

//useful methods :
    //valueOf() : static method.
    //parseXXX() : static method.
    //xxxValue() : Instance method.
    //equals() : Instance method.
    //hashCode() : Instance method.
    //toString() : Instance method.
    //compareTo() : Instance method.
    //compare() : static method.


public class Exmaple {
    public static void main(String[] args) {
        // wrapper class
        Integer i1 = Integer.valueOf("101001001", 2 /* base */); // returns 10 as an int value
        Double d1 = Double.valueOf("3.14"); // returns 3.14 as a double value
        int a = Integer.parseInt("123"); // returns 123 as an int value
        double b = Double.parseDouble("123.45"); // returns 123.45 as a double value
        int x = i1.intValue(); // returns 329 as an int value
        int we = d1.intValue(); // returns 3 as an int value 
        System.out.println(we);
        System.out.println(x);
        System.out.println(a);
        System.out.println(b);
    } // end main
} // end wrapper_class

