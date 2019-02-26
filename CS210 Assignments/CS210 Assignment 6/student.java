// Matthew Clark
// CS210 Building Java Programs
// Assigment 6 - Student

/* 
   This program requests a file name and a student gender. Once it has this information
   it will calculate how many students of that gender there are and provide the average age.
*/
   
import java.io.*;
import java.util.*;
public class student 
{   
   //Stoles student ages.
   public static int[] studentAges = new int[14];
   //Student counter
   public static int count = 0;   
   //Request file name
   public static void main(String[] args) throws FileNotFoundException 
   {
      Scanner console = new Scanner(System.in);
      System.out.println("What is the file name?");
      String file = console.nextLine();
      Scanner input = new Scanner(new File(file));
      System.out.println("Which gender do you want?");
      String requestGender = console.nextLine();      
      getStudents(input, requestGender);
      double average = average(studentAges);
      reportResults(requestGender, average);
   }
   //Calculate average age of requested gender.
   public static double average(int[] studentAges) 
   {
      double sum = 0.0;
      for(int i = 0; i < count; i++) 
      {
         sum+= studentAges[i];
      }   
      double average = sum/count;
      return average;
   }
   //Get student ID, Name, Gender and Age.
   public static void getStudents(Scanner input, String requestGender) 
   {
      while (input.hasNextLine()) 
      {
         int ID = input.nextInt();
         String name = input.next();
         String gender = input.next();
         int age = input.nextInt();
         if(requestGender.startsWith(gender)) 
         {
            studentAges[count] = age;
            System.out.println(name);
            count++;
         }
      }
   }
   //Reports the data restults.
   public static void reportResults(String requestGender, double average) 
   {
      System.out.println("We have " + count + " " + requestGender + " students.");
      System.out.println("Average age is " + average + ".");   
   }
}      