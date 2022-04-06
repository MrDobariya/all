import java.applet.*;
import java.awt.*;
public class polygonTest extends Applet
{
	public void paint(Graphics g)
	{
		/*int xPoints[]={10,170,80,80,10};
		int yPoints[]={10,10,140,80,10};
		int n=xPoints.length;

		g.drawPolygon(xPoints,yPoints,n);
		//(Array of Xpoints, Array of Ypoints, n no of points)	
		g.fillPolygon(xPoints,yPoints,n);*/

		Polygon poly=new Polygon();

		poly.addPoint(150,50);
		poly.addPoint(230,50);
		poly.addPoint(260,100);
		poly.addPoint(110,100);
		poly.addPoint(150,50);

		g.drawPolygon(poly);
	}
}

/*
<APPLET code=polygonTest.class height=500 width=500>
</APPLET>
*/