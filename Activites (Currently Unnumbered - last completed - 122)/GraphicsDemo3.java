import java.awt.*;
import javax.swing.JFrame;

public class GraphicsDemo3 extends Canvas
{
	public void paint( Graphics g )
	{
		// lines
		g.setColor(Color.green);
		g.drawLine(10,100,400,100);
		g.setColor(Color.red);
		g.drawLine(187,60,245,125);
		g.drawLine(120,210,275,458);
		g.setColor(Color.blue);
		g.drawLine(50,150,100,180);
		g.setColor(Color.magenta);
		g.drawLine(100,350,300,230);

		g.setColor(Color.black);

		// fonts
		g.drawString("Graphics are pretty neat.", 500, 100);
		g.setFont(new Font("Consolas", Font.PLAIN, 36)); // 36-pt plain
		g.drawString("Yes, they are.", 400, 200);

		g.setColor(Color.white);
		g.setFont(new Font("Consolas", Font.BOLD+Font.ITALIC, 60)); // 60-pt italic bold
		g.drawString("Leander Lions", 300, 350);

		g.setColor(Color.blue);
		g.setFont(Font.decode("Consolas-BOLDITALIC-60")); // a different way to specify the same font
		g.drawString("Leander Lions", 290, 360);
		
		g.setColor(Color.black);
		g.setFont(new Font(null)); // restore default font

		int x=400, y=490;
		g.drawRect(x,y,150,20);
		g.drawString("Where is the starting point?", x,y);
		g.setColor(Color.red);
		g.drawLine(x,y,x,y);	// drawing a line from a point to itself makes a 1px-by-1px dot

	}

	public static void main( String[] args )
	{
		JFrame win = new JFrame("GraphicsDemo3: Fonts and Lines");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GraphicsDemo3 canvas = new GraphicsDemo3();
		win.add( canvas );
		win.setVisible(true);

// 1. When drawing a line using the 'drawLine' function, the four
//		numbers required are the x and y-coodinates of the two 
//		points that will make the line. For example, on line 10, 
//		the line will connect points (10, 100) and (400, 100).

// 4. When drawing a rectangle, the starting point defined by the
//		user is the upper-left corner of the rectangle.

// 5. When drawing strings, the starting point defined by the user
//		is the lower-left corner of the text.

// 6. When setting a custom font, if you provide a font that doesn't
//		exist, it will choose the default system font.
	}
}
