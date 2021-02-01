import java.util.Scanner;

public class TwoMoreQuestions
{
	public static void main( String[] args )
	{
        Scanner keyboard = new Scanner(System.in);

        System.out.println( "TWO MORE QUESTIONS, BABY!" );
        System.out.println();
        System.out.println( "Think of something and I'll try to guess it!" );
        System.out.println();

        System.out.print( "Question 1) Does it stay inside or outside or both? " );
        String q1 = keyboard.next();
        System.out.print( "Question 2) Is it a living thing? " );
        String q2 = keyboard.next();
        System.out.println();

        String guess = "";

        if ( q1.equals( "inside" ) && q2.equals( "yes" )) {

            guess = "houseplant";

        }
        
        if ( q1.equals( "inside" ) && q2.equals( "no" )) {

            guess = "shower curtain";

        }

        if ( q1.equals( "outside" ) && q2.equals( "yes" )) {

            guess = "bison";

        }

        if ( q1.equals( "outside" ) && q2.equals( "no" )) {

            guess = "billboard";

        }

        if ( q1.equals( "both" ) && q2.equals( "yes" )) {

            guess = "dog";

        }

        if ( q1.equals( "both" ) && q2.equals( "no" )) {

            guess = "cell phone";

        }

        System.out.println( "Then what else could you be thinking of besides a " + guess + "?!?" );

    }
}
