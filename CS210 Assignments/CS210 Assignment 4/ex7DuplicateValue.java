// Matthew Clark
// CS210 Building Java Programs
// Assigment 4 Question 7
// This program finds duplicates an array and reports the values.

import java.util.Arrays;   
public class ex7DuplicateValue 
{  
   //This method searches my array for duplicates and reports them.
   public static void main(String[] args) {  
      int[] my_array = {1, 2, 3, 3, 4, 5, 6, 2};  
      for(int i = 0; i < my_array.length-1; i++) 
      {
         for(int j = i+1; j < my_array.length; j++) 
         {
            if((my_array[i] == my_array[j]) && (i != j)) 
            {
               System.out.println("Duplicate Element is : " + my_array[j]);
            }
         }
      }
   }      
}
  
//Duplicate Element : 2
//Duplicate Element : 3