/**************************************************
Chiming Wang
11/13/2023
AP Computer Science A - Weisswange Period 5
1.6.1 - MagicSquare

MagicSquare.java
**************************************************/

import java.util.*;

public class MagicSquares {
   
   //simple hard coded method test
   public static void main(String[] args) {
      // Example test
      int[][] magicSquare = {
         {8, 1, 6},
         {3, 5, 7},
         {4, 9, 2}
      };
      int[][] magicSquareAdvanced = {
         {22, 12, 18, 87},
         {88, 17,  9, 25},
         {10, 24, 89, 16},
         {19, 86, 23, 11}
      };
      int[][] magicSquareAdvanced7 = {
         {30, 39, 48,  1, 10, 19, 28},
         {38, 47,  7,  9, 18, 27, 29},
         {46,  6,  8, 17, 26, 35, 37},
         { 5, 14, 16, 25, 34, 36, 45},
         {13, 15, 24, 33, 42, 44,  4},
         {21, 23, 32, 41, 43,  3, 12},
         {22, 31, 40, 49,  2, 11, 20}
      };
      System.out.println("Is magic square: " + isMagicSquare(magicSquare));
      System.out.println("Advanced magic square checker: " + isMagicSquareAdvanced(magicSquareAdvanced));
      System.out.println("Advanced magic square checker (with provided 7x7 square): " + isMagicSquareAdvanced(magicSquareAdvanced7));
   }
   
   //advanced verwsion of method (basic version is below)
   public static boolean isMagicSquareAdvanced(int[][] grid) {
      int n = grid.length;

      // check if grid isn't a square, or if it isn't empty: if it is, return false
      if (n == 0 || grid[0].length != n) {
         return false;
      }

      // get sum of first row as reference 
      int sum = 0;
      for (int i = 0; i < n; i++) {
         sum += grid[0][i];
      }

      // check sum of rows
      for (int i = 1; i < n; i++) {
         int rowSum = 0;
         for (int j = 0; j < n; j++) {
            rowSum += grid[i][j];
         }
         if (rowSum != sum) { //if sum of any of the rows isn't equal to reference sum, return false
            return false;
         }
      }

      // check sum of columns
      for (int i = 0; i < n; i++) {
         int colSum = 0;
         for (int j = 0; j < n; j++) {
            colSum += grid[j][i];
         }
         if (colSum != sum) { //if sum of any of the columns isn't equal to reference sum, return false
            return false;
         }
      }

      // check sum of diagonals
      int diagSum1 = 0, diagSum2 = 0;
      for (int i = 0; i < n; i++) {
         diagSum1 += grid[i][i];
         diagSum2 += grid[i][n - 1 - i];
      }
      if (diagSum1 != sum || diagSum2 != sum) { //if sum of any of the diagonals isn't equal to reference sum, return false
         return false;
      }

      return true; //if everything looks right, return true
   }
   
   //basic version of method
   public static boolean isMagicSquare(int[][] grid) {
      // check if 2d array is 3x3
      if (grid.length != 3 /*number of rows*/ || grid[0].length != 3 /*number of elements in row 1*/|| grid[1].length != 3 || grid[2].length != 3) {
         return false;
      }

      // get sum of first row, set as reference
      int sum = grid[0][0] + grid[0][1] + grid[0][2];

      // check sum of rows vs reference sum
      for (int i = 1; i < 3; i++) {
         if (grid[i][0] + grid[i][1] + grid[i][2] != sum) {
            return false;
         }
      }

      // check sum of columnvs vs reference sum
      for (int i = 0; i < 3; i++) {
         if (grid[0][i] + grid[1][i] + grid[2][i] != sum) {
            return false;
         }
      }

      // check sum of diagonals vs reference sum
      if (grid[0][0] + grid[1][1] + grid[2][2] != sum || grid[0][2] + grid[1][1] + grid[2][0] != sum) {
         return false;
      }

      return true; //if nothing is not equal to reference sum (if everything is equal), return true 
   }
}