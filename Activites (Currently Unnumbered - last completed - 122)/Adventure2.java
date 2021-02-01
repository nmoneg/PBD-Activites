import java.util.Scanner;

public class Adventure2
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int nextroom = 1;
		String choice = "";

		System.out.println( "NEW ADVENTURE!!!" );

		while ( nextroom > 0 )
		{
			if ( nextroom == 1 )
			{
				System.out.println( "\nYou are in a creepy house! Would you like to go \"upstairs\" or into the \"kitchen\"?" );
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if ( choice.equals("kitchen") )
					nextroom = 2;
				else if ( choice.equals("upstairs") )
					nextroom = 4;
				else
					System.out.println( "ERROR." );
			}
			if ( nextroom == 2 )
			{
				System.out.println( "\nThere is a long countertop with dirty dishes everywhere. Off to one side there is, as you'd expect, a refrigerator. You may open the \"refrigerator\" or go \"back\"." );
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if ( choice.equals("back") )
					nextroom = 1;
				else if ( choice.equals("refrigerator") )
					nextroom = 3;
				else
					System.out.println( "ERROR." );
			}
			if ( nextroom == 3 )
			{
				System.out.println( "\nInside the refrigerator you see food and stuff. It looks pretty nasty. Would you like to eat some of the food (\"yes\" or \"no\"), or go \"back\"?" );
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if ( choice.equals("back") )
					nextroom = 2;
				else if ( choice.equals("yes"))
					nextroom = 0;
				else if ( choice.equals("no") ) 
					nextroom = -1;
				else
					System.out.println( "ERROR." );
			}
			if ( nextroom == 4 )
			{
				System.out.println( "\nUpstairs you see a hallway. At the end of the hallway is the master \"bedroom\". You can also go \"back\" downstairs. Where would you like to go?" );
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if ( choice.equals("back") )
					nextroom = 1;
				else if ( choice.equals("bedroom") )
					nextroom = 5;
				else
					System.out.println( "ERROR." );
			}
			if ( nextroom == 5 )
			{
				System.out.println( "\nThe bedroom is plain. There is only a lone twin-sized bed in the middle of the room. Should you lay in the \"bed\", or go \"back\" in the hallway?" );
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if ( choice.equals("back") )
					nextroom = 4;
				else if ( choice.equals("bed") )
					nextroom = 6;
				else
					System.out.println( "ERROR." );
			}
			if ( nextroom == 6 )
			{
				System.out.println( "\nYou decide to lie down in the bed. It's incredibly soft considering how cheap it looks. Should you take a \"nap\" or \"no\", or should you \"get up\"?" );
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if ( choice.equals("get up") )
					nextroom = 5;
				else if ( choice.equals("nap") )
					nextroom = 0;
				else if ( choice.equals("no"))
					nextroom = -2;
				else
					System.out.println( "ERROR." );
			}
		}

		if ( nextroom == -1 )
			System.out.println( "\nYou decide that it would be best to leave the questionable food alone. As you turn around to leave, something from inside the refrigerator grabs you, pulling you into it's chilly embrace. Your vision goes dark as you realize that you will soon become the leftover food you so cruelly turned away....\n\nEND." );
		else if ( nextroom == -2 )
			System.out.println( "\nYou decide to just lie idly on the bed, daydreaming. Suddenly the bed swallows you whole, enveloping you in darkness. It seems as though you were forced to take a nap in the end after all...\n\nEND");
		else
			System.out.println( "\nEverything suddenly turns white as your vision fills with light. You lift yourself off of your bed and turn to look at your clock - it's time to get up. It seems it was all a dream...\n\nEND" );
			
		keyboard.close();
	}	
}
