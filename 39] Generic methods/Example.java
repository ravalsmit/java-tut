// Generic Methods : in c++ templete and in java generic methods
// if we have some printarray fun that print every type of array.

// We can write a single generic function declaration that can be with arguments of different types.
// <E> is a placehilder, means in the binding process will decide what type of Arguments is. 

// Rule: 
// only denoted in <> and can replace with void and we can declare more than one generic method...
// Type Parameter can represent only reference types, not premitive types, (like int, float, etc...)
// public class Example {

// public void printArray(String []s)
// {
// for(int i = 0; i < s.length; i++)
// System.out.println(s[i]);
// }

// public void printArray(Integer []n)// method overraloding
// {
// for(int i = 0; i < n.length; i++)
// System.out.println(n[i]);
// }

public class Example {

     public <E> void printArray(E[] a) {
          for (E x : a) // for each loop : only for array
               System.out.println("" + x);
     }

     public static void main(String[] args) {
          Example e1 = new Example();
          String name[] = new String[] { "India", "Nepal", "USA" };
          e1.printArray(name); // print Indaia Nepal USA
          Integer number[] = { 12, 23, 45, 645 };
          e1.printArray(number); // print 12 23 45 645
     }
}