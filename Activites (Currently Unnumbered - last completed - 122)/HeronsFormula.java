public class HeronsFormula
{
	public static void main( String[] args )
	{
		double a;
		
		a = triangleArea(3, 3, 3);
		System.out.println("A triangle with sides 3,3,3 has an area of " + a );

		a = triangleArea(3, 4, 5);
		System.out.println("A triangle with sides 3,4,5 has an area of " + a );
 
		a = triangleArea(7, 8, 9);
		System.out.println("A triangle with sides 7,8,9 has an area of " + a );

		System.out.println("A triangle with sides 5,12,13 has an area of " + triangleArea(5, 12, 13) );
		System.out.println("A triangle with sides 10,9,11 has an area of " + triangleArea(10, 9, 11) );
		System.out.println("A triangle with sides 8,15,17 has an area of " + triangleArea(8, 15, 17) );
		System.out.println("A triangle with sides 9, 9, 9 has an area of " + triangleArea(9, 9, 9) );
	}
 
	public static double triangleArea( int a, int b, int c )
	{
		// the code in this function computes the area of a triangle whose sides have lengths a, b, and c
		double s, A;

		s = (a+b+c) / 2.0;
		A = Math.sqrt( s*(s-a)*(s-b)*(s-c) );

		return A;
		// ^ after computing the area, "return" it
	}

	//1. Both files (HeronsFormula.java and HeronsFormulaNoFunction.java)
	//		produce the same output.

	//2. HeronsFormula.java is 29 lines long, while HeronsFormulaNoFunction.java
	//		is 50 lines long.

	//3. It is much easier to modify the code that uses a function,
	//		as with HeronsFormula.java.

	//4. It much easier to add the area of a triangle with side
	//		lengths of 9, 9, 9, to HeronsFormula.java.
}
