/**************************************************
Chiming Wang
10/30/2023
AP Computer Science A - Weisswange Period 5
1.5.3 - ValidPassword

ValidPassword.java
**************************************************/

// scanner for i/o
import java.util.Scanner;

public class ValidPassword {

   public static boolean isValidPassword(String password) {
   
      // if password is too short or long: return false immediately
      if (password.length() < 6 || password.length() > 16) {
         return false;
      }

      // booleans which will be used later!
      boolean uppercase = false;
      boolean lowercase = false;
      boolean digit = false;
      boolean specialChar = false;

      // iterate over each character, check conditions
      for (int i = 0; i < password.length(); i++) {
         char ch = password.charAt(i);
            
         if (Character.isUpperCase(ch)) { //checks if character is an uppercase letter
            uppercase = true;
         } else if (Character.isLowerCase(ch)) { //checks if character is a lowercase letter
            lowercase = true;
         } else if (Character.isDigit(ch)) { // checks if character is a number/digit 
            digit = true;
         } else if (!Character.isWhitespace(ch)) { // if all above are false, and the char isn't a space, then it must be a special character
            specialChar = true;
         }
         
         // return false if character is space
         if (Character.isWhitespace(ch)) {
            return false;
         }
      }

      //check if all conditions are met
      int countTypes = 0;
      if (uppercase) countTypes++;
      if (lowercase) countTypes++;
      if (digit) countTypes++;
      if (specialChar) countTypes++;
      
      return countTypes >= 3; //if three or more conditions are met (countTypes == 4), then return true
   }

   // main method is mostly for i/o and testing
   public static void main(String[] args) {
        
      //use scanner to get user input
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter a password: ");
      String input = scanner.nextLine();
      
      // output
      System.out.println("Password: " + input + " is " + (isValidPassword(input) ? "valid" : "invalid")); // uses ternary operator (if else)

   }
}