import java.awt.*;
import javax.swing.JFrame;
import java.util.Random;

public class ForestAndTrees extends Canvas
{
	public void paint( Graphics g )
	{
		// draws a few single trees for testing
		drawTree(g,30,550);
		drawTree(g,100,580);
		drawTree(g,640,300);
		drawTree(g,730,370);

		// draws the first forest
		drawForest(g,10,10,500,500);

		// draws the second forest
		drawForest(g,550,20,400,250);

		// draws the third forest
		drawForest(g,200,530,710,160);

	}
	
	public void drawTree( Graphics g, int x, int y )
	{
		g.setColor( new Color(134,83,0) );	// defines a brownish color
		g.fillRect( x+17, y+75, 16, 25 );

		g.setColor( Color.GREEN );
		Polygon tri = new Polygon();
		tri.addPoint( x+25, y );
		tri.addPoint( x+50, y+75 );
		tri.addPoint( x, y+75 );
		g.fillPolygon(tri);
		g.setColor( Color.BLACK );

	}

	public void drawForest( Graphics g, int x, int y, int w, int h )
	{
		// creates a box to demonstrate the forest's boundary
		g.setColor(Color.BLACK);
		g.drawRect(x,y,w,h);
		int a=0, b=0;
		Random r = new Random();

		for ( int i = 0; i < 100; i++ ) {
			
			a = 1 + r.nextInt( w - 50 );
			b = 1 + r.nextInt( h - 100 );
			
			drawTree(g,x+a,y+b);
		}
	}

	public static void main(String[] args)
	{
		JFrame win = new JFrame("ForestAndTrees");
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add( new ForestAndTrees() );
		win.setVisible(true);
	}

}
