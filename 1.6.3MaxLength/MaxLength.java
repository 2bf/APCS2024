/**************************************************
Chiming Wang
11/15/2023
AP Computer Science A - Weisswange Period 5
1.6.3 - MaxLength

MaxLength.java
**************************************************/

import java.util.*;

public class MaxLength {
   
   //simple hard coded method test
   public static void main(String[] args) {
      int[][] table = {
         {23, 0, 425, -25},
         {1856, 24601, 7, 92},
         {-3, 18, -2053, 13}
      };
      System.out.println(highestgth(table));
   }
   
   //Returns the length (in characters) of the longest number in table
   //precondition: table contains at least one element
   public static int highestgth(int[][] table) {
      int highest = 0; //max length variable
      int rows = table.length;
      
      for (int[] row : table) { // for every row, do the following:
         for (int num : row) { // iterate through every number in row
            int length = Integer.toString(Math.abs(num)).length(); // convert int to string, get length of string
            if (num < 0) {
               length++; // if the int is negative, add 1 for the negative sign
            }
            if (length > highest) {
               highest = length; // update max length
            }
         }
      }
      return highest; // output
   }
}