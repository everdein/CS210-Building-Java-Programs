// Matthew Clark
// CS210 Building Java Programs
// Assigment 7 - Registration

/* 
	This program will setup a user with a username. The program will store
   the username and provide a complete list of useranmes that have been created.
   In addition, this program will inform the user if the requested username is
   already in use, does not meet the requirements of being 6 characters long, 
   and does not start with a question mark or number.
*/

import java.io.*;
import java.util.*;
public class registration 
{   
   //Collects information from the user.
   public static final Scanner console = new Scanner(System.in);  
   //Name of the username file.
   public static final String USERNAME_FILE = "user.txt";
   //Username Requirements 
	public static final String REQUIREMENT_1 = "Username must be at least 6 characters.";
	public static final String REQUIREMENT_2 = "Username must not start with a number.";
	public static final String REQUIREMENT_3 = "Username cannot start with a question mark (?)";
	public static final String REQUIREMENT_4 = "You must choose a unique Username";
   //Produces the flow of aquiring user information and storing it.
	public static void main(String[] args) throws FileNotFoundException 
	{ 
		Scanner fileScan = openUsernameFile(USERNAME_FILE);
		Scanner fileScanForCounting = openUsernameFile(USERNAME_FILE);
      String[] usernames = retrieveUsernames(USERNAME_FILE, fileScan, fileScanForCounting);
		do 
		{
         listUsernames(usernames);
         String username = requestUsername(usernames);
			storeUsernamesIntoFile(usernames, username);
			fileScan = openUsernameFile(USERNAME_FILE);
         fileScanForCounting = openUsernameFile(USERNAME_FILE);
         usernames = retrieveUsernames(USERNAME_FILE, fileScan, fileScanForCounting);
			fileScan = openUsernameFile(USERNAME_FILE);
		} 
		while(requestAnotherUsername());
   }
   //Request Username
	public static String requestUsername(String[] usernames) 
	{
		String newUsername = "";
		do 
		{
			newUsername = promptUserName();
		} 
		while(checkUsername(newUsername, usernames) == false);
		return newUsername;
	}
   //Propt Username
	public static String promptUserName() 
	{
		String input = "";
      System.out.println("Please create your username.");
		input = console.nextLine();
		return input;
	}
   //CHECK USERNAME CRITERIA
	public static boolean checkUsername(String newUsername, String[] usernames) 
	{
		boolean valid = true;
		boolean[] criteria = { sixChars(newUsername), noNumber(newUsername), noQuestion(newUsername), unique(newUsername, usernames) };
		for(int i = 0; i < criteria.length; i++) 
		{
			if(!criteria[i]) 
			{
				valid = false;
				printMissingRequirements(criteria);
         }
      }
      return valid;
	}
   //REQUIREMENT 1: 6 CHARACTER MINIMUM
	public static boolean sixChars(String user) 
	{
      return user.length() > 5;
   }   
	//REQUIREMENT 2: CAN'T START WITH A #.
	public static boolean noNumber(String user) 
	{
		try 
		{
			Integer.parseInt(user.substring(0, 1));
		} 
		catch(NumberFormatException e) 
		{
			return true;
		}
		return false;
	}                 
	//REQUIREMENT 3: CAN'T START WITH A ?.
	public static boolean noQuestion(String user) 
	{
		return !user.startsWith("?");
	}
	//REQUIREMENT 4: USERNAME MUST BE UNIQUE
	public static boolean unique(String user, String[] usernames) 
	{
		for(int i = 0; i < usernames.length; i++) 
		{
			if(usernames[i].equals(user)) 
			{
				return false;
			}
		}
		return true;
	}
	//Print requirements   
	public static void printMissingRequirements(boolean[] criteria) 
	{
		System.out.println();
		for(int i = 0; i < criteria.length; i++) 
		{
			if(!criteria[i]) 
			{
				printRequirement(i + 1);
			}
		}
		System.out.println();
	}   
	//Print requirements
	public static void printRequirement(int requirementId) 
	{
		switch(requirementId) 
		{
		case 1:
			System.out.format(REQUIREMENT_1 + "%n");
			break;
		case 2:
			System.out.format(REQUIREMENT_2 + "%n");
			break;
		case 3:
			System.out.format(REQUIREMENT_3 + "%n");
			break;
		case 4:
			System.out.format(REQUIREMENT_4 + "%n");
			break;
		default:
			break;
		}
	}
   //Store Username
	public static void storeUsernamesIntoFile(String[] usernames, String username) throws FileNotFoundException 
	{
      PrintStream ps = new PrintStream(new File(USERNAME_FILE));
			for(int i = 0; i < usernames.length; i++) 
			{
				ps.println(usernames[i]);
			}
			ps.println(username);
   }
   //Open Username File
	public static Scanner openUsernameFile(String fileName) throws FileNotFoundException 
	{
		Scanner fileScan = new Scanner(new File(fileName));
		return fileScan;
	}
   //Get Usernames
	public static String[] retrieveUsernames(String USERNAME_FILE, Scanner fileScan, Scanner fileScanForCounting) 
	{
      int count = 0;
		while(fileScanForCounting.hasNextLine()) 
		{
         count++;
         fileScanForCounting.nextLine();
      }
         String[] usernames = new String[count];
		for(int i = 0; i < count; i++) 
		{
         usernames[i] = fileScan.nextLine();
      }
      return usernames;
   }
   //List Usernames
	public static void listUsernames(String[] usernames) 
	{
		System.out.println("Registered usernames:");
		for (int i = 0; i < usernames.length; i++) 
		{
			System.out.println(usernames[i]);
		}
      System.out.println();
	}
   //Request Another Username
	public static boolean requestAnotherUsername() 
	{
		System.out.format("Do you want to register another username? [Y/n] ");
		String input = console.nextLine();
		if(input.toLowerCase().startsWith("y")) 
		{
			return true;
		}
		return false;
	}
}