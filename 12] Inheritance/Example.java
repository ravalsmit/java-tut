public class Example {
    public static void main(String[] args) {
     Student s1 = new Student(); // create an object of Student class
     s1.setRollNo(1); // set rollNo of s1 to 1
     s1.setName("John"); // set name of s1 to "John"
     s1.setAge(20); // set age of s1 to 20
     System.out.println("Student Roll No: " + s1.getRollNo()); // print rollNo of s1
     System.out.println("Student Name: " + s1.getName()); // print name of s1
     System.out.println("Student Age: " + s1.getAge()); // print age of s1
    } // end of main 
} // end of class Example

// Output:
// Student Roll No: 1
// Student Name: John
// Student Age: 20