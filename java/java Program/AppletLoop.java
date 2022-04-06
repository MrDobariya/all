import java.applet.*;
import java.awt.*;
public class AppletLoop extends Applet
{
	public void paint(Graphics g)
	{
		//for(int i=1;i<=4;i++)
		//{
			//g.drawOval((i*70)+10,70,100,100);
			//g.drawOval(50,(i*50)+10,50,50);
			//g.drawRect(i*50,i*50,50,50);
		//}
		for(int i=1;i<=4;i++)
		{
			if(i%2==0)
			{
				g.setColor(Color.red);
				g.drawOval((i*70)+10,70,100,100);
			}
			else 

			{
				g.setColor(Color.blue);
				g.drawOval((i*70)+10,70,100,100);	
			}
			//g.drawOval(50,(i*50)+10,50,50);
			//g.drawRect(i*50,i*50,50,50);
		}
	}
}
/*
<APPLET code=AppletLoop.class height=500 width=500>
</APPLET>
*/