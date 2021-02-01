import java.awt.*;
import javax.swing.JFrame;

public class ClockFace extends Canvas
{
	public void paint( Graphics g ){

        g.drawOval(330,200,200,200);
        g.drawLine(340,300,435,300);
        g.drawLine(400,250,435,300);
        
        g.setFont(new Font("TimesRoman", Font.PLAIN, 36)); 
        g.drawString("12",415,235);
        g.drawString("3",500,310);
        g.drawString("6",425,385);
        g.drawString("9",345,310);
        
        
        

    }

	public static void main( String[] args )
	{
		JFrame win = new JFrame("A Clock");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ClockFace canvas = new ClockFace();
		win.add( canvas );
		win.setVisible(true);
	}
}