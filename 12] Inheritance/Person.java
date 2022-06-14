//12] Inheritance : Suppose I want create an entity called "Car".
     // so i make a class called Car.
     // and it has some properties like "color", "model", "price".
     // and it has some methods like "start", "stop", "drive".
     // but i want to also create an entity called "SportsCar".
     // so i make a class called SportsCar.
     // and it has some properties like "color", "model", "price", "speed", "gear", "fuel".
     // and it has some methods like "start", "stop", "drive", "accelerate", "decelerate".

// Syntax:
// public class SubClass extends SuperClass
//     // properties
//     // methods
// }

//Car Is a Super Class (Base Class in C++) and SportsCar Is a Sub Class (Derived Class in C++).
// not multiple inheritance in java
// private is not accessible in sub class but inherite in sub class.

public class Person {
     private int age;
     private String name;
     public void setAge(int age) {
          this.age = age;
     }
     public void setName(String name) {
          this.name = name;
     }
     public int getAge() {
          return age;
     }
     public String getName() {
          return name;
     }
}

//Single Inheritance : one time subclass of super class.
//Multiple Inheritance: subclass can inherit from multiple super classes.
//Hierarchical Inheritance : multiple time subclass of super class.