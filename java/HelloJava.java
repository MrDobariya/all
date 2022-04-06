import java.awt.*;
import java.applet.*;

public class HelloJava extends Applet
{
	public void paint(Graphics g)
	{
		//g.setColor(Color.red);
		//g.drawString("Java",100,100);
		//g.setColor(Color.yellow);
		//g.drawLine(10,10,200,10);
		//g.setColor(Color.green);
		//g.drawRect(10,10,150,150);
		//g.setColor(Color.blue);
		//g.fillRect(10,10,150,150);
		g.setColor(Color.pink);
		g.drawOval(150,250,150,150);
		//g.setColor(Color.black);
		//g.fillOval(150,250,100,100);
		g.setColor(Color.red);
		//g.drawArc(160,270,15,15,0,360);
		g.setColor(Color.green);
		g.fillArc(177,280,30,30,0,360);
		g.setColor(Color.green);
		g.fillArc(245,280,30,30,0,360);
		g.setColor(Color.blue);
		g.drawLine(225,335,225,310);
		g.setColor(Color.yellow);
		g.drawArc(210,340,30,30,180,180);
	}
}

/*
<applet code="HelloJava.class" width="500" height="500">
</applet>
*/

// compile : javac HelloJava.java
// run : appletviewer HelloJava.java