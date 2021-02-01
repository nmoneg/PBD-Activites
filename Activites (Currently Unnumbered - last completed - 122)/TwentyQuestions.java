import java.util.Scanner;

public class TwentyQuestions
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "TWO QUESTIONS!" );
		System.out.println( "Think of an object, and I'll try to guess it." );
		System.out.println();
	
		System.out.println( "Question 1) Is it an animal, vegetable, or mineral?" );
		System.out.print( "> " );
		String type = keyboard.next();
		System.out.println();

		System.out.println( "Question 2) Is it bigger than a breadbox?" );
		System.out.print( "> " );
		String size = keyboard.next();
		System.out.println();

		String guess = "";
		
		if ( type.equals("animal") && size.equals("no") )
		{
			guess = "squirrel";
		}
		else if ( type.equals("vegetable") && size.equals("no") )
		{
			guess = "carrot";
		}
		else if ( type.equals("mineral") && size.equals("no") )
		{
			guess = "paper clip";
		}
		else if ( type.equals("animal") && size.equals("yes") )
		{
			guess = "moose";
		}	
		else if ( type.equals("vegetable") && size.equals("yes") )
		{
			guess = "watermelon";
		}
		else if ( type.equals("mineral") && size.equals("yes") )
		{
			guess = "Camaro";
		}

		System.out.println( "My guess is that you are thinking of a " + guess + "." );
		System.out.print( "I would ask you if I'm right, but I don't actually care." );
	}
}
