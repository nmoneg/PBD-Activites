import java.util.Scanner;

public class DumbCalculator 
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);	

		System.out.print( "What is your first number? " );
		double first = keyboard.nextDouble();
		
		System.out.print( "What is your second number? " );
		double second = keyboard.nextDouble();
		
		System.out.print( "What is your third number? " );
		double third = keyboard.nextDouble();
		System.out.println();

		double answer = ( first + second + third ) / 2;

		System.out.print( "( " + first + " + " + second + " + " + third + " ) / 2 is... " + answer );
	}
}
