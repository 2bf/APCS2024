/**************************************************
Chiming Wang
11/14/2023
AP Computer Science A - Weisswange Period 5
1.6.2 - RowStrings

RowStrings.java
**************************************************/

public class RowStrings {

   // simple main method (output)
   public static void main(String[] args) {
   
      //for basic method
      System.out.println("For basic method: ");
      char[][] letters = {
         {'G', 'r', 'e', 'a', 't'},
         {'W', 'h', 'i', 't', 'e'},
         {'S', 'h', 'a', 'r', 'k'}
      };
      String[] words = rowStrings(letters);
      for (String word : words) {
         System.out.println(word);
      }
      
      System.out.println("");
      //for advanced
      System.out.println("For advanced method: ");
      char[][] lettersAdvanced = {
         {'G', 'r', 'e', 'a', 't'},
         {'W', 'h', 'i', 't', 'e'},
         {'S', 'h', 'a', 'r', 'k'},
         {'D', 'o', ' ', 'd', 'o'},
         {'D', 'o', ' ', 'd', 'o'},
         {'D', 'o', ' ', 'd', 'o'}
      };
      String[] wordsA = rowStrings(lettersAdvanced);
      for (String word : wordsA) {
         System.out.println(word);
      }   
   }
   
   public static String[] rowStringsAdvanced(char[][] characters) {
      // calculate what the size of output array should be
      int size = 0;
      for (char[] row : characters) {
         // splits the row if there are empty spaces. -1 makes it so that trailing empty spaces aren't counted 
         size += new String(row).split(" ", -1).length; // length of array from split method is added to size
      }
        
      String[] rows = new String[size];
      int index = 0;
      for (char[] row : characters) {
         String[] splitted = new String(row).split(" ", -1); // make array containing all words, (2d array split into pieces at the space)
         for (String word : splitted) {
            rows[index++] = word; // add every word to the rows array at index, then index++
         }
      }
      return rows; // step 4: profit
   }

   public static String[] rowStrings(char[][] characters) {
      String[] rows = new String[characters.length]; // make new array. length is the number of rows in characters
      for (int i = 0; i < characters.length; i++) { // go through every row of characters 2d array
         rows[i] = new String(characters[i]); // at i position in rows, put all characters in the row i
      }
      return rows;
   }
}