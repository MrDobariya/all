import java.applet.*;
import java.awt.*;
public class Home extends Applet
{
	public void paint(Graphics g)
	{
		g.drawRect(100,180,650,350);
		g.drawRect(100,180,70,350);
		g.drawRect(400,400,70,130);
		g.drawRoundRect(400,400,70,130,30,30);
		g.drawLine(100,180,130,150);
		g.drawLine(150,180,130,150);
		g.drawLine(330,150,130,150);
		g.drawLine(350,180,330,150);
	}
}
/*
<APPLET code=Home.class height=1000 width=1000>
</APPLET>
*/