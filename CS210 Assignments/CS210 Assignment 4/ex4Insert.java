// Matthew Clark
// CS210 Building Java Programs
// Assigment 4 Question 4
// This program inserts an element (specific position) into an array.

import java.util.Arrays;   
public class ex4Insert 
{  
   //This method inserts and new value (12) into my_array index position (3).
   public static void main(String[] args) 
   {  
      int[] my_array =new int[] {25, 10, 55, 65, 36, 92, 77, 8, 13, 79};  
      int Index_position = 3;  
      int newValue    = 12;  
      System.out.println("Original Array : "+Arrays.toString(my_array));       
      for(int i=Index_position; i < my_array.length; i++) 
      {
         int temp = my_array[i];
         my_array[i] = newValue;
         newValue = temp;
      }
      System.out.println("New Array: "+Arrays.toString(my_array));  
   }  
}