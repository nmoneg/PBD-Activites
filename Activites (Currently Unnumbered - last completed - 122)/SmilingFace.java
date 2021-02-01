import java.awt.*;
import javax.swing.JFrame;

public class SmilingFace extends Canvas
{
	public void paint( Graphics g ){

    g.setColor(Color.yellow);
    g.fillOval(330,200,150,150);
    g.setColor(Color.blue);
    g.fillOval(360,245,25,25);
    g.fillOval(430,245,25,25);
    g.setColor(Color.red);
    g.drawArc(357,220,100,100,225,90);

    }

	public static void main( String[] args )
	{
		JFrame win = new JFrame("A Smiling Face");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SmilingFace canvas = new SmilingFace();
		win.add( canvas );
		win.setVisible(true);
	}
}
