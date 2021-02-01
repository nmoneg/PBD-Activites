public class NumbersAndMath
{
	public static void main( String[] args )
	{
		System.out.println( "I will now count my chickens:" );
		// Adds the resulting values "30" and "97" to "Hens" and "Roosters" respectfully, and prints them.
		System.out.println( "Hens " + ( 25 + 30 / 6 ) );  // 30 divided by 6, then added to 25, is 30. 
		System.out.println( "Roosters " + ( 100 - 25 * 3 % 4 ) );  // 25 multiplied by 3, modulo 4, subtracted from 100, is 97.
		// Prints "Now I will count the eggs:"
		System.out.println( "Now I will count the eggs:" );
		// Prints "6.75".
		System.out.println( 3.0 + 2 + 1 - 5 + 4 % 2 - 1.0 / 4.0 + 6 );// 3 plus 2 plus 1 minus 5 plus 0 (4 modulo 2 is 0) minus 0.25 plus 6, is 6.75.
		// Prints "Is it true that 3 + 2 < 5 - 7?"
		System.out.println( "Is it true that 3 + 2 < 5 - 7?" ); 
		// Prints "false"
		System.out.println( 3 + 2 < 5 - 7 );// 5 (3+2) is not less than -2 (5-7).
		// Prints "What is 3 + 2? " with "5" and "What is 5 - 7? " with -2.
		System.out.println( "What is 3 + 2? " + ( 3 + 2 ) );
		System.out.println( "What is 5 - 7? " + ( 5 - 7 ) );
		//Prints "Oh, that's why it's false."
		System.out.println( "Oh, that's why it's false." );

		System.out.println( "How about some more." );

		System.out.println( "Is it greater? " + ( 5 > -2 ) );
		System.out.println( "Is it greater or equal? " + ( 5 >= -2 ) );
		System.out.println( "Is it less or equal? " + ( 5 <= -2 ) );
	}
}