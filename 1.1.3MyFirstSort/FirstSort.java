/**************************************************
Chiming Wang
09/11/2023
AP Computer Science A - Weisswange Period 5
1.1.3 - First Sort

FirstSort.java
**************************************************/

import java.util.*;

public class FirstSort {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Choose an option:");
      System.out.println("Type 1 to sort integers");
      System.out.println("Type 2 to sort words in alphabetical order");

      int choice = scanner.nextInt();

      if (choice == 1) {
         sortIntegers();
      } else if (choice == 2) {
         sortWords();
      } else {
         System.out.println("Invalid choice. Please choose 1 or 2.");
      }
   }

   public static void sortIntegers() {
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Enter an integer: ");
      int a = scanner.nextInt();
   
      System.out.print("Enter another integer: ");
      int b = scanner.nextInt();
   
      System.out.print("Enter one more integer: ");
      int c = scanner.nextInt();
           
      // Sorting the numbers in ascending order
      if (a > b) {
         int z = a; //variable for temporarily storing value
         a = b;
         b = z;
      }
      if (b > c) {
         int z = b;
         b = c;
         c = z;
      }
      if (a > b) {
         int z = a;
         a = b;
         b = z;
      }
         
      String output = ("In order: " + a + ", " + b + ", " + c);
      System.out.println(output);
      scanner.close();
   }

   public static void sortWords() {
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Enter a word: ");
      String a = scanner.next();

      System.out.print("Enter another word: ");
      String b = scanner.next();

      System.out.print("Enter one more word: ");
      String c = scanner.next();

      // Sorting the words in alphabetical order
      if (a.compareToIgnoreCase(b) > 0) {
         String z = a;
         a = b;
         b = z;
      }
      if (b.compareToIgnoreCase(c) > 0) {
         String z = b;
         b = c;
         c = z;
      }
      if (a.compareToIgnoreCase(b) > 0) {
         String z = a;
         a = b;
         b = z;
      }
         
      String output = ("In order: " + a + ", " + b + ", " + c);
      System.out.println(output);
      scanner.close();
   }
}
