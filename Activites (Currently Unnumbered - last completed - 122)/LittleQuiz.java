import java.util.Scanner;

public class LittleQuiz
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int answer = 0;
		int correct = 0;		

		System.out.print( "Are you ready for a quiz? " );
		keyboard.next();
		System.out.println( "Okay, here it comes!" );
		System.out.println();
		
		System.out.println( "Q1) What is the capital of Alaska?" );
		System.out.println( "	1) Melbourne" );
		System.out.println( "	2) Anchorage" );
		System.out.println( "	3) Juneau" );
		System.out.println();
		
		System.out.print( "> " );
		answer = keyboard.nextInt();
		System.out.println();		

		if ( answer == 3 )
		{
			correct++;
			
			System.out.println( "That's right!" );
		}
		else
		{
			System.out.println( "Sorry, that's incorrect." );
		}
		
		System.out.println();
		System.out.println( "Q2) Can you store the value \"cat\" in a variable of type int?" );
		System.out.println( "	1) Yes" );
		System.out.println( "	2) No" );
		System.out.println();
		
		System.out.print( "> " );
		answer = keyboard.nextInt();
		System.out.println();
		
		if ( answer == 2 )
		{
			correct++;

			System.out.println( "That's right!" );
		}
		else
		{
			System.out.println( "Sorry, that's incorrect." );
		}

		System.out.println();
		System.out.println( "What is the result of 9+6/3?" );
		System.out.println( "	1) 5" );
		System.out.println( "	2) 11" );
		System.out.println( "	3) 15/3" );
		System.out.println();
	
		System.out.print( "> " );
		answer = keyboard.nextInt();
		System.out.println();

		if ( answer == 2 )
		{
			correct++;

			System.out.println( "That's right!" );
		}
		else 
		{
			System.out.println( "Sorry, that's incorrect." );
		}

		System.out.println();
		System.out.println();
		System.out.println( "Overall, you got " + correct + " out of 3 correct." );
		System.out.print( "Thanks for playing!" );
	}
}	 		