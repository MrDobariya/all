import java.applet.*;
import java.awt.*;
public class AppletG extends Applet
{
	public void paint(Graphics g)
	{
		//g.drawRect(50,50,150,150);
		//(x point, y point ,width, height)
		//g.fillRect(100,100,250,250);
		//(x point, y point ,width, height)
		//g.drawRoundRect(20,20,100,100,10,10);
		//(x point, y point ,width, height, x curve, y curve)
		//g.setColor(Color.red);
		//g.fillRoundRect(30,30,80,80,10,10);
		//g.drawOval(100,100,150,150);
		//g.setColor(Color.blue);
		//g.fillOval(110,110,130,130);
		//g.drawLine(120,120,50,100);
		//g.drawLine(120,120,100,50);
		//g.drawArc(120,120,50,100,90,180);

		g.drawOval(150,150,150,150);
		g.drawOval(180,190,15,15);
		g.drawOval(250,190,15,15);
		g.drawLine(220,250,220,215);
		g.drawArc(207,250,30,30,180,180);


	}
}

/*
<APPLET code=AppletG.class height=500 width=500>
</APPLET>
*/