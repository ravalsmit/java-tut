// 9] import is a Keyword in Java
    //import is used to import the classes from other packages.
package pack1;
import pack2.Student;
public class Example {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setRollNo(100);
        s1.setName("Smith");
        System.out.println("Roll No: " + s1.getRollNo());
        System.out.println("Name: " + s1.getName());
    }
}

// Output:
// Roll No: 100
// Name: Smith