import java.util.Scanner;

public class TheForgetfulMachine
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "Give me a word!" );
		keyboard.next();

		System.out.println( "Give me a second word!" );
		keyboard.next();

		System.out.println();

		System.out.println( "Great, now your favorite number?" );
		keyboard.nextDouble();

		System.out.println( "And your second-favorite number..." );
		keyboard.nextDouble();

		System.out.println();

		System.out.print( "Whew! Wasn't that fun?" );

	}
} 
