/**************************************************
Chiming Wang
09/29/2023
AP Computer Science A - Weisswange Period 5
1.3.2 - Eulers Totient

EulersTotient.java
**************************************************/

import java.util.*;

public class EulersTotient {

   //simple i/o
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter integer: ");
      int n = input.nextInt();
      
      if (totient(n) == -1) {System.out.println("Error: both numbers inputted must be nonzero.");}
         else {System.out.println("The totient is: " + totient(n));}
   }
   
   
   //compute totient by using a simple for loop
   public static int totient(int n) {

      int totient = 0;

      //every time a number under n has a gcf of 1 (with n), add 1 to the totient until all relatively prime numbers are computed
      for (int i = 1; i <= n; i++) {
         if (gcf(i, n) == 1) {
            totient++;
         }
      }

      return totient;
   }
    
  //gcf function.
   public static int gcf(int a, int b) {
   
      if (a == 0 || b == 0) { //check if a or b is zero
         return -1;
      }
   
      int minNum = Math.min(a, b); //use math.max to get the higher number between a and b
      int g = 1; //gcf variable 
      
      for (int i = 1; i <= minNum; i++) { //use for loop to run program until i (and gcf) becomes larger than the minimum value
         if (a % i == 0 && b % i == 0) { //check for gcf by dividing
            g = i;
         }
      }
      
      return g; 
   }
}