// Thread : thread is an independent path of execution within a program.
// Many threads can run concurrently within a program.
// Multithreading refers to two or more tasks executing concurrently within single program.

// Every thread in java is created and controlled by the java.lang.Thread class.
// we have attach code to thread.
// there are two ways to create thread in java:
// Implementing the runnable interface(java.lang.Runnable)
// By extending the Thread class(java.lang.Thread)

// Objective : Create Thread -> Attach code to the thread -> Excuting thread
// Code:

// public interface Runnable()
// {
//     void run();
// }

//1] using Runnable Interface

class A implements Runnable {
     public void run() // 3] Code
     {
          int i;
          for (i = 0; i < 10; i++)
               System.out.print("Thread A " + i);
     }
}

class B implements Runnable {
     public void run() {
          int i;
          for (i = 0; i < 10; i++)
               System.out.print("Thread B " + i);
     }
}

public class Example {
     public static void main(String[] args) {
          Thread t1 = new Thread(new A()); // 1] Thread Object -> 2] Pass Your Class A obj
          Thread t2 = new Thread(new B());
          t1.start(); // 4] Start the thread.
          t2.start();
     }
}

// 2] using Thread Class

class A extends Thread {
     public void run() {
          int i;
          for (i = 0; i < 10; i++) {
               System.out.println("Thread A " + i);
          }
     }
}

class B extends Thread {
     public void run() {
          int i;
          for (i = 0; i < 10; i++) {
               System.out.println("Thread B " + i);
          }
     }
}

class Example {
     public static void main(String[] args) {
          A o1 = new A(); // create thread o1
          B o2 = new B(); // create thread o2
          o1.start(); // start the thread fun -> run()
          o2.start(); // start the thread fun -> run()
     }
}