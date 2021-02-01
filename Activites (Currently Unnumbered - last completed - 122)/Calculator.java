import java.util.Scanner;

public class Calculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		double a, b, c;
		String op;

		do
		{
			System.out.print("> ");
			a  = keyboard.nextDouble();
			op = keyboard.next();
			b  = keyboard.nextDouble();

			if ( a == 0 ) {
				break;
			} else if ( op.equals("+") ) {
				c = a + b;
			} else if ( op.equals("-") ) {
				c = a - b;
			} else if ( op.equals("*") ) {
				c = a*b;
			} else if ( op.equals("/") ) {
                c = a/b;
            } else if ( op.equals("^") ) {
                c = Math.pow(a, b);
            } else if ( op.equals("%") ) {
                c = a%b;
			} else {	
				System.out.println("Undefined operator: '" + op + "'.");
				c = 0;
			}

			System.out.println(c);

		} while ( true );

		System.out.println( "Bye, now." );

	}
}

