// Matthew Clark
// CS210 Building Java Programs
// Assigment 4 Question 5
// This program to finds the maximum and minimum value of an array.

import java.util.Arrays;   
public class ex5MinMax {    
   static int max;  
   static int min;  
   //This method finds the maximum and minimum value of my_array.
   public static void max_min(int my_array[]) 
   {  
      max=my_array[0];
      min=my_array[0];   
      for(int i=0; i < my_array.length; i++) 
      {
         if(my_array[i]>max) 
         {
            max=my_array[i];
         }
         if(my_array[i]<min) 
         {
            min=my_array[i];
         }
      }
   }  
   //This method provides the maximum and minimum values of my_array.
   public static void main(String[] args) 
   {  
      int[] my_array = {25, 10, 55, 65, 36, 92, 77, 8, 13, 79};
      max_min(my_array);  
      System.out.println(" Original Array: "+Arrays.toString(my_array));  
      System.out.println(" Maximum value for the above array = " + max);  
      System.out.println(" Minimum value for the above array = " + min);  
   }  
} 
