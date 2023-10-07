/**************************************************
Chiming Wang
10/04/2023
AP Computer Science A - Weisswange Period 5
1.3.4 - Computing Probability Experimentally

MonteCarlo.java
**************************************************/

import java.util.*;

public class MonteCarlo {

   public static void main(String[] args) {
      int games = 1000000; // number of simulations to run

      int w = 0;
      int l = 0;

      for (int i = 0; i < games; i++) {
         if (diceSim()) {
            w++;
         } else {
            l++;
         }
      }

      double prob = (double) w / games; //experimental probability variable
      System.out.println("W Probability (Experimental): " + prob);
      System.out.println("L Probability (Experimental): " + (1 - prob));
   }
   
   // Method to simulate rolling dice 4 times
   public static boolean diceSim() {
      for (int i = 0; i < 4; i++) {
         int r = roll();
         if (r == 6) {
            return false; //player loses if one dice is 6
         }
      }
      return true; //if none of the dice are 6, the player wins
   }
   
   //use random to simulate dice roll
   public static int roll() {
      Random random = new Random();
      return random.nextInt(6) + 1; //generate random integer between 1-6
   }
}
