/**************************************************
Chiming Wang
09/07/2023
AP Computer Science A - Weisswange Period 5
1.1 - Quadratic Formula

QuadraticFormula.java
**************************************************/

//import packages
import java.util.*;

public class QuadraticFormula
{
   public static void main(String[] args)
   {
      //use scanners to ask user for input
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter a: ");
      double a = scanner.nextDouble();
      System.out.print("Enter b: ");
      double b = scanner.nextDouble();
      System.out.print("Enter c: ");
      double c = scanner.nextDouble();
      
      //part under square root
      double discrim = b * b - 4 * a * c;

      if (discrim > 0){
         double root0 = (-b + Math.sqrt(discrim)) / (2 * a);
         double root1 = (-b - Math.sqrt(discrim)) / (2 * a);
         
         //reformat double
         String formatted0 = String.format("%,.4f", root0);
         String formatted1 = String.format("%,.4f", root1);
         System.out.println("The solutions are " + formatted0 + " and " + formatted1 + ".");
         
      } else if (discrim == 0) {
         double root = -b / (2 * a);
         
         //reformat double
         String formatted = String.format("%,.4f", root);
         System.out.println("The solution is " + formatted + ".");
         
      } else {
         double realNum = -b / (2 * a);
         double imaginaryNum = Math.sqrt(-discrim) / (2 * a);
         
         //reformat double
         String realForm = String.format("%,.4f", realNum);
         String imaginaryForm = String.format("%,.4fi", imaginaryNum);
         
         System.out.println("The solutions are " + realForm + " + " + imaginaryForm + " and " + realForm + " - " + imaginaryForm + ".");
      }

      scanner.close();
   } //public static void main end
} //public class end
