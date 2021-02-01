public class ElseAndIf
{
	public static void main( String[] args )
	{

		// 1.	The "else if" and "else" statements are adding additional optional 
		//    	executions if the conditions of the "if" statement are not met.

		// 2. 	The only difference between "else" and "else if" is that "else if" 
		//    	is used when there is more than one additional condition. For
		//	example, when "else" is removed from the first "else if" statement
		//	below, the original three-part "if" statement becomes two separate "if" statements,
		//	with the second statement having one additonal condition. In such
		//	a situation, the program would print both "We should take the cars"
		//	and "We can't decide" at the same time, which wouldn't make sense.
	
		int people = 30;
		int cars = 40;
		int buses = 15;

		if ( cars > people )
		{
			System.out.println( "We should take the cars." );
		}
		else if ( cars < people )
		{
			System.out.println( "We should not take the cars." );
		}
		else
		{	
			System.out.println( "We can't decide." );
		}

		if ( buses > cars )
		{
			System.out.println( "That's too many buses." );
		}
		else if ( buses < cars ) 
		{
			System.out.println( "Maybe we could take the buses." );
		}
		else
		{
			System.out.println( "We still can't decide." );
		}

		if ( people > buses )
		{
			System.out.println( "All right, let's just take the buses." );
		}
		else
		{
			System.out.println( "Fine, let's stay home then." );
		}
	}
}