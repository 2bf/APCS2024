/**************************************************
Chiming Wang
10/16/2023
AP Computer Science A - Weisswange Period 5
1.4.3 - Array Searching 2 function

ArraySearching2.java
**************************************************/

// import packages
import java.util.*;

public class ArraySearching2 {

   public static void main(String[] args) {
      int[] nums = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
      System.out.println(Arrays.toString(multiSearch(nums, 5)));
   }
   
   // recondition: array contains at least one value.
   // postcondition: the contents of array are unchanged.
   public static int[] multiSearch(int[] array, int key) {
      int keys = 0;
      // use for loop to first count the number of times the key occurs in the given array
      for (int i : array) { // use enhanced for loop to iterate through each value in the array
         if (i == key) {
            keys++;
         }
      }

      int[] output = new int[keys];
      int index = 0;
      for (int i = 0; i < array.length; i++) { // for loop stops at the end of array
         if (array[i] == key) { // if a value in the array is equal to the key, set the index-numbered value in the output array equal to the value.
            output[index] = i;
            index++; // index number goes up by 1, and loop runs again until output array is completely generated
         }
      }

      return output;
   }
}