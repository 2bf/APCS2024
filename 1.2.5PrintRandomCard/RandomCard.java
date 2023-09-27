/**************************************************
Chiming Wang
09/26/2023
AP Computer Science A - Weisswange Period 5
1.2.5 - printRandomCard function

RandomCard.java
**************************************************/

import java.util.*;

public class RandomCard {

   public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in); //user scanner to ask user how many jokers are added to the deck
   
      System.out.println("How many jokers would you like to add to the deck?");
      System.out.print("Enter an integer here: ");
      int jokers = scanner.nextInt();
      printRandomCard(jokers); //call printRandomCard method
   }

   //
   public static void printRandomCard(int numJokers){
      
      //declare variables
      int numCards = 52 + numJokers; //get nuber of cards (with jokers added)
      int cardID = (int) (Math.random() * numCards); //use math.random to get random number between 0 and the number of cards
      int cNum = cardID % 13 + 1; //get card number
      int cSuit = cardID / 13 + 1; //get card suit
        
      String cardNum = "";
      String cardSuit = "";
        
      //code i used to debug program
      System.out.println("FOR DEBUGGING: " + "int numJokers = " + numJokers + " | int cardID = " + cardID +  " | int cNum = " + cNum + " | int cSuit = " + cSuit);
      
      //print out joker if the card ID is greater than 52 (which means it is an added joker card)
      if (cardID >= 52) {
            System.out.println("Joker");
            return;
      } else { 
         if (cNum > 1 && cNum < 11) { //if the card is a number card, just print the number
            cardNum = cardNum + cNum;
         } else { //if the card isn't a number card (jack, queen, etc) then print the name instead
            if (cNum == 1) {cardNum = cardNum + "Ace";}
            if (cNum == 11) {cardNum = cardNum + "Jack";}
            if (cNum == 12) {cardNum = cardNum + "Queen";}
            if (cNum == 13) {cardNum = cardNum + "King";}
         }
         
         //int randSuit = (int) (Math.random() * 4);
         
         //print card suit
         if (cSuit == 0) {cardSuit = cardSuit + " Clubs";}
         else if (cSuit == 1) {cardSuit = cardSuit + " Diamonds";}
         else if (cSuit == 2) {cardSuit = cardSuit + " Hearts";}
         else {cardSuit = cardSuit + " Spades";}
         
         //output to print out result
         String output = cardNum + " of" + cardSuit;
         System.out.println(output);
         return;
      }

   }
}