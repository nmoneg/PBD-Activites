import java.awt.*;
import javax.swing.JFrame;

public class SmilingFaceFunction extends Canvas
{
	public void paint( Graphics g )
	{
		drawSmilingFace(g,100,100);
		drawSmilingFace(g,400,350);
		drawSmilingFace(g,400,100);
		drawSmilingFace(g,100,350);
		drawSmilingFace(g,700,350);
		drawSmilingFace(g,700,100);
		drawSmilingFace(g,400,525);
		drawSmilingFace(g,100,525);
		drawSmilingFace(g,700,525);

		// etc
	}

	public void drawSmilingFace( Graphics g, int x, int y )
	{
		// Draws a smiling face on the screen, where the point (x,y) is
		//  the upper-left corner of a box containing the face.

		g.setColor(Color.yellow);
		g.fillOval(x,y,150,150);
		g.setColor(Color.blue);
		g.fillOval( x+30, y+45, 25, 25 );
		g.fillOval( x+100, y+45, 25, 25 );
		g.setColor(Color.red);
		g.drawArc( x+27, y+20, 100, 100, 225, 90 );

	}

	public static void main(String[] args)
	{
		// You can change the title or size here if you want.
		JFrame win = new JFrame("Smiling Face Function");
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add( new SmilingFaceFunction() );
		win.setVisible(true);
	}


}
