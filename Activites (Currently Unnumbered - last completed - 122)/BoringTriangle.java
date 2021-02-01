import java.awt.*;
import javax.swing.JFrame;

public class BoringTriangle extends Canvas
{
	public void paint( Graphics g ) {

        Color purple = new Color(183,10,230);
        g.setColor(purple);

        Polygon tri = new Polygon();
        tri.addPoint(100,100);
        tri.addPoint(200,200);
        tri.addPoint(150,300);

        g.fillPolygon(tri);
	}

	public static void main( String[] args )
	{
		JFrame win = new JFrame("A Boring Triangle");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BoringTriangle canvas = new BoringTriangle();
		win.add( canvas );
		win.setVisible(true);
	}

}