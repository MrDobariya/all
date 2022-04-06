import java.applet.*;
import java.awt.*;
public class AppletLoopDynmic extends Applet
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
		}
	}
}

/*
<APPLET code=AppletLoopDynmic.class height=500 width=500>
<PARAM name="STR" value="10">
</APPLET>
*/