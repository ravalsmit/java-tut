//11] Constructor - Constructor is a member (function) method that is used to create an object, or instance of a class.
//same name as class name and no return type (void).
//also not mandatory to have a constructor.
//if there is no constructor, compiler will create a default constructor.
//Construtor can be overloaded and parameterized.
//why Constructor Use? 
     // Constructor make object to a real object..........

     
public class Box
{
     private int l,b,h;
     //compiler Constructor - default constructor - no argument
     public Box()
     { } //default constructor
     public Box()
     {
          l = 10; b = 8; h =4;
     } // constructor without argument
     public Box(int L, int B, int H) // Constructor OverLoading - with argument (L,B,H)
     {    
          this.l = L; this.b = B; this.h = H; //this. is used to access the variable of the same class
     } // constructor with argument
     public static void main(String []args)
     {
          Box b1 = new Box(); // Construtor call when object is created.
          Box b2 = new Box(10,20,30); // by parameter to store what i want to store not by defalut
          System.out.println(b1.l + " " + b1.h + " " + b1.b);
          System.out.println(b2.l + " " + b2.h + " " + b2.b);
     }
}

// Output:
// 10 4 8
// 10 20 30