import java.util.Scanner;

public class CallingFunctionsFromOtherFiles
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Welcome to Mr. Mitchell's fantastic birth-o-meter!");
		System.out.println();
		System.out.println("All you have to do is enter your birth date, and it will");
		System.out.println("tell you the day of the week on which you were born.");
		System.out.println();
		System.out.println("Some automatic tests....");
		System.out.println("12 10 2003 => " + weekday(12,10,2003));
		System.out.println(" 2 13 1976 => " + weekday(2,13,1976));
		System.out.println(" 2 13 1977 => " + weekday(2,13,1977));
		System.out.println(" 7  2 1974 => " + weekday(7,2,1974));
		System.out.println(" 1 15 2003 => " + weekday(1,15,2003));
		System.out.println("10 13 2000 => " + weekday(10,13,2000));
		System.out.println();

		System.out.println("Now it's your turn!  What's your birthday?");
		System.out.print("Birth date (mm dd yyyy - hit ENTER between each entry): ");
		int mm = keyboard.nextInt();
		int dd = keyboard.nextInt();
		int yyyy = keyboard.nextInt();

		// put a function call for weekday() here

		String date = weekday(mm, dd, yyyy);

		System.out.println("You were born on " + date + "!");
	}


	public static String weekday( int mm, int dd, int yyyy )
	{
		int yy, total;
		String date = "";

		// bunch of calculations go here

		yy = yyyy - 1900;
		total = yy/4;
		total = total + yy;
		total = total + dd;
		total = total + MonthOffset.month_offset(mm);

		if ( WeekdayCalculator.is_leap(yyyy) == true && mm <= 2 ){
			total = total - 1;
		}
		
		date = WeekdayName.weekday_name(total%7) + ", " + MonthName.month_name(mm) + " " + dd + ", " + yyyy;

		return date;
	}

}
