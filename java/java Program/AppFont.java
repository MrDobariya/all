import java.applet.*;
import java.awt.*;
public class AppFont extends Applet
{
	Font bigFont;
	public void init()
	{
		bigFont=new Font("Times New Roman",Font.BOLD,20);
		
	}
	public void paint(Graphics g)
	{
		g.setFont(bigFont);
		//g.setColor(Color.pink);
		g.setColor(Color.red);
		//g.setBackground(Color.gray); 
		//g.setBackground(Color.black);
		g.drawString("SYBCA",50,50);
		
	}
}
/*
<applet code=AppFont.class width=500 height=500>
</applet>
*/
