//10] Java Access Modifiers: 
     // java access modifiers are used to control the access of the members of a class, interface, or enum.

     //supports: public, private, protected, default.
     //public: accessible everywhere.
     //private: accessible only within the class.
     //protected: accessible within the package and subclasses.
     //default: accessible only within the package.

public class Example { // Outer class : can public or default.

     class Dummy { // Inner Class : can public or private or protected or default.
          public void print() {
               System.out.println("Dummy");
          }
     }
}
// public class Hello {} // error: that can only be public class in java file.

// output:
// Dummy