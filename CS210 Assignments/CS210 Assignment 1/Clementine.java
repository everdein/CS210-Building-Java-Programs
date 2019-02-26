// Matthew Clark
// CS210 Building Java Programs
// Assignment 1 - Clementine

public class Clementine
{
  public static void intro() 
  {
      System.out.println("Clementine");
      System.out.println();
      System.out.println("In a cavern, in a canyon");
      System.out.println("Excavating for a mine");
      System.out.println("Lived a miner, forty-niner");
      System.out.println("And his daughter, Clementine");
      System.out.println();
      chorus();
   
   }
   public static void chorus() 
   {
      System.out.println("Oh, my darling, oh, my darling");
      System.out.println("Oh, my darling Clementine");
      System.out.println("You are lost and gone forever");
      System.out.println("Dreadful sorry, Clementine");
      System.out.println();
   
   }     
   public static void verse1() 
   {
      System.out.println("Light she was and like a fairy");
      System.out.println("And her shoes were number nine");
      System.out.println("Herring boxes without topses");
      System.out.println("Sandals were for Clementine");
      System.out.println();
      chorus();

   }  
   public static void verse2() 
   {
      System.out.println("Drove she ducklings to the water");
      System.out.println("Every morning just at nine");
      System.out.println("Hit her foot against a splinter");
      System.out.println("Fell into the foaming brine");
      System.out.println();
      chorus();
   
   } 
   public static void main(String[] args) 
   {
      intro();
      verse1();
      verse2();

   }
}