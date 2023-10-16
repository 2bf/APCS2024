/**************************************************
Chiming Wang
10/12/2023
AP Computer Science A - Weisswange Period 5
1.4.2 - Array Searching 1

ArraySearching1.java
**************************************************/

// import java.util.Arrays;

public class ArraySearching1 {

   // hard coded outputs
   public static void main(String[] args) {
      int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};  
      int k = 5;
      int startInd = 0;
      int search1 = search(array, k);
      int search2 = search(array, k, startInd);
      
      // print outputs
      System.out.println("Result for key " + k + ": " + search1);
      System.out.println("Result for key " + k + " starting from index " + startInd + ": " + search2);
   }
       
   public static int search(int[] array, int key) {
      for (int i = 0; i < array.length; i++) { // go through every number in the array, if one of the values is equal to the key then return i
         if (array[i] == key) {
            return i; // if key was found in array, return the position of the key
         }
      }
      return -1; // if key wasn't found in array, return -1
   }

   public static int search(int[] array, int key, int startIndex) {
      for (int i = startIndex; i < array.length; i++) { // same thing as the first search method, but i just starts at searchIndex instead
         if (array[i] == key) {
            return i; // if key was found in array, return the position of the key
         }
      }
      return -1; // if key wasn't found in array, return -1
   }

}