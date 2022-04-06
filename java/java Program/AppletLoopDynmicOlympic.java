import java.applet.*;
import java.awt.*;
public class AppletLoopDynmicOlympic extends Applet
{
	int no;
	public void init()
	{
		String str=getParameter("STR");
		no=Integer.parseInt(str);
	}
	public void paint(Graphics g)
	{
		for(int i=1;i<=no;i++)
		{
			if(i==1)
			{
				g.setColor(Color.blue);
				g.drawOval((i*70)+10,70,120,120);
			}
			else if(i==2)
			{
				g.setColor(Color.yellow);
				g.drawOval((i*70)+10,130,120,120);	
			}
			else if(i==3)
			{
				g.setColor(Color.black);
				g.drawOval((i*70)+10,70,120,120);
			}
			else if(i==4) 
			{
				g.setColor(Color.green);
				g.drawOval((i*70)+10,130,120,120);	
			}
			else 
			{
				g.setColor(Color.red);
				g.drawOval((i*70)+10,70,120,120);	
			}
		}
	}
}

/*
<APPLET code=AppletLoopDynmicOlympic.class height=500 width=500>
<PARAM name="STR" value="5">
</APPLET>
*/