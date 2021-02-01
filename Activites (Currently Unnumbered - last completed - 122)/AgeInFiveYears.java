import java.util.Scanner;

public class AgeInFiveYears
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print( "Hello. What is your name? " );
		String name = keyboard.next();
		System.out.println();

		System.out.print( "Hi, " + name + "! How old are you? " );
		int age = keyboard.nextInt();
		System.out.println();
		
		int future, past;
		future = age + 5;
		past = age - 5;

		System.out.println( "Did you know that in five years you will be " + future + " years old?" );
		System.out.println( "And five years ago you were " + past + "! Imagine that!" );
	}
}