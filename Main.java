import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      int computer = 0; // To hold the computer's points.
      int user = 0;     // To hold the user's points.

      // Play the game while the user's points are
      // under the limit, and the user agrees to 
      // roll the dice.
      while(underLimit(user) && rollDice())
      {
         // Let the computer decide if it should
         // roll the dice again without going over
         // the limit.
         if (underLimit(computer + getDiceValue()))
            computer += getDiceValue();
         
         // Roll the user's dice and display the
         // total number of accumulated points.
         user += getDiceValue();
         System.out.println("Points: " + user);
      }
      
      if (user == 0 && computer == 0)
         System.out.println("Goodbye!");
      else
      {
         displayResults(computer, user);
      }
   }
   
   /**
      The getDiceValue method simulates the rolling 
      of a pair of dice.
      @return The sum of the value of the dice.
   */ 
   
   public static int getDiceValue()
   {

   }

   /**
      The rollDice method asks the user to roll
      the dice, accepting keyboard input as the
      answer.
      @return true if the user wants to roll the 
              dice, or false otherwise.
   */ 
   
   public static boolean rollDice()
   {

   }
   
   /**
      The underLimit method determines if the
      points are under the limit of 21.
      @return true if points are less than 21,
              or false otherwise.
   */
   
   public static boolean underLimit(int value)
   {
 
   }
   
   /**
      The isValid method validates the user input.
      @return true if the input is valid, or
              false otherwise.
   */
   
   public static boolean isValid(char letter)
   {

   }
   
   /**
      The displayResults method determines the results
      of the game and displays them.
   */
   
   public static void displayResults(int computer, int user)
   {

   }
}