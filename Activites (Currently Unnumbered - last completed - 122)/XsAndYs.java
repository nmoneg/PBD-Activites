public class XsAndYs {

    public static void main(String[] args) {
        
        System.out.println( " x\ty\n-----------------" );

        double y;

        for ( double x = -10; x <= 10; x = x + 0.5 ) {

            y = Math.pow( x, 2 );
            System.out.println( x + "\t" + y );
        }
    }
}