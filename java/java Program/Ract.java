import java.applet.*;
import java.awt.*;
public class Ract extends Applet
{
	Font bigFont;
	public void init()
	{
		bigFont=new Font("Times New Roman",Font.BOLD,12);
	}
	public void paint(Graphics g)
	{
		
		g.setColor(Color.red);
		g.fillRect(50,50,350,150);
		g.setFont(bigFont);
		g.setColor(Color.yellow);
		g.drawString("SHREE UTTAR GUJARAT BCA & BBA COLLAGE",100,125);
	}
}

/*
<APPLET code=Ract.class height=500 width=500>

</APPLET>
*/