/**************************************************
Chiming Wang
09/28/2023
AP Computer Science A - Weisswange Period 5
1.3.1 - GCF function

GCF.java
**************************************************/

import java.util.*;

public class GCF {
   public static int gcf(int a, int b) {
   
      int minNum = Math.min(a, b); //use math.max to get the higher number between a and b
      int g = 1; //gcf variable 
      
      for (int i = 1; i <= minNum; i++) { //use for loop to run program until i (and gcf) becomes larger than the minimum value
         if (a % i == 0 && b % i == 0) { //check for gcf by dividing
            g = i;
         }
      }
      
      return g; 
   }
  
   //simple i/o
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter first integer: ");
      int n1 = input.nextInt();
      System.out.print("Enter second integer: ");
      int n2 = input.nextInt();
      
      System.out.println("The GCF is: " + gcf(n1, n2));
   }
}