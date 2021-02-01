import java.awt.*;
import javax.swing.JFrame;

/************************************************************************************
 **          B O X Y  3 - write and use function - boxes different sizes           **
 ***********************************************************************************/

class Boxy3 extends Canvas
{
	public void paint( Graphics window )
	{
		//                  color       x    y   w   h
		drawBox( window, Color.CYAN,  113, 0, 666, 333 );
		drawBox( window, Color.YELLOW, 200, 300, 50, 30 );
		drawBox( window, Color.GREEN,  230, 320, 30, 150 );
		drawBox( window, Color.RED,  420, 420, 400, 200 );
		drawBox( window, Color.ORANGE,  10, 20, 300, 100 );
		drawBox( window, Color.PINK,  345, 10, 200, 400 );
		drawBox( window, Color.BLUE,  534, 170, 420, 240 );
		drawBox( window, Color.MAGENTA,  69, 96, 75, 572 );

		// draw six more boxes -- different colors, different places, different sizes
	}
	
	public void drawBox( Graphics window, Color c, int x, int y, int w, int h )
	{
		window.setColor(c);
		window.fillRect(x,y,w,h);
		window.setColor(Color.WHITE);
		window.fillRect(x+10,y+10,w-20,h-20);
	}


	public static void main( String[] args )
	{
		Canvas canvas = new Boxy3();
		JFrame win = new JFrame("Boxy3 - write and use function - boxes different sizes");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvas.setBackground(Color.WHITE);
		win.add( canvas );
		win.setVisible(true);
	}
}
