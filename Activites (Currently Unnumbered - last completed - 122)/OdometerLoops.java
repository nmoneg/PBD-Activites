import java.util.Scanner;

public class OdometerLoops
{
	public static void main( String[] args ) throws Exception
	{
		int n;
		Scanner keyboard = new Scanner(System.in);

		System.out.print( "Which base (2-10): " );
		n = keyboard.nextInt();
		
		for ( int thous=0; thous<n; thous++ )
		
			for ( int hund=0; hund<n; hund++ )
			
				for ( int tens=0; tens<n; tens++ )
				
					for ( int ones=0; ones<n; ones++ )
					{
						System.out.print( " " + thous + "" + hund + "" + tens + "" + ones + "\r" );
						Thread.sleep(500);
					}

		System.out.println();
	}
}

/*

	1. Deleting all of the open and close braces for the outer-
		most loops while leaving the braces for the innermost
		loop does not change the output.

*/