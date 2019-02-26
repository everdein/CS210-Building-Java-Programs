// Matthew Clark
// CS210 Building Java Programs
// Assigment 4 Question 8
// This program find duplicate values of an array and reports the values.

// public class ex8DuplicateString 
// {  
//    //This method locates duplicate strings within my_array and reports them.
//    public static void main(String[] args) 
//    {  
//       String[] my_array = {"Wilson", "Sherman", "Lynch", "Chancellor", "Graham", "Wilson", "Lynch"};  
//       for(int i = 0; i < my_array.length-1; i++) 
//       {
//          for(int j = i+1; j < my_array.length; j++) 
//          {
//             if((my_array[i].equals(my_array[j])) && (i != j)) 
//             {
//                System.out.println("Duplicate Element is : "+my_array[j]);
//             }
//          }
//       }
//    }      
// }

import java.util.ArrayList;
class payment 
{
   public void pay(int h, double r) 
   { 
      System.out.println("pay = "+ h * r); 
   }
   public void pay(int h, double r, int b) 
   { 
      System.out.println("pay = " + h * r + b);
   }
   public void pay(int h, double r, String gender) 
   {
      if(gender.startsWith("f")) 
      {
         System.out.println("pay = " + h * r * 1.1);
      }
      if(gender.startsWith("m")) 
      {
         System.out.println("pay = " + h * r);
      }
   }
}
class arrayList2 {   
   public static ArrayList<payment> person = new ArrayList<payment>();
   public static void main(String args[]) 
   { 
      DisplayOverloadingPay person = new DisplayOverloadingPay(); 
      person.pay(30, 10.0);
      person.pay(30, 10.0, 25);
      person.pay(20, 10, "female");
   } 
}