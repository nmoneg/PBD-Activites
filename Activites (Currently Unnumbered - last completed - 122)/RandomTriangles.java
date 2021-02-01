import java.awt.*;
import java.util.Random;
import javax.swing.JFrame;

public class RandomTriangles extends Canvas
{
	public void paint( Graphics z ) {

        Random x = new Random();
        int r;
        int g;
        int b;

        int x1;
        int x2;
        int x3;

        int y1;
        int y2;
        int y3;

        for ( int i = 0; i < 500; i++ ) {

            r = x.nextInt(256);
            g = x.nextInt(256);
            b = x.nextInt(256);

            x1 = 1 + x.nextInt(800);
            x2 = 1 + x.nextInt(800);
            x3 = 1 + x.nextInt(800);

            y1 = 1 + x.nextInt(600);
            y2 = 1 + x.nextInt(600);
            y3 = 1 + x.nextInt(600);

            Color custom = new Color(r,g,b);
            z.setColor(custom);

            Polygon tri = new Polygon();
            tri.addPoint(x1,y1);
            tri.addPoint(x2,y2);
            tri.addPoint(x3,y3);

            z.fillPolygon(tri);

        }
	}

	public static void main( String[] args )
	{
		JFrame win = new JFrame("Random Triangles");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		RandomTriangles canvas = new RandomTriangles();
		win.add( canvas );
		win.setVisible(true);
	}

}