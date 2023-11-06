/**************************************************
Chiming Wang
10/20/2023
AP Computer Science A - Weisswange Period 5
1.4.4 - Array Resizing

ArrayResizing.java
**************************************************/

// import packages
import java.util.*;

public class ArrayResizing {

   public static void main(String[] args) {
   
      // use provided inputs from the google classroom to test program
      int[] array1 = {1, 2, 3, 4};
      printArray(resize(array1, 6));

      int[] array2 = {1, 2, 3, 4};
      printArray(resize(array2, 2));

      int[] array3 = {3, 1, 4, 1, 5, 9};
      printArray(resize(array3, 3));

      int[] array4 = {3, 1, 4, 1, 5, 9};
      printArray(resize(array4, 7));

      int[] array5 = {2, 5, 1, 2, 3};
      printArray(resize(array5, 5));

      int[] array6 = {9, 2, 5};
      printArray(resize(array6, 0));
   }

   public static int[] resize(int[] array, int newLength) {
      int[] output = new int[newLength];
      int l = Math.min(array.length, newLength);
      for (int i = 0; i < l; i++) {
          output[i] = array[i]; // replace values in new array 
      }
      return output;
   }

   public static void printArray(int[] array) {
      System.out.print("[");
      for (int i = 0; i < array.length; i++) { //goes through every value in array and prints it 
         if (i > 0) {
            System.out.print(", ");
         }
         System.out.print(array[i]);
      }
      System.out.println("]");
   }
}
