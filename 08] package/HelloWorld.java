// 8] packages.java : packages are nothing more than the way we organize our files into folders according to our needs.
     //Files in one folder or directory (or package) would have different functionality and would be used by different directories.
     //example: java.io is the package that contains the classes that are used to read and write files.
     //example: java.util is the package that contains the classes that are used to perform various tasks.
     //example: java.lang is the package that contains the classes that are used to represent the basic data types.
     //example: java.net is the package that contains the classes that are used to access the internet.

// avoid name conflicts with other packages
// ease in mantanace of code, organization and collaboration among developers

//how to create a package
     //suppose we have a file called HelloWorld.java and we want to create a package called world.
     //we need to create a folder called world and put HelloWorld.java file inside it.

package world; //this is the package name and it is the name of the folder that we created.
public class HelloWorld {
     public static void main(String[] args) {
          System.out.println("Hello World");
     } // end of main
} // end of class

//compile the file : javac -d . HelloWorld.java
//run the file : java -cp . world.HelloWorld or java world.HelloWorld 
//Output: Hello World

//NOTE ::--> :: Every java file has only one public class. This class is the entry point to the program. 