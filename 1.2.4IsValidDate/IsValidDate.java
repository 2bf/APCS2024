/**************************************************
Chiming Wang
09/20/2023
AP Computer Science A - Weisswange Period 5
1.2.4 - IsValidDate function

IsValidDate.java
**************************************************/

import java.util.*;

public class IsValidDate {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      // Get user input for date 
      System.out.print("Enter a month: ");
      int month = scanner.nextInt();
      System.out.print("Enter a day: ");
      int day = scanner.nextInt();
      System.out.print("Enter a year: ");
      int year = scanner.nextInt();
      
      // Check if the date is valid
      boolean validDate = isValidDate(month, day, year);

      // Output the result
      if (validDate) {
         System.out.println("OUTPUT: " + month + "/" + day + "/" + year + " is a valid date.");
      } else {
         System.out.println("OUTPUT: " + month + "/" + day + "/" + year + " is not a valid date.");
      }
      scanner.close();
   }

   //checks if date is valid
   public static boolean isValidDate(int month, int day, int year){

      //obvious dates that don't exist..
      if (month < 1 || month > 12 || day > 31 || day < 1 || year < 0) {
         return false;
      }
      
      int daysPer = 0; //initialize int that stores the number of days per month
      
      //set daysPer to 28, 29, 30, or 31 based on month and year
      if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) { 
         daysPer = 31;
      }
      else if (month == 4 || month == 6 || month == 9 || month == 11) {
         daysPer = 30;
      }
      else if (month == 2) {
         if (isLeapYear(year)){ //call isLeapYear to check if the year is a leap year
            daysPer = 29;
         }
         else {daysPer = 28;}
      }
      
      return day <= daysPer; //if the given day is less than that month's maximum date, then it is valid
   }
   
   //checks if given year is a leap year
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
}