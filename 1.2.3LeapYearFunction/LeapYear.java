/**************************************************
Chiming Wang
09/19/2023
AP Computer Science A - Weisswange Period 5
1.2.3 - IsLeapYear function

LeapYear.java
**************************************************/

import java.util.*;

public class LeapYear {

   public static boolean isLeapYear(int year){
   
      int four = year % 4;
      int hundred = year % 100;
      int fhundred = year % 400;
      
      //check if input is a leap year using mod
      if (four == 0){ //if a year is divisible by 4, it is a leap year
      
         if (hundred == 0) { //unless it's divisible by 100, in which case it's not a leap year
         
            if (fhundred == 0) {  //unless it's divisible by 400, in which case it's a leap year
               return true;
            } else {return false;}
            
         } else {return true;}
      
      } else {return false;}
   
   }
   
   
   public static void main(String[] args) {
      
      //use scanner to get user input
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter a year: ");
      int input = scanner.nextInt();
      
      //output: checks if isLeapYear method is true or false
      if (isLeapYear(input)) {
         System.out.println("OUTPUT: " + input + " is a leap year.");
      } else {
         System.out.println("OUTPUT: " + input + " is not a leap year.");
      }   
          
   }
}