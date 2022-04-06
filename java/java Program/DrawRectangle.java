import java.applet.*;
import java.awt.*;
public class DrawRectangle extends Applet
{
	int no=5;
	public void init()
	{
		for(int i=0;i<=no;i++)
		{
			no=getParameter("no");
		}
	}
	public void paint(Graphics g)
	{
		g.drawRect(no,50,50,50,50);
	}
}

/*
<APPLET code=DrawRectangle.class height=500 width=500>
<PARAM  name="p" value="5">
</APPLET>
*/