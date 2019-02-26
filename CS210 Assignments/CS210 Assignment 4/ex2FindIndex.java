// Matthew Clark
// CS210 Building Java Programs
// Assigment 4 Question 2
// This program finds the index of array element 55 and 13.

public class ex2FindIndex 
{  
   //This method finds the index 
   public static int  findIndex (int[] my_array, int t) 
   {  
      for(int i=0; i < my_array.length; i++) 
      {
         if(t==my_array[i]) 
         {
            return i;
         }
      }
      return -1;
   }      
   //This method provides two output for the index with elements 55 and 13.
   public static void main(String[] args) 
   {  
      int[] my_array = new int[] {25, 10, 55, 65, 36, 92, 77, 8, 13, 79};  
      System.out.println("Index position of 55 is: " + findIndex(my_array, 55));  
      System.out.println("Index position of 13 is: " + findIndex(my_array, 13));  
   }  
} 

//Index position of 55 is: 2
//Index position of 13 is: 8
