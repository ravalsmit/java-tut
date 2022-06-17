// Array : is a collection of similar data types, which are stored in contiguous memory locations.
// int arr[5]; // in c and c++
// int arr[]; // arr is reference variable to an array. 
// reference variable is a variable that stores the address of another variable.
// int arr[] = new int[5]; // in java
// int[] arr = new int[]; 
// length of an array is the number of elements in the array.

//Diagram:
     // int[] a = new int[4];

     //              index    0   1   2   3 
     // | --- |            |-----------------|
     // |  a  |  ----->    || 0 | 0 | 0 | 0 || 
     // | --- |            |-----------------|

class Example // Example class to demonstrate the use of arrays
{    
     public static void main(String[] args) // main method
     {
          int[] arr = new int[6]; //creating an array of 6 elements
          // we are creating using new keyword . Default value of an array is 0.
          // int arr[] = new int[2]{2,3,4}; // error : size > than the length of the array
          // int arr[] = new int[5]{2,3,4,5,6}; // error : cannot intialize size and initialize the array together
          // int arr[] = {2,3,4,5,6}; // valid 
          for(int i=0;i<=5;i++) //initializing the array elements
               arr[i] = i; //assigning values to the array
          for(int i=0;i<=5;i++)
               System.out.print(arr[i] + " "); //printing the array]
          System.out.println(arr.length); //printing the length of the array
     }// end of main
} // end of class

// Representation of an array in Java
// index     0   1   2   3   4   5
//         -------------------------
//         | 0 | 1 | 2 | 3 | 4 | 5 | //array elements
//         -------------------------

// Output : 0 1 2 3 4 5