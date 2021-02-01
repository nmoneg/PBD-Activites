import java.awt.*;
import javax.swing.JFrame;

public class Circle extends Canvas
{
	public void paint( Graphics g ){

    g.setColor(Color.green);
		g.fillOval(370,200,150,150);

    }

	public static void main( String[] args )
	{
		JFrame win = new JFrame("A Circle");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Circle canvas = new Circle();
		win.add( canvas );
		win.setVisible(true);
	}
}
