/**************************************************
Chiming Wang
11/06/2023
AP Computer Science A - Weisswange Period 5
1.5.4 - ParsingTimeInput

ParsingTimeInput.java
**************************************************/

import java.util.*;

public class ParsingTimeInput {

   public static int parseTime(String timeStr) {
      // remove leading and trailing whitespace + convert to uppercase
      timeStr = timeStr.trim().toUpperCase();
        
      try {
         
         //adds space between time and am/pm part, so that the computer can actually read it
         if(timeStr.contains("AM")) {
             int c = timeStr.indexOf("AM");
             timeStr = timeStr.substring(0, c) + " " + timeStr.substring(c);
         }

         if(timeStr.contains("PM")) {
             int c = timeStr.indexOf("PM");
             timeStr = timeStr.substring(0, c) + " " + timeStr.substring(c);
         }
         
         //split string by space to separate the am/pm part
         String[] parts = timeStr.split("\\s+");
         String numPart = parts[0];
         String amPmPart = parts.length > 1 ? parts[1] : "";
            
         // check if am/pm part is valid
         if (!amPmPart.equals("") && !amPmPart.equals("AM") && !amPmPart.equals("PM")) { //if strings aren't equal, return -1 (exit method)
            return -1;
         }
         
         
         // replace colon for easier parsing (so it's a full number that can be used by the computer easily)
         numPart = numPart.replace(":", "");
            
         // make sure time format is correct
         if (numPart.length() < 3 || numPart.length() > 4) {
            return -1;
         }
            
         // use substrings to convert parts of the time string into int so it can be processed
         int hour, minute;
         if (numPart.length() == 3) { //if time is 3 digits
            hour = Integer.parseInt(numPart.substring(0, 1));
            minute = Integer.parseInt(numPart.substring(1));
         } else {
            hour = Integer.parseInt(numPart.substring(0, 2));
            minute = Integer.parseInt(numPart.substring(2));
         }
            
         // makes sure hour and minutes parts are correct (valid)
         if (minute < 0 || minute > 59 || hour < 0 || hour > 23) {
            return -1;
         }
            
         // converts time to 24h format so computer can process easier
         if (!amPmPart.equals("")) { //if am/pm part isn't blank, 
            if (amPmPart.equals("PM") && hour != 12) { //and if it's pm (and the hour isn't 12),
               hour += 12; //add 12 to hour to convert
         } else if (amPmPart.equals("AM") && hour == 12) { //if its 12 am, make hour equal to 0
               hour = 0;
         }
      }
            
            // simple calculation to get minutes since midnight
            return hour * 60 + minute;
            
        } catch (NumberFormatException e) { // if number format is invalid, just return -1
            return -1;
        }
   }

   // simple main method for i/o
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter a time string to parse: ");
      String input = scanner.nextLine();
      int result = parseTime(input);
      
      // extra thing that tells user to put valid input if they don't
      boolean real = true;
      if (result < 0) {real = false;}
      System.out.println("");
      System.out.println(real ? input + " is " + result + " minutes after midnight" : "An invalid input was used!");
      scanner.close();
      
     
   }
}