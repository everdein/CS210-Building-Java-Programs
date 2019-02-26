// Matthew Clark
// CS210 Building Java Programs
// Assignment 1 - Methods

public class Methods 
{
   public static void first() 
   {
      System.out.println("Inside first method");
      third();
      
   }
   public static void second() 
   {
      System.out.println("Inside second method");
      
   }
   public static void third() 
   {
      System.out.println("Inside third method");
      second();
      
   } 
   public static void main(String[] args) 
   {
    // DO NOT change this part
      first();
      third();
      second();
      third();
   }
}