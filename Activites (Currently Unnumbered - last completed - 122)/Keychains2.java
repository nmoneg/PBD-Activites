import java.util.Scanner;

public class Keychains2
{
	public static void main( String[] args )
	{
		
		System.out.println("Ye Olde Keychain Shoppe");
		
		int cart = 0;
		int price = 10;
		int choice = 0;
		Scanner keyboard = new Scanner(System.in);
	

		while (choice != 4) {

			System.out.println();
			System.out.println("1. Add Keychains to Order");
			System.out.println("2. Remove Keychains from Order");
			System.out.println("3. View Current Order");
			System.out.println("4. Checkout");
			System.out.println();
			System.out.print("Please enter your choice: ");
			choice = keyboard.nextInt();
			System.out.println();

			if (choice == 1) {
				cart = add_keychains(cart);
			} else if (choice == 2) {
				cart = remove_keychains(cart);
			} else if (choice == 3) {
				view_order( cart, price );
			} else if (choice == 4) {
				checkout( cart, price );
			} else {
				System.out.println("Please enter a valid number.");
			}

		}

    }
	
	public static int add_keychains( int x ) 
	{
        int add, total; 
        Scanner keyboard = new Scanner(System.in);

		System.out.print( "You have " + x + " keychains. How many to add? " );
		add = keyboard.nextInt();
		total = x + add;
        System.out.println( "You now have " + total + " keychains." );

        return total;

	}


	public static int remove_keychains( int x ) 
	{

        int remove, total;
        Scanner keyboard = new Scanner(System.in);

		System.out.print( "You have " + x + " keychains. How many to remove? " );
        remove = keyboard.nextInt();
        total = x - remove;
        System.out.println( "You now have " + total + " keychains." );

        return total;

	}


	public static void view_order( int x, int p ) 
	{

        int cost = x*p;
        System.out.println( "You have " + x + " keychains." );
        System.out.println( "Keychains cost $" + p + " each." );
        System.out.println( "Total cost is $" + cost + "." );

	}


	public static void checkout( int x, int p ) 
	{
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println( "CHECKOUT" );
        System.out.println();
        System.out.print( "What is your name? " );
        String name = keyboard.next();
        view_order(x, p);
        System.out.println( "Thanks for your order, " + name + "!" );

	}

}