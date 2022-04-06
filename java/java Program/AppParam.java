import java.applet.*;
import java.awt.*;
public class AppParam extends Applet
{
	String str;
	public void init()
	{
		str=getParameter("STR");
		if(str == null)
			str="JAVA";
		str="Hello"+str;
	}
	public void paint(Graphics g)
	{
		g.drawString(str,100,100);
	}
}

/*
<APPLET code=AppParam.class height=500 width=500>
<PARAM name="STR" value="BCA">
</APPLET>
*/