//16] This Keyword : This keyword is used to refer the current object. // Instance member variable of caller object
//help where local variable hides or shadows ,a field with the same name.

//if a method needs to pass the current object to another method, it can be done by using this reference.
//Note that the this reference cannot be used in a static context, as static code is not excuted in the context of any object.



class Box()
{
     private int l;
     private int b;
     private int h;
     public void setDimensions(int l, int b, int h) // Instance member Function of Box class
     {
          // l = l; // Local variable l hides or shadows a field with the same name.
          // b = b; // Local variable b hides or shadows a field with the same name.
          // h = h; // Local variable h hides or shadows a field with the same name.

          this.l = l; // This keyword is used to refer the current object b1
          this.b = b; // This keyword is used to refer the current object b1
          this.h = h; // This keyword is used to refer the current object b1

     } // end of setDimensions()
     public void sentBox()
     {
          GiftTaker gf = new GiftTaker();
          // gf.acceptGift(b1); // error: cannot access b1 because it is private
          gf.acceptGift(this); // This keyword is used to refer the current object b1
     }
} // end of class Box

class GiftTaker(
{
     public void acceptGift(Box b1)
     {
          System.out.println("Box dimensions: " + b1.l + "x" + b1.b + "x" + b1.h);
     }
} // end of class GiftTaker
public class Example
{
     public static void main(String[] args) // static member function of Example class
     {
          Box box = new Box();
          box.setDimensions(10, 20, 30);
          box.sentBox();
          System.out.println("Length: " + box.length);
          System.out.println("Breadth: " + box.breadth);
          System.out.println("Height: " + box.height);
     } // end of main()
} // end of class Example

// Output:
// Length: 10
// Breadth: 20
// Height: 30