// Garbage Collection : to delete the dynamic memory block.
// to get rid of the memory leak.
// free space <---> Consumed space
// in C++ keyword is New. -> Create an dynamic memory for the object in run time.
// Student *p = new Student();
// in C++ keyword is Delete. -> delete the object which store the value by the pointer.

// accomplished by JVM.
// Student s1 = new Student(); -> java delete it when s1 is not refernce to the student obj.
// what happened? 
// JVM create three thread : main thread(User Thread) -> Thread Schedular(run in background) -> garbage Collection Therad(run in the background)

// we can forces fully call garbage collection fun? -> it is in form of the request
// System.gc() or RunTime.getRunTime().gc() 

//finalize method : Execetion in finilised garbage collector ignore it.
class OA {
     public OA() // Constructor
     {
          System.out.print("Print OA");
     }

     public void function() {
          // some code...
     }

     @Override
     protected void finalize() throws Throwable {
          finalize();
          // super.finalize(); // call Object class Finilised Function....
     }
}

public class Example {
     public static void main(String[] args) {
          OA o1 = new OA();
          o1.function(); // some operation...
     }
}