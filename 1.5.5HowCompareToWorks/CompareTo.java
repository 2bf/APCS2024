/**************************************************
Chiming Wang
10/31/2023
AP Computer Science A - Weisswange Period 5
1.5.5 - Alphabetical Arrays of Strings

CompareTo.java
**************************************************/

import java.util.*;

public class CompareTo {

   public static boolean isAlphabetical(String[] words) {
      for (int i = 0; i < words.length - 1; i++) { // int i must be less than length of array minus 1
      
         // if the string at position i is alphabetically after the string at the next position, compareTo will return positive value
         if (words[i].compareToIgnoreCase(words[i + 1]) > 0) { // use compareToIgnoreCase because "ordering should be case-insensitive"
            return false; //if string is after next string, return false
         }
      }
      return true;
   }

   public static void main(String[] args) {
      
      // simple output using provided example
      String input[] = new String[] {"A", "car", "drove", "fast"};
      System.out.println(isAlphabetical(input));
      
      
      //use scanner to get user input
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter a sentence or words (separated by spaces): ");
      String input2 = scanner.nextLine();
      
      String[] input2Split = input2.split(" "); //use split method to simplify user input
      
      // output
      System.out.println("The words in '" + input2 + "' are " + (isAlphabetical(input2Split) ? "alphabetically ordered" : "not alphabetically ordered")); // uses ternary operator (if else)
      
   }
}