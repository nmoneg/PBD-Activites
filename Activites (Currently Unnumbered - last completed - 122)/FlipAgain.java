import java.util.Random;
import java.util.Scanner;

public class FlipAgain
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random rng = new Random();

		String again;

		do {
			
			int flip = rng.nextInt(2);
			String coin;

			if ( flip == 1 )
				coin = "HEADS";
			else
				coin = "TAILS";

			System.out.println( "You flip a coin and it is... " + coin );

			System.out.print( "Would you like to flip again (y/n)? " );
			again = keyboard.next();

		} while ( again.equals("y") );

		// 3. The initial code here contained a "while" loop instead of a
		//		"do-while" loop. With the "while" loop, the code initially 
		//		did not complie because it could not test the conditons with 
		//		a variable that had no value yet. Changing it into a "do-while"
		//		loop would allow the user to enter a value for the "again" 
		//		variable, and then test the loop conditions at the end.
	}
}
