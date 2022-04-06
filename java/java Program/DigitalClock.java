import java.applet.*;
import java.awt.*;
import java.util.*;
import java.text.*;

public class DigitalClock extends Applet implements Runnable
{
	Thread t;
	String tm="";
	public void init()
	{
		setBackground(Color.CYAN);
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		try
		{
			while(true)	
			{	
				Calendar c=Calendar.getInstance();
				SimpleDateFormat f=new SimpleDateFormat("hh:mm:ss "+" dd/MM/yyyy");
				Date d=c.getTime();
				tm=f.format(d); 
				repaint();
				t.sleep(1000);
			}
		}
		catch(Exception ex)
		{
		}
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.blue);
		g.setFont(new Font("Times New Roman",Font.BOLD,20));
		g.drawString(tm,100,100);
	}
}
/*
<applet code=DigitalClock.class width=500 height=500>
</applet>
*/