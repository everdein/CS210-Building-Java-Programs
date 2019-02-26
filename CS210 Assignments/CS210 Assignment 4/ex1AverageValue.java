// Matthew Clark
// CS210 Building Java Programs
// Assigment 4 Question 1
// This program calculates the average value of an arrays elements.

public class ex1AverageValue 
{  
   //This method hosts an array 'numbers' and provides the average of all numbers listed within the array.
   public static void main(String[] args) 
   {     
      int[] numbers = new int[]{10, 20, 30, 40, -50, 60, -70};  
      int sum=0;
      for(int i=0; i < numbers.length; i++) 
      {
         sum+=numbers[i];
      }
      double average=sum/numbers.length;
      System.out.println("Average value of the array elements is : " + average);   
   }  
}  
