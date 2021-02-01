import java.util.Scanner;

public class BMICategories
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print( "Your height in m: " );
        double meters = keyboard.nextDouble();
        
		System.out.print( "Your weight in kg: " );
		double kilograms = keyboard.nextDouble();
		System.out.println();

        double bmi = kilograms / (meters * meters);
        String category = "";
        
        if ( bmi < 15.0 ) {

            category = "very severely underweight";

        }

        if ( bmi >= 15.0 && bmi <= 16.0  ) {

            category = "severely underweight";

        }

        if ( bmi > 16.0 && bmi < 18.5 ) {

            category = "underweight";

        }

        if ( bmi >= 18.5 && bmi < 25.0 ) {

            category = "normal weight";

        }

        if ( bmi >= 25.0 && bmi < 30.0 ) {

            category = "overweight";

        }

        if ( bmi >= 30.0 && bmi < 35.0 ) {

            category = "moderately obese";

        }

        if ( bmi >= 35.0 && bmi < 40.0 ) {

            category = "severely obese";

        }

        if ( bmi >= 40.0 ) {

            category = "morbidly obese";

        }

        System.out.println( "Your BMI is " + bmi );
        System.out.print( "BMI Category: " + category );
        
	}
}		

