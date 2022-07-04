// File handling : Example.java

// Recall : Data(any piece of information) a,b,n;
// Data persistence(does have to exsist in the variable)(have lifetime)
// File(need for after process get the result of variable in file system)
// File handling(need to organize the file: oprations on file system)

// Program is intially in the harddrive but in process enter into the ram.

// The java.io package contains nearly every class you might ever need to perform as input and output in Java.

// All these streams represent an input source and an output destination. java provides stringbut flexiable 
// support for i/o related to Files.

//Stream : Streams represent a source and a destination. support huge range of source and destination including
//  disk files,arrays, other device files, and other programs.

// Two types of streams are supported: byte(basic row sequence : 0101010) streams
// character(data is character(collection of bytes)) streams 

// File Class: an abstract representation of a file and directory pathnames.(stores metadata of the file)

//1] Simple File Class

import java.io.*;

public class Example
{
     public static void main(String[] args) throws IOException
     {
          File f1 = new File("C:/Users/test.txt");
          f1.createNewFile(); // create a new file
          System.out.println("Can file Read : " + f1.canWrite());
          System.out.println("is exists : " + f1.exists());
          System.out.println("File name : " + f1.getName());
          System.out.println("length of File : " + f1.length());
          f1.delete();
     }
}

// 2] FileInputStream and FileOutputStream in java

import java.io.*;

class Example 
{
   public static void main(String args[]) throws IOException 
   {
          File file = new File("G:/programs/test.txt");
          FileInputStream inputStream = new FileInputStream(file);
          byte bytes[] = new byte[(int) file.length()];
          int numOfBytes = inputStream.read(bytes);
          System.out.println("Copy Successfully...");
          FileOutputStream outputStream = new FileOutputStream("G:/programs/test1.txt");
          outputStream.write(bytes);
          System.out.println("Write Successfully...");
   }
}

// 3] BufferedWriter and BufferedReader

import java.io.*;

public class Example {
     public static void main(String[] args) {
          try {
               FileWriter fw = new FileWriter("C:\\Temp\\TestFile.Txt");
               BufferedWriter WriteFileBuffer = new BufferedWriter(fw);
               WriteFileBuffer.write("First Line");
               WriteFileBuffer.newLine();
               WriteFileBuffer.write("Second Line");
               WriteFileBuffer.newLine();
               WriteFileBuffer.write("Third Line");
               WriteFileBuffer.newLine();
               WriteFileBuffer.close();
               FileReader fr = new FileReader("C:\\Temp\\TestFile.txt");
               BufferedReader ReadFileBuffer = new BufferedReader(fr);
               System.out.println(ReadFileBuffer.readLine());
               System.out.println(ReadFileBuffer.readLine());
               System.out.println(ReadFileBuffer.readLine());
               ReadFileBuffer.close();
          } catch (IOException Ex) {
               System.out.println(Ex.getMessage());
          }
     }
}