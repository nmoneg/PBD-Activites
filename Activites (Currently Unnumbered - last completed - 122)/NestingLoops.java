public class NestingLoops
{
	public static void main( String[] args )
	{
		// this is #1 - I'll call it "CN"
		for ( int n=1; n <= 3; n++  )
		{
			for ( char c='A'; c <= 'E'; c++ )
			{
				System.out.println( c + " " + n );
			}
		}

		System.out.println("\n");

		// this is #2 - I'll call it "AB"
		for ( int a=1; a <= 3; a++ )
		{
			for ( int b=1; b <= 3; b++ )
			{
				System.out.print( a + "-" + b + " " );
			}
			// * You will add a line of code here.
			System.out.println();
		}

		System.out.println("\n");

		/*
		1. In the first set of nested loops ("CN"), the "n"
			variable changes faster, the variable controlled
			by the inner loop:

			A 1
			A 2
			A 3
			B 1
			B 2
			B 3
			C 1 
			C 2
			...

		2. If the loop order is changed so that the "c" loop 
			is on the inside and the "n" loop is on the outside,
			the first column changes faster instead of the second one:

			A 1
			B 1
			C 1
			D 1
			E 1
			A 2
			B 2
			C 2
			...

		3. If the 'print()' statement in the second set of 
			nested loops ("AB") is changed to 'println()', the orientation of the second
			set of digits is changed from horizontal to vertical.

			1-1 1-2 1-3 2-1 2-2 2-3 3-1 3-2 3-3

			to

			1-1 
			1-2 
			1-3 
			2-1 
			2-2 
			2-3 
			3-1 
			3-2 
			3-3 

		4. Adding a 'println()''statement to the outer loop of
			the "AB" set of loops changes the grouping of the 
			second output. Each iteration of the outer loop is
			now on a new line.

			1-1 1-2 1-3 
			2-1 2-2 2-3 
			3-1 3-2 3-3 
		
		*/

	}
}
