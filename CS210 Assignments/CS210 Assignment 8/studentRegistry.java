// Matthew Clark
// CS210 Building Java Programs
// Assigment 8 - Student Registry

/* 
   This program requests a file name and reports all of the data in the file starting
   with female students followed by male students. 
*/
   
import java.io.*; 
import java.awt. *; 
import java.util. *; 
import java.util.ArrayList;
public class studentRegistry 
{   
   //Student information
   public static ArrayList<student> person = new ArrayList<student>();
   //Student counter
   public static int femaleStudentCount = 0;   
   public static int maleStudentCount = 0;   
   //Request file name
   public static void main(String[] args) throws FileNotFoundException 
   {
      Scanner console = new Scanner(System.in);
      System.out.println("What is the file name?");
      String file = console.nextLine();
      Scanner female = new Scanner(new File(file));
      Scanner femaleCount = new Scanner(new File(file));
      Scanner maleCount = new Scanner(new File(file));   
      Scanner male = new Scanner(new File(file));   
      femaleCount(femaleCount);
      femaleIntro(femaleStudentCount);
      femaleInfo(female);
      maleCountPlus(maleCount);
      maleIntro(maleStudentCount);
      getMaleStudents(male);
   }
   //Get female student ID, Name, Gender and Age.
   public static void femaleInfo(Scanner female) 
   {
      student person = new student();
      while(female.hasNextLine()) 
      {
         person.ID = female.nextInt();
         person.name = female.next();
         person.gender = female.next();
         person.age = female.nextInt();
         if(person.gender.startsWith("f")) 
         {
            System.out.print(person.ID+" ");
            System.out.print(person.name+" ");
            System.out.println(person.age);
         }
      }
   }
   //Female counter
   public static void femaleCount(Scanner femaleCount) 
   {
      student person = new student();       
      while(femaleCount.hasNextLine()) 
      {
         person.ID = femaleCount.nextInt();
         person.name = femaleCount.next();
         person.gender = femaleCount.next();
         person.age = femaleCount.nextInt();
         if(person.gender.startsWith("f")) 
         {
            femaleStudentCount++;
         }
      }     
   } 
   //This method reports how many females are listed.
   public static void femaleIntro(int femaleStudentCount) 
   {   
      System.out.println();
      System.out.println("Female students: " + femaleStudentCount);
      System.out.println("ID - Name - Age");
      System.out.println("------------------");
   }
   //Get male student ID, Name, Gender and Age.
   public static void getMaleStudents(Scanner male) 
   {
      student person = new student();      
      while(male.hasNextLine()) 
      {
         person.ID = male.nextInt();
         person.name = male.next();
         person.gender = male.next();
         person.age = male.nextInt();   
         if(person.gender.startsWith("m")) 
         {
            System.out.print(person.ID+" ");
            System.out.print(person.name+" ");
            System.out.println(person.age);
         }
      }
   }
   //Male counter
   public static void maleCountPlus(Scanner maleCount) 
   {
      student person = new student();     
      while(maleCount.hasNextLine()) 
      {
         person.ID = maleCount.nextInt();
         person.name = maleCount.next();
         person.gender = maleCount.next();
         person.age = maleCount.nextInt();
         if(person.gender.startsWith("m")) 
         {
            maleStudentCount++;
         }
      }     
   }     
   //This method reports how many males are listed.
   public static void maleIntro(int maleStudentCount) 
   {
      System.out.println();
      System.out.println("Male students: " + maleStudentCount);
      System.out.println("ID - Name - Age");
      System.out.println("----------------");
   }  
}     
class student 
{
   int ID;
   String name;
   String gender;
   int age;
}