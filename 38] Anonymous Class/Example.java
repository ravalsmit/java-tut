// A Inner Class Which Declared without having a className.
// Anonymous class always a child class and Inner class.
// Late Binding : Ovverriden Function.
class Greeting {
     void sayHello() {
          System.out.print("Hello");
     }
}

class India {
     Greeting g = new Greeting() {
          void sayHello() {
               System.out.println("Namaste");
          }
     };
}

public class Example {
     public static void main(String[] args) {
          India india = new India();
          india.g.sayHello(); // no error -> print Namaste
     }
}

// output:
// Namaste