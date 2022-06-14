//7] command_line_arguments.java
    //A java application can accept any number of arguments from the command line, args is an referece variable that refer to the array of 
        // strings that are passed to the application.
    // args[0] is the first argument, args[1] is the second argument, and so on, until args[n] is the last argument, 
        //where n is the number of arguments.

class Example {
    public static void main(String[] args) { // args is an array of strings.
        int s = 0; // s is the sum of all the arguments
        for(int i =0; i < args.length; i++) { // args.length is the number of arguments
            s = s + Integer.parseInt(args[i]); // parseInt is used to convert string to integer
        }// end for
        System.out.println("The sum of the arguments is " + s); // prints the sum of the arguments
    }// end main
}// end class Example

// Output: java Example 43 23 56 67
// The sum of the arguments is 189