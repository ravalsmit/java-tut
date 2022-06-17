// 2D array:

class Example
{
     public static void main(String[] args)
     {
          int[][] arr = new int[2][3]; // arr is a reference variable to a 2D array.       
          // int arr[][];
          // int [][]arr; // valid
          // int [][]arr = new int[2][3]; // arr is a reference variable to a 2D array.
          // int [][]arr = new int[][]; // error
          // int [][]arr = new int[][3]; // error
          // int [][]arr = new int[2][]; // not error
          for(int i=0;i<2;i++) // 2 rows
          {
               for(int j=0;j<3;j++) // 3 columns
               {
                    arr[i][j] = i*3+j;
               } // end of inner for
          } // end of outer for

          for(int i=0;i<2;i++) // 2 rows
          {
               for(int j=0;j<3;j++) // 3 columns
               {
                    System.out.print(arr[i][j] + " ");
               } // end of inner for
               System.out.println();
          } // end of outer for
     }
}

// Output:
// 0 1 2
// 3 4 5