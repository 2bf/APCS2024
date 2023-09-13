/**************************************************
Chiming Wang
09/13/2023
AP Computer Science A - Weisswange Period 5
1.1.4 - Average

Average.java
**************************************************/

//import packages
import java.util.*;

public class Average {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in); //initialize scanner
      
      //use scanner to get integer inputs
      System.out.print("Enter three integers: ");
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      int c = scanner.nextInt();
      
      double avg = (double) (a + b + c) / 3; //convert int to double by typecasting
      double output = Math.round(avg * 1000.0) / 1000.0; //multiply by 1000, then round, then divide by 1000 to get 3 decimal places

      System.out.println("The average of those numbers is: " + output); //send output to i/o
      
   }

}
