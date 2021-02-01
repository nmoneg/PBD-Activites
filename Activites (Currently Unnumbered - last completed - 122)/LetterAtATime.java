import java.util.Scanner;

public class LetterAtATime
{
	public static void main( String[] args )
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("What is your message? ");
		String message = kb.nextLine();

		System.out.println("\nYour message is " + message.length() + " characters long.");
		System.out.println("The first character is at position 0 and is '" + message.charAt(0) + "'.");
		int lastpos = message.length() - 1;
		System.out.println("The last character is at position " + lastpos + " and is '" + message.charAt(lastpos) + "'.");
		System.out.println("\nHere are all the characters, one at a time:\n");

		for ( int i=0; i<message.length(); i++ )
		{
			System.out.println("\t" + i + " - '" + message.charAt(i) + "'");
		}

		int vowel_count = 0;

		for ( int i=0; i<message.length(); i++ )
		{
			char letter = message.charAt(i);
			if ( letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E' || letter == 'i' || letter == 'I' || letter == 'o' || letter == 'O' || letter == 'u' || letter == 'U' )
			{
				vowel_count++;
			}
		}

		System.out.println("\nYour message contains " + vowel_count + " vowels. Isn't that interesting?");
		kb.close();
		// 1. If 'i < message.length()' is changed to 'i <= message.length()'
		//		an error message will appear stating that the final character
		//		position is out of range. (3.) This is because 'charAt()' starts 
		//		at zero. The final character is at position 30, not 31, the 
		//		actual length of the string.

		// 2. If a string variable contains the value "box", the length()
		//		would be '3', however the position of the last character, 'x'
		//		is '2', because the first position is '0', not '1'.

	}
}
