import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class AreaCalculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Shape Area Calulator Version 0.1 (c) 2019.");
        
        int radius, length, width, side, base, height;
        int shape = 0;
        double result = 0;

        while ( shape != 5 ) {
        
            System.out.println();
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println();
            System.out.println("1) Triangle");
            System.out.println("2) Rectangle");
            System.out.println("3) Square");
            System.out.println("4) Circle");
            System.out.println("5) Quit");
            System.out.print("Which shape: ");
            shape = keyboard.nextInt();
            System.out.println();
            
            if (shape == 1){
                System.out.print("Base: ");
                base = keyboard.nextInt();
                System.out.print("Height: ");
                height = keyboard.nextInt();
                result = area_triangle(base, height);
                System.out.println();
                System.out.println( "The area is " + result + "." );
            }
            else if (shape == 2){
                System.out.print("Length: ");
                length = keyboard.nextInt();
                System.out.print("Width: ");
                width = keyboard.nextInt();
                result = area_rectangle(length, width);
                System.out.println();
                System.out.println( "The area is " + result + "." );
            }
            else if (shape == 3){
                System.out.print("Side length: ");
                side = keyboard.nextInt();
                result = area_square(side);
                System.out.println();
                System.out.println( "The area is " + result + "." );
            }
            else if (shape == 4){
                System.out.print("Radius: ");
                radius = keyboard.nextInt();
                result = area_circle(radius);
                System.out.println();
                System.out.println( "The area is " + result + "." );
            }
            else if (shape == 5){
                System.out.println("Goodbye.");
            }
            else {
                System.out.println("Please select a number from 1 to 5.");
            }

        }

	}

	public static double area_circle( int radius )
	{
        double result;

        result = Math.PI * Math.pow(radius, 2);         
		return result;
	}

	public static int area_rectangle( int length, int width )
	{
        int result;

        result = length*width;
		return result;
	}

	public static int area_square( int side )
	{
        int result;

        result = side*side;
		return result;
	}

	public static double area_triangle( int base, int height )
	{ 
        double result;

        result = 0.5 * base *height;
		return result;
	}
        
}
