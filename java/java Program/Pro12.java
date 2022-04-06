import java.applet.*; 
import java.awt.*;
/*
<applet code = "Pro12" width = 1000 height = 1000>
</applet>
*/
public class Pro12 extends Applet
{
	public void paint(Graphics g)
	{
		int x[] = {407,306,510};
		int y[] = {125,327,327};
		g.setColor(Color.yellow); 
		g.fillPolygon(x,y,3); 
		g.setColor(Color.blue); 
		g.fillOval(345,205,125,125);
		g.setColor(Color.white);
		g.drawString("Rishi" ,390 ,275);
	}
}