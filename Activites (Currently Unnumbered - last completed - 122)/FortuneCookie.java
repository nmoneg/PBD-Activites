import java.util.Random;

public class FortuneCookie { 
    public static void main ( String[] args ) {

        Random x = new Random();
        int num = 1 + x.nextInt(6);
        String fortune = "";

        if ( num == 1 ) 
            fortune = "You will find happiness with a new love.";
        else if ( num == 2 ) 
            fortune = "Stick with your wife.";
        else if ( num == 3 ) 
            fortune = "Racks on racks on racks.";
        else if ( num == 4 ) 
            fortune = "Believe in yourself.";
        else if ( num == 5 ) 
            fortune = "The future is bright.";
        else if ( num == 6 ) 
            fortune = "Never fear failure.";
        else {
            fortune = "ERROR.";
        }

        int lotto1 = 1 + x.nextInt(54);
        int lotto2 = 1 + x.nextInt(54);
        int lotto3 = 1 + x.nextInt(54);
        int lotto4 = 1 + x.nextInt(54);
        int lotto5 = 1 + x.nextInt(54);
        int lotto6 = 1 + x.nextInt(54);

        System.out.println( "Fortune cookie says: \"" + fortune + "\"" );
        System.out.print( "\t" + lotto1 + "\t" );
        System.out.print( lotto2 + "\t" );
        System.out.print( lotto3 + "\t" );
        System.out.print( lotto4 + "\t" );
        System.out.print( lotto5 + "\t" );
        System.out.print( lotto6 + "\t" );

    }
}