import java.awt.*;
import javax.swing.JFrame;

public class GraphicsDemo1 extends Canvas
{
	public void paint( Graphics g )
	{
		g.setColor(Color.green);
		g.drawRect(50,20,100,200);  // draw a rectangle
		g.fillOval(160,20,100,200); // draw a filled-in oval
		g.setColor(Color.blue);
		g.fillRect(200,400,200,20); // a filled-in rectangle
		g.drawOval(200,430,200,100);
		g.setColor(Color.red);
		g.fillRect(650,475,50,50);
		
		g.setColor(Color.black);
		g.drawString("Graphics are pretty neat.", 500, 100);
		int x = getWidth() / 2;
		int y = getHeight() / 2;
		g.drawString("The first letter of this string is at (" + x + "," + y + ")", x, y);
	}

	public static void main( String[] args )
	{
		// You can change the title or size here if you want.
		JFrame win = new JFrame("GraphicsDemo1");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GraphicsDemo1 canvas = new GraphicsDemo1();
		win.add( canvas );
		win.setVisible(true);
	}

	//1. The window that appears when this code is ran is 800
	//		pixels wide, and 600 pixels tall.

	//2. In the call to the function 'g.drawRect()', the four 
	//		numbers are for the starting coordinates of the 
	//		rectangle, and the width and length of the rectangle.
	//		In the code above (line 9), the rectangle starts at 
	//		( 50, 20 ), and has a width of 100 pixels, and a height
	//		of 200 pixels.

	//3. Similarly, on line 10, the call to 'fillOval()' has the 
	//		same argument structure. A filled oval is starting at
	//		( 160, 20 ), with the starting point being marked as 
	//		the upper left corner of the rectangle that is formed
	//		shaping the oval ( a rectangle that touches the oval
	//		at a single point on each of its sides). The oval will
	//		be 100 pixels wide, and 200 pixels long.

	//4. The two numbers in the call to 'drawString()' (line 16) 
	//		designate the starting pixel point of the text indicated.

	//5. When two objects overlap, the overlap order is determined
	//		by the order that the objects appear in the code. For
	//		example, for the shapes on lines 9 - 13, if they were 
	//		to overlap, the oval on line 13 would appear on the top,
	//		and the rectangle on line 9 would be on the bottom.
}
