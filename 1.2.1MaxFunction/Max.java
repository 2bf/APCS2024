/**************************************************
Chiming Wang
09/15/2023
AP Computer Science A - Weisswange Period 5
1.2.1 - Max function

Max.java
**************************************************/

import java.util.*;

public class Max {
   //Returns the largest of its four arguments.
   public static int max(int a, int b, int c, int d) {
   
   int[] arr = {a, b, c, d};
   int max = a; //sets max as a first
   
   //if b is greater than max, just set max equal to b and do it again (and also for c and d)
   if (b > max){
      max = b;
   }
   if (c > max){
      max = c;
   }
   if (d > max){
      max = d;
   }
   
   return max;
   }
  
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter 4 integers, separated by spaces: ");
      int n1 = input.nextInt();
      int n2 = input.nextInt();
      int n3 = input.nextInt();
      int n4 = input.nextInt();
      System.out.println("Largest is " + max(n1, n2, n3, n4));
   }
}


/**
test cases used:
1 2 3 4
8 3 2 8
16 16 16 16
-9 -4 -3 -19
**/
