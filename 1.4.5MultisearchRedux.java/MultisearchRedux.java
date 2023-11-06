/**************************************************
Chiming Wang
10/24/2023
AP Computer Science A - Weisswange Period 5
1.4.5 - Multisearch Redux

MultisearchRedux.java
**************************************************/

//By Ryan Leung Period 5 Mr. Weisswange

import java.util.Arrays;

public class MultisearchRedux
{
   public static void main(String[] args) {
      int[] a = {};
      int[] c = resize(a, 10000000); //array resizing with long length
      int[] z = multiSearch(c, 0); //search array for key of 0
      
      String str = Arrays.toString(c);
      System.out.println(str);

      String str2 = Arrays.toString(z);
      System.out.println(str2);           //prints arrays
   }

   //postcondition: the contents of array are unchanged.
   public static int[] resize(int[] array, int newLength) {
      int[] output = new int[newLength]; //result array

      if (newLength == 0) {
         return output;
      }

      if (newLength > 0) {
         for (int i = 0; newLength > i; i++) {
            if (i >= array.length) {
               output[i] = 0; //set index = 0 if index is outside of original array
            }
            if (i < array.length) {
               output[i] = array[i]; //set index = same index if inside original array
            }
         }
      }
      return output;
   }


   public static int[] multiSearch(int[] array, int key){
      int counter = 0; //counter
      int[] output = {}; //result array

      for (int i = 0; array.length > i; i++) {
         if (array[i] == key) {
            counter = counter + 1; //counts amount of indices that match key
            output = resize(output,counter); //resizes array to counter length
            output[counter - 1] = key; //length -1 is last index of array
         }
      }
      return output;
   }
}