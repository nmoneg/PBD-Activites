public class WhatIf
{
	public static void main( String[] args )
	{
		
		// 1. The "if" statement will execute the code under it, if the conditions between the parenthesis are met.

		// 2. The curly braces in the "if" statement contain the code that will execute.

		int people = 30;
		int cats = 30;
		int dogs = 15;
	
		if ( people < cats )
		{
			System.out.println( "Too many cats! The world is doomed!" );
		}

		if ( people > cats )
		{
			System.out.println( "Not many cats! The world is saved!" );
		}

		if ( people < dogs )
		{
			System.out.println( "The world is drooled on!" );
		}

		if ( people > dogs ) 
		{
			System.out.println( "The world is dry!" );
		}
	
		dogs += 5; 
	
		if ( people >= dogs )
		{
			System.out.println( "People are greater than or equal to dogs." );
		}

		if ( people <= dogs )
		{	
			System.out.println( "People are less than or equal to dogs." );
		}

		if ( people == dogs )
		{
			System.out.println( "People are dogs." );
		}
	}
}