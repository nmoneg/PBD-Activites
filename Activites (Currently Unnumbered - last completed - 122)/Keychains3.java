import java.util.Scanner;

public class Keychains3
{
	public static void main( String[] args )
	{
		
		System.out.println("Ye Olde Keychain Shoppe");
		
		int cart = 0;
		int price = 10;
        int choice = 0;
        double tax = 8.25;
        int ship_cost = 5;
        int add_ship_cost = 1;

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
				view_order( cart, price, tax, ship_cost, add_ship_cost );
			} else if (choice == 4) {
				checkout( cart, price, tax, ship_cost, add_ship_cost );
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
        
        while ( total < 0 ){
            System.out.print( "ERROR: Total cannot be negative. How many? " );
            add = keyboard.nextInt();
            total = x + add;
        } 
        
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

        while ( total < 0 ){
            System.out.print( "ERROR: Total cannot be negative. How many? " );
            remove = keyboard.nextInt();
            total = x - remove;
        } 

        System.out.println( "You now have " + total + " keychains." );

        return total;

	}


	public static void view_order( int x, int p, double t, int s, int a ) 
	{

        if ( x == 0 ) {
            System.out.println( "Your shopping cart is empty." );
        } else {

            int ship = s + (a * (x-1));
            int subtotal = (x*p) + ship;
            double total_tax = (t/100) * subtotal;
            double cost = subtotal + total_tax;

            System.out.println( "You have " + x + " keychains." );
            System.out.println( "Keychains cost $" + p + " each." );
            System.out.println();
            System.out.println( "Shipping: $" + ship );
            System.out.println( "Subtotal: $" + subtotal );
            System.out.println( "Sales Tax (8.25%): $" + total_tax );
            System.out.println();
            System.out.println( "Total cost is $" + cost + "." );

        }
	}


	public static void checkout( int x, int p, double t, int s, int a ) 
	{
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println( "CHECKOUT" );
        System.out.println();
        System.out.print( "What is your name? " );
        String name = keyboard.next();
        view_order(x, p, t, s, a);
        System.out.println( "Thanks for your order, " + name + "!" );

	}

}