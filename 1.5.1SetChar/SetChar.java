/**************************************************
Chiming Wang
10/25/2023
AP Computer Science A - Weisswange Period 5
1.5.1 - setChar

SetChar.java
**************************************************/

public class SetChar {

   // method that uses a string as replacement
   public static String setChar(String str, int index, String ch) {
      // if the String "ch" isn't exactly one character in length, the method just returns the original string and doesn't run
      if (ch.length() != 1) { 
         return str;
      }
      
      // calls the char version of the method ("don't forget, it is quite legal to do one of your two methods by calling the other one")
      return setChar(str, index, ch.charAt(0));
   }

   // method that uses a char as replacement
   public static String setChar(String str, int index, char ch) {
      // if index is less than 0 (negative) or if index is greater than string length,
      // then the program just returns the original string and doesn't proceed with the rest of the method
      if (index < 0 || index >= str.length()) {
         return str;
      }
      char[] cArray = str.toCharArray(); //use toCharArray() to convert the string into an array of chars
      cArray[index] = ch; //in the new array of chars, set the value at the index position equal to ch (the input)
      return new String(cArray); // convert back to string
   }

   // Main method to test the above methods
   public static void main(String[] args) {
      String word = "touch";
      System.out.println(word);
      
      word = setChar(word, 3, "g"); //calls String version
      System.out.println(word);
      
      word = setChar(word, 0, 'r'); //calls char version
      System.out.println(word);

      word = setChar(word, 4, (char) (word.charAt(4) - 3)); // calls char version
      System.out.println(word);
   }
}