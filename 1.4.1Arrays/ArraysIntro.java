/**************************************************
Chiming Wang
10/11/2023
AP Computer Science A - Weisswange Period 5
1.4.1 - Arrays Intro

ArraysIntro.java
**************************************************/

//import java.util.Arrays;

public class ArraysIntro {

   //hard coded outputs
   public static void main(String[] args) {
      int[] numbers = {8, 6, 7, 5, 3, 0, 9, 0};
      int max = max(numbers);
      int min = min(numbers);
      int range = range(numbers);
      
      System.out.println("Largest number: " + max);
      System.out.println("Smallest number: " + min);
      System.out.println("Range: " + range);

      int[] values = {-3, 8, 2, 17, 9, -3, 12, 0, 4, 11};
      int r = range(values);
      System.out.println("Range of values: " + r);
   }
   
   //calculate minimum value by going through all values.
   //if one value is less than the next one, set the min variable as that value
   public static int min(int[] array) {
      int min = array[0];
         for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
               min = array[i];
            }
         }
      return min;
   }
   
   //literally same thing as min method, but the less than sign is just switched
   public static int max(int[] array) {
      int max = array[0];
            for (int i = 1; i < array.length; i++) {
               if (array[i] > max) {
                  max = array[i];
               }
            }
      return max;
   }
   
   //finds range of array.
   //calls max and min methods and subtracts min from max, to get the difference of the max and min (the range)
   public static int range(int[] array) {
      int max = max(array);
      int min = min(array);
      return max - min;
   }
}