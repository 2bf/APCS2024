/**************************************************
Chiming Wang
10/02/2023
AP Computer Science A - Weisswange Period 5
1.3.3 - Perfect Numbers

PerfectNumbers.java
**************************************************/

//after program was run: the first five perfect numbers were 6, 28, 496, 8128, and 33550336

import java.util.*;

public class PerfectNumbers {
   
   //simple i/o
   public static void main(String[] args) {
   
      int max = 50000000;
      int count = 0;
      //String output = "";
      
      for (int i = 2; i < max; i++) {
      
         /*
         this was just for debugging and such. takes way too long to print every number so do not uncomment this!
         System.out.println("Trying: " + i + "...");
         */
         
         if(isPerfect(i)){
            count++;
            System.out.println("\nPerfect number #" + count + ": " + i);
            //output = output + "\nPerfect number #" + count + ": " + i;
         }
      }
      //System.out.println(output);
      
      //System.out.println("" + isPerfect(5));
   }
   
   //isPerfect method
   public static boolean isPerfect(int n) {
            
      if (n <= 1) {
         return false; 
      }
           
      int divSum = 1;
           
      for (int i = 2; i * i <= n; i++) {
         if (n % i == 0) { //compute perfect number
            divSum += i;
            if (i != n / i) { //
               divSum += n / i;
            }
         }
      }
      return divSum == n;
   }
     
}