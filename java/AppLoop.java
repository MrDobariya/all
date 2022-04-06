import java.applet.*;
import java.awt.*;
public class AppLoop extends Applet
{
	int no;
	public void init()
	{
		String str=getParameter("x");
		no=Integer.parseInt(str);	
	}
	public void paint(Graphics g)
	{
		for(int i=1;i<=no;i++)
		{
			if(i%2==0)
			{
				g.setColor(Color.red);
				g.fillRect((i*50+20),(i*50+20),50,50);
			}
			
			else
			{
				g.setColor(Color.blue);
				g.fillRect((i*50+20),(i*50+20),50,50);
			}
		}
	}
}
/*
<APPLET code=AppLoop.class width=700 height=700>
<PARAM name="x" value=4>
</APPLET>
*/