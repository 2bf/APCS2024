/**************************************************
Chiming Wang
09/13/2023
AP Computer Science A - Weisswange Period 5
1.1.4 - Average

Average.java
**************************************************/

import java.util.*;

public class Average {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      //use scanner to get integers
      System.out.print("Enter three numbers: ");
      double a = scanner.nextDouble();
      double b = scanner.nextDouble();
      double c = scanner.nextDouble();
      
      double avg = (a + b + c) / 3;
      
      
      System.out.printf("The average of those numbers is: " + "%,.3f", avg); //format
      
   }

}
