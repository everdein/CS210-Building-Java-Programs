// Matthew Clark
// CS210 Building Java Programs
// Assigment 4 Question 9
// This program to find the TRIPLE duplicate values of an array of string values. */

import java.util.ArrayList;
public class ex9TripleDuplicateString 
{
   //This method locates triple duplicates within my array and reports them.
	public static void main(String[] args) 
	{
		String[] my_array = { "Wilson", "Sherman", "Lynch", "Wilson", "Graham", "Wilson", "Lynch" };
		ArrayList<Player> players = new ArrayList<>();
		for(int i = 0; i < my_array.length; i++) 
		{
			boolean alreadyInList = false;
			for(Player player : players) 
			{
				if(player.name.equals(my_array[i])) 
				{
					alreadyInList = true;
					player.encountered();
				}
			}
			if(!alreadyInList) 
			{
				players.add(new Player(my_array[i]));
			}
		}
		for(Player player : players) 
		{
			if(player.getOccurrences() == 3) 
			{
				System.out.println("Duplicate is: " + player.name);
			}
		}
	}
}
class Player 
{
	public String name;
	public int encounteredCount;
	public Player(String name) 
	{
		this.name = name;
		this.encounteredCount = 1;
	}
	public void encountered() 
	{
		encounteredCount++;
	}
	public int getOccurrences() 
	{
		return encounteredCount;
	}
}
