/**************************************************
Chiming Wang
10/27/2023
AP Computer Science A - Weisswange Period 5
1.5.2 - Capitalize

Capitalize.java
**************************************************/

public class Capitalize {
   public static String capitalize(String str) {
      // use substrings to convert the first character to upper case and the rest to lower case
      return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase(); //directly return output string without assigning it to strings
   }

   // test program (hard coded)
   public static void main(String[] args) {
      String test = "bobBY";
      System.out.println("Original: \"" + test + "\" | Capitalized: \"" + capitalize(test) + "\"");
   }
}