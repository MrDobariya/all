import java.applet.*;
import java.awt.*;
public class AppletG extends Applet
{
	public void paint(Graphics g)
	{
		g.drawRect(50,50,150,150);
		//(x point, y point ,width, height)
		g.fillRect(100,100,250,250);
		//(x point, y point ,width, height)
		g.drawRoundRect(20,20,100,100,10,10);
		//(x point, y point ,width, height, x curve, y curve)
		g.fillRoundRect(40,40,100,100,10,10);
	}
}

/*
<APPLET code=AppParam.class height=500 width=500>
</APPLET>
*/