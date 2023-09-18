/**************************************************
Chiming Wang
09/18/2023
AP Computer Science A - Weisswange Period 5
1.2.2  - ApproxEquals
ApproxEquals.java
**************************************************/

import java.util.*; //import packages

public class ApproxEquals {
   
   public static boolean approxEquals(double a, double b, double tolerance) {
      
      //use absolute value to find difference of the doubles, then check if it's less than the tolerance
      double difference = Math.abs(a - b);
      double realTolerance = Math.abs(tolerance); //absolute value for tolerance, so if the user inputs a negative tolerance it still works
      return difference < realTolerance;
      
   }
   
   //main method
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in); //initiate scanner
      
      //using scanners for user input
      System.out.print("Enter tolerance: ");
      double tolerance = input.nextDouble();
      
      //asks user for doubles
      System.out.println("Enter 2 doubles: ");
      double d1 = input.nextDouble();
      double d2 = input.nextDouble();

      //outputs true or false
      System.out.println(approxEquals(d1, d2, tolerance));
      
   }

}


/**
test cases used:
1 2 3 4
8 3 2 8
16 16 16 16
-9 -4 -3 -19
**/