//String Method :

// toUpperCase() : Returns a string whose value is this string converted to uppercase, if it is not null.
// toLowerCase() : Returns a string whose value is this string converted to lowercase, if it is not null.

// indexOf(int ch) : Returns the index within this string of the first occurrence of the specified character.
// indexof(int ch, int fromIndex) : Returns the index within this string of the first occurrence of the specified character, starting the search at the specified index.
// indexOf(String str) : Returns the index within this string of the first occurrence of the specified substring.
// indexOf(String str, int fromIndex) : Returns the index within this string of the first occurrence of the specified substring, starting the search at the specified index.

// lastIndexOf(int ch) : Returns the index within this string of the last occurrence of the specified substring.
// lastIndexof(int ch, int fromIndex) : Returns the index within this string of the last occurrence of the specified substring, searching backward from the specified index.
// lastIndexOf(String str) : Returns the index within this string of the last occurrence of the specified substring.
// lastIndexOf(String str, int fromIndex) : Returns the index within this string of the last occurrence of the specified substring, searching backward from the specified index.

// equals : Returns true if and only if this string represents the same sequence of characters as the specified object.
// equalsIgnoreCase (String anotherString) : Returns true if and only if this string represents the same sequence of characters as the specified object, ignoring case.
// compareTo (String s) : Compares two strings lexicographically.

// substring(int beginIndex) : Returns a string that is a substring of this string.
// substring(int beginIndex, int endIndex) : Returns a string that is a substring of this string.
class Example
{
     public static void main(String []args)
     {
          String s1 = new String("Computer");
          System.out.println("s1 : " + s1);
          s1.toUpperCase(); // returns "COMPUTER"
          System.out.println("s1 upper : " + s1); 
          String s2 = s1.toUpperCase();
          System.out.println("s2 upper : " + s2);
          s2 = s1.toLowerCase(); // returns "computer"
          System.out.println("s2 lower : " + s2);
          s2 = indexOf(s1, 'o'); // returns 2
          System.out.println("s2 Indexof(int ch): " + s2);
          s2 = indexOf(s1, 'o', 3); // returns 4
          System.out.println("s2 Indexof(int ch, int fromIndex): " + s2);
          s2 = indexOf(s1, "om"); // returns 2
          System.out.println("s2 Indexof(String str): " + s2);
          s2 = indexOf(s1, "om", 3); // returns 4
          System.out.println("s2 Indexof(String str, int fromIndex): " + s2);
          s2 = lastIndexOf(s1, 'o'); // returns 6
          System.out.println("s2 lastIndexof(int ch): " + s2);
          s2 = lastIndexOf(s1, 'o', 3); // returns 2
          System.out.println("s2 lastIndexof(int ch, int fromIndex): " + s2);
          s2 = lastIndexOf(s1, "om"); // returns 6
          System.out.println("s2 lastIndexof(String str): " + s2);
          s2 = lastIndexOf(s1, "om", 3); // returns 2
          System.out.println("s2 lastIndexof(String str, int fromIndex): " + s2);
          s2 = equals(s1, "Computer"); // returns true
          System.out.println("s2 equals(String anotherString): " + s2);
          s2 = equalsIgnoreCase(s1, "computer"); // returns true
          System.out.println("s2 equalsIgnoreCase(String anotherString): " + s2);
          s2 = compareTo(s1, "Computer"); // returns 0
          System.out.println("s2 compareTo(String s): " + s2);
          s2 = substring(s1, 2); // returns "mputer"
          System.out.println("s2 substring(int beginIndex): " + s2);
          s2 = substring(s1, 2, 4); // returns "mpt"
          System.out.println("s2 substring(int beginIndex, int endIndex): " + s2);
     }
}

// Output:
// s1 : Computer
// s1 upper : COMPUTER
// s2 upper : COMPUTER
// s2 lower : computer
// s2 Indexof(int ch): 2
// s2 Indexof(int ch, int fromIndex): 4
// s2 Indexof(String str): 2
// s2 Indexof(String str, int fromIndex): 4
// s2 lastIndexof(int ch): 6
// s2 lastIndexof(int ch, int fromIndex): 2
// s2 lastIndexof(String str): 6
// s2 lastIndexof(String str, int fromIndex): 2
// s2 equals(String anotherString): true
// s2 equalsIgnoreCase(String anotherString): true
// s2 compareTo(String s): 0
// s2 substring(int beginIndex): mputer
// s2 substring(int beginIndex, int endIndex): mpt