import java.util.Scanner;

public class BMICalc
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print( "Your height (feet only): " );
		int feet = keyboard.nextInt();

		System.out.print( "Your height (inches): " );
		int inches = keyboard.nextInt();

		System.out.print( "Your weight in pounds: " );
		int lbs = keyboard.nextInt();
		System.out.println();

		int feetToInches = feet * 12;
		int totalInches = feetToInches + inches;
		double meters = totalInches / 39.37;
		double kilograms = lbs / 2.205;
		double bmi = kilograms / (meters * meters);

		System.out.print( "Your BMI is " + bmi );
	}
}		




