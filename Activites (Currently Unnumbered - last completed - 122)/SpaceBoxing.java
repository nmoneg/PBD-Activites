import java.util.Scanner;

public class SpaceBoxing
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "Please enter your current earth weight: " );
		int weight = keyboard.nextInt();
		System.out.println();

		System.out.println( "I have information for the following planets:" );
		System.out.println( "	1. Venus	2. Mars		3. Jupiter" );
		System.out.println( "	4. Saturn	5. Uranus	6. Neptune" );
		System.out.println();

		System.out.print( "Which planet are you visiting? " );
		int planet = keyboard.nextInt();
		System.out.println();
		
		double newMass = 0;		

		if ( planet == 1 )
		{
			newMass = weight * 0.78;
		}
		else if ( planet == 2 )
		{
			newMass = weight * 0.39;
		}
		else if ( planet == 3 )
		{
			newMass = weight * 2.65;
		}
		else if ( planet == 4 )
		{
			newMass = weight * 1.17;
		}
		else if ( planet == 5 )
		{
			newMass = weight * 1.05;
		}
		else if ( planet == 6 )
		{
			newMass = weight * 1.23;
		}

		System.out.print( "Your weight would be " + newMass + " pounds on that planet." );
	}
}