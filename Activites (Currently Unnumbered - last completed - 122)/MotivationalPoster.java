import java.awt.*;
import javax.swing.JFrame;
import java.io.File;
import javax.imageio.ImageIO;

public class MotivationalPoster extends Canvas
{
	Image pix;
	
	public MotivationalPoster() throws Exception
	{
		pix = ImageIO.read( new File("negbias2.jpg") );
	}
	
	public void paint( Graphics g ) {

        g.setColor( new Color(0,0,0) );
        g.fillRect(10,10,800,575);
        g.drawImage(pix,90,100,this);

        g.setColor(Color.YELLOW);
        g.drawRect(85,95,656,303);
        g.drawLine(205,490,615,490);
        g.setFont(new Font( "Times New Roman", Font.PLAIN, 90 ));
        g.drawString("EGATIVIT", 200, 480);
        g.setFont(new Font( "Times New Roman", Font.PLAIN, 120 ));
        g.drawString("N", 120, 500);
        g.setFont(new Font( "Times New Roman", Font.PLAIN, 120 ));
        g.drawString("Y", 615, 500);
        g.setColor(Color.WHITE);
        g.setFont(new Font( "Century Gothic", Font.PLAIN, 22 ));
        g.drawString("What Optimists Call Objectivity When They Don't Like The Message.", 50, 540);
        
		
	}
 
	public static void main(String[] args) throws Exception
	{
		JFrame win = new JFrame("Motivational Poster");
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add( new MotivationalPoster() );
		win.setVisible(true);
	}


}
