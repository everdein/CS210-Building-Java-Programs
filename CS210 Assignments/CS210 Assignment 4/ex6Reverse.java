// Matthew Clark
// CS210 Building Java Programs
// Assigment 4 Question 6
// This program reverses an array of integer values.

import java.util.Arrays;   
public class ex6Reverse 
{  
   //This method prints the original and reverse order of the array.
   public static void main(String[] args) {     
      int[] my_array1 = {2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019};  
      System.out.println("Original array : "+Arrays.toString(my_array1));    
      for(int i=0; i < my_array1.length/2; i++) 
      {
         int j = my_array1.length - i - 1;
         swap(my_array1, i, j);
      }
      System.out.println("Reverse array : "+Arrays.toString(my_array1));  
   }
   //This method swaps the years in the original and reverse array lines.
   public static void swap(int[] my_array1, int i, int j) 
   {
      int temp = my_array1[i];
      my_array1[i] = my_array1[j];
      my_array1[j] = temp;
   }
}
  