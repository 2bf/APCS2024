/**************************************************
Chiming Wang
10/06/2023
AP Computer Science A - Weisswange Period 5
1.3.5 - Prime Factorization

PrimeFactorization.java
**************************************************/

import java.util.*;

public class PrimeFactorization {
   public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Enter an integer: ");
      int a = scan.nextInt();
      System.out.print("The prime factors of " + a + " are:");
      System.out.println("" + primeFactor(a));
   }

   //primeFactor method
   public static String primeFactor(int n) {      
      String output = "";
      
      int f = 2; //start with smallest prime number
      
      //check if number is a factor
      while (n > 1) {
      //while loop stops when n goes below 1:
      //this means it will stop at the last prime factor because it will keep dividing itself and if n isn't an integer anymore it will stop
         if (n % f == 0) {
            output = output + " " + f; //when factor is found, add it to the end of the string
            n /= f;
         } else {
            f++; //go to next potential factor
         }
      }
      return output;
   }
}
