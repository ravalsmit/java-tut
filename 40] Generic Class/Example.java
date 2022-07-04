//Generic Class :  

class MyData<T> { // more than one placeholder
     T i;

     public void add(T i1) {
          i = i1;
     }

     public T get() {
          return (i);
     }
}

public class Example {
     public static void main(String[] args) {
          MyData<Integer> m1 = new MyData<Integer>();
          MyData<String> m2 = new MyData<String>();
          m1.add(5);
          m2.add("Rahul");
          System.out.println("m1 : " + m1.get());
          System.out.println("m2 : " + m2.get());
     }
}