import java.util.Scanner;

public class PictureMenu
{
	public static void main( String[] args )
	{
		Scanner kb = new Scanner(System.in);
		int choice;
		
		System.out.println( "1. Butterfly " );
		System.out.println( "2. Elephant  " );
		System.out.println( "3. Teddy Bear" );
		System.out.println( "4. Snake     " );
		
		System.out.print( "\nWhich animal to draw? " );
		choice = kb.nextInt();
		System.out.println();
		
		if ( choice == 1 )
		{
			butterfly();
			butterfly();
			// 2. Changing the code here so that the program calls
			//		the butterfly function twice results in the 
			//		'butterfly' being printed twice.
		}
		else if ( choice == 2 )
		{
			elephant();
		}
		else if ( choice == 3 )
		{
			teddybear();
		}
		else if ( choice == 4 )
		{
			snake();
		}
		else 
		{
			System.out.println( "Sorry, that wasn't one of the choices." );
		}

		System.out.println( "\nGoodbye!" );
	}
	
	public static void butterfly()
	{
		System.out.println("  .==-.                   .-==.     ");
		System.out.println("   \\()8`-._  `.   .'  _.-'8()/     ");
		System.out.println("   (88\"   ::.  \\./  .::   \"88)     ");
		System.out.println("    \\_.'`-::::.(#).::::-'`._/      ");
		System.out.println("      `._... .q(_)p. ..._.'         ");
		System.out.println("        \"\"-..-'|=|`-..-\"\"       ");
		System.out.println("        .\"\"' .'|=|`. `\"\".       ");
		System.out.println("      ,':8(o)./|=|\\.(o)8:`.        ");
		System.out.println("     (O :8 ::/ \\_/ \\:: 8: O)      ");
		System.out.println("      \\O `::/       \\::' O/       ");
		System.out.println("       \"\"--'         `--\"\"   hjw");
	}
	
	public static void elephant()
	{
		System.out.println("       _..--\"\"-.                  .-\"\"--.._ ");
		System.out.println("   _.-'         \\ __...----...__ /         '-._");
		System.out.println(" .'      .:::...,'              ',...:::.      '.");
		System.out.println("(     .'``'''::;                  ;::'''``'.     )");
		System.out.println(" \\             '-)              (-'             /");
		System.out.println("  \\             /                \\             /");
		System.out.println("   \\          .'.-.            .-.'.          /");
		System.out.println("    \\         | \\0|            |0/ |         /");
		System.out.println("    |          \\  |   .-==-.   |  /          |");
		System.out.println("     \\          `/`;          ;`\\`          /");
		System.out.println("      '.._      (_ |  .-==-.  | _)      _..'");
		System.out.println("          `\"`\"-`/ `/'        '\\` \\`-\"`\"`");
		System.out.println("               / /`;   .==.   ;`\\ \\");
		System.out.println("         .---./_/   \\  .==.  /   \\ \\");
		System.out.println("        / '.    `-.__)       |    `\"");
		System.out.println("       | =(`-.        '==.   ;");
		System.out.println(" jgs    \\  '. `-.           /");
		System.out.println("         \\_:_)   `\"--.....-'");
	}
	
	public static void teddybear()
	{
		System.out.println("            ___   .--. ");
		System.out.println("      .--.-\"   \"-' .- |");
		System.out.println("     / .-,`          .'");
		System.out.println("     \\   `           \\");
		System.out.println("      '.            ! \\");
		System.out.println("        |     !  .--.  |");
		System.out.println("        \\        '--'  /.____");
		System.out.println("       /`-.     \\__,'.'      `\\");
		System.out.println("    __/   \\`-.____.-' `\\      /");
		System.out.println("    | `---`'-'._/-`     \\----'    _");
		System.out.println("    |,-'`  /             |    _.-' `\\");
		System.out.println("   .'     /              |--'`     / |");
		System.out.println("  /      /\\              `         | |");
		System.out.println("  |   .\\/  \\      .--. __          \\ |");
		System.out.println("   '-'      '._       /  `\\         /");
		System.out.println("      jgs      `\\    '     |------'`");
		System.out.println("                 \\  |      |");
		System.out.println("                  \\        /");
		System.out.println("                   '._  _.'");
		System.out.println("                      ``");
		
	}
	
	public static void snake()
	{
		System.out.println("         ,,'6''-,.");
		System.out.println("        <====,.;;--.");
		System.out.println("        _`---===. \"\"\"==__");
		System.out.println("      //\"\"@@-\\===\\@@@@ \"\"\\\\");
		System.out.println("     |( @@@  |===|  @@@  ||");
		System.out.println("      \\\\ @@   |===|  @@  //");
		System.out.println("        \\\\ @@ |===|@@@ //");
		System.out.println("         \\\\  |===|  //");
		System.out.println("___________\\\\|===| //_____,----\"\"\"\"\"\"\"\"\"\"-----,_");
		System.out.println("  \"\"\"\"---,__`\\===`/ _________,---------,____    `,");
		System.out.println("             |==||                           `\\   \\");
		System.out.println("            |==| |          pb                 )   |");
		System.out.println("           |==| |       _____         ______,--'   '");
		System.out.println("           |=|  `----\"\"\"     `\"\"\"\"\"\"\"\"         _,-'");
		System.out.println("            `=\\     __,---\"\"\"-------------\"\"\"''");
		System.out.println("                \"\"\"\"		");
	}
}
