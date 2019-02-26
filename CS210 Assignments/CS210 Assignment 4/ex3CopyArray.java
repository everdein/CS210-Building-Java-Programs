// Matthew Clark
// CS210 Building Java Programs
// Assigment 4 Question 3
// This program copies an array by iterating the array.

import java.util.Arrays;   
public class ex3CopyArray 
{  
   //This method copy's the elements within my array and places them into new array.
   public static void main(String[] args) 
   {  
      int[] my_array = new int[]{25, 10, 55, 65, 36, 92, 77, 8, 13, 79};  
      int[] new_array = new int[10];         
      System.out.println("Source Array : "+Arrays.toString(my_array));       
      for(int i=0; i < my_array.length; i++) 
      {
         new_array[i]=my_array[i];
      }
      System.out.println("New Array: "+Arrays.toString(new_array));  
   }  
}

//Source Array : [25, 10, 55, 65, 36, 92, 77, 8, 13, 79]
//New Array: [25, 10, 55, 65, 36, 92, 77, 8, 13, 79]
