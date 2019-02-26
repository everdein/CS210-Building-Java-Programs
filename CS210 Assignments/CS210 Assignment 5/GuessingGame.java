// Matthew Clark
// CS210 Building Java Programs
// Assigment 5 - Guessing Game

/* This program allows the computer to play a guessing game.
I will think of a number and will allow the computer to guess
until it's correct. For each guess, I will tell the computer 
whether the right answer is higher or lower. */
 
import java.util.*;
public class GuessingGame 
{
   public static final int max = 100;
   public static final Random number = new Random(); 
   //Runs the methods for the program.
   public static void main(String[] args) 
   {
      Scanner console = new Scanner(System.in);
      giveIntro();
      do 
      {
         playGame(console);
      } 
      while(playAgain(console));
   }
   //Gives the computer an introduction to the game.
   public static void giveIntro() 
   {
      System.out.println("Lets play a guessing game!");
      System.out.println("I'm thinking of a number between 1 and 100...");
   }  
   //Method to play game.
   public static void playGame(Scanner console) 
   {
      int minimum = 0;
      int maximum = max;
      boolean guessing = true;
      while(guessing) 
      {
         int guess = makeGuess(maximum, minimum);
         System.out.println("My gyess: " + guess);
         String response = console.nextLine();
         if(response.equals("h")) 
         {
            minimum = guess + 1;
         } 
         else if(response.equals("l")) 
         {
            maximum = guess - 1;
         } 
         else 
         {
            guessing = false;
         }
      }
   }
   //This method does the math to return a guess.
   public static int makeGuess (int maximum, int minimum) 
   {
      return number.nextInt(maximum - minimum) + minimum + 1;
   }
   //This method asks the user if they'd like to play again.
   public static boolean playAgain(Scanner console) 
   {
         System.out.println("Do you want to play again?");
         String response = console.nextLine();
         if(response.equals("yes") || response.equals("y") || response.equals("Y") || response.equals("YES")) 
         {
            return true;
         } 
         else if(response.equals("no") || response.equals("n") || response.equals("N") || response.equals("NO")) 
         {
            return false;
         } 
         else 
         { 
            System.out.println("Invalid response, please say yes or no.");  
            return playAgain(console);
      }
   }
}