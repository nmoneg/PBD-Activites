import java.awt.*;
import java.util.Random;
import javax.swing.JFrame;

public class RandomRightTriangles extends Canvas
{
	public void paint( Graphics z ) {

        Random x = new Random();
        int r;
        int g;
        int b;

        int x1;
        int y1;

        for ( int i = 0; i < 500; i++ ) {

            r = x.nextInt(256);
            g = x.nextInt(256);
            b = x.nextInt(256);

            x1 = 1 + x.nextInt(700);
            y1 = 1 + x.nextInt(500);

            Color custom = new Color(r,g,b);
            z.setColor(custom);

            Polygon tri = new Polygon();
            tri.addPoint( x1, y1 );
            tri.addPoint( x1, y1 + 50 );
            tri.addPoint( x1 + 50, y1 + 50 );

            z.fillPolygon(tri);

        }
	}

	public static void main( String[] args )
	{
		JFrame win = new JFrame("Random Right Triangles");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		RandomRightTriangles canvas = new RandomRightTriangles();
		win.add( canvas );
		win.setVisible(true);
	}

}