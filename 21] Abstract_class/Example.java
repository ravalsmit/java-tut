//Abstract Class: 
     //abstract classes are declared with the abstract keyword.
     //abstract classes cannot be instantiated.
// Java abstract classes are used to declare common characteristics of subclasses. 
// It can only be used as a superclass for other classes that extends the abstract class.

//                                Person : Abstract Class
//                                 /  \ 
//                                /    \
//                               /      \
//                              /        \
//                           Student    Professor   

// You can't make an object of the abstract class but you can make reference variable of the abstract class.
// Abstract Class Example:

abstract class Person
{
     private String name;
     private int age;
     public void setName(String name)
     {
          this.name = name;
     }
     public void setAge(int age)
     {
          this.age = age;
     }
     public String getName()
     {
          return name;
     }
     public int getAge()
     {
          return age;
     }
}
class Child extends Person
{
}
class Example
{
     public static void main(String []args)
     {
          // Person p = new Person(); //compiler error: abstract class cannot be instantiated.
          Person c = new Child();
          c.setName("John");
          c.setAge(20);
          System.out.println("Name: "+c.getName());
          System.out.println("Age: "+c.getAge());
     }
}

// Output:
// Name: John
// Age: 20