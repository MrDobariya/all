import java.applet.*;
import java.awt.*;

public class Appmethods extends Applet implements Runnable
{
//	String  str=" I LOVE MY INDIA";
//	boolean b=false;
	Thread t=new Thread(this);
	public void init()
	{
		setBackground(Color.gray);
		setForeground(Color.white);
	}
	public void start()
	{
		t.start();
	}
	public void run()
	{
		char ch;
		for(int i=0;i<=5;i++)
		{
			try
			{
				repaint();
				Thread.sleep(500);
				/*ch=str.charAt(0);
				str=str.substring(1,str.length());
				str=str+ch;*/
			}
			catch(Exception e){}
			
		}
		
	}
	public void paint(Graphics g)
	{
		
	//		int x[]={150,230,260,110,150};
	//		int y[]={50,50,100,100,50};
				
		for(int i=0;i<=5;i++)
		{
			
			try{
			//int n=x.length;
			if(i%2==0)
			{
				g.setColor(Color.red);
			}
			else
			{
				g.setColor(Color.blue);
			}
			//g.drawLine(x[i],y[i],x[i+1],y[i+1]);
			
			
			g.drawOval(150,180,200,200);
			Thread.sleep(50);
			g.drawOval(180,230,30,50);
			g.fillOval(180,245,30,35);
			Thread.sleep(50);
			g.drawOval(280,230,30,50);
			g.fillOval(280,245,30,35);
			Thread.sleep(50);
			g.drawArc(180,220,140,140,180,180);
			

			//g.drawPolygon(x,y,n);
			//g.setColor(Color.blue);
			//g.drawRect((i*50),60,300,150);
			//g.setColor(Color.red);
			//g.drawRect(100,50,300,150);
			//g.setColor(Color.blue);
		
			}catch(Exception e){}
		}
		
		
//		g.drawString(str,1,150);
		//g.drawRect(46,46,133,133);
		//g.fillRect(190,200,150,200);
		//g.drawRoundRect(150,100,150,250,30,30);
		//g.drawRoundRect(150,150,210,210,30,30);
		//g.setColor(Color.red);
		//g.fillRoundRect(170,170,170,170,30,30);
		//g.drawOval(100,120,100,120);
		//g.setColor(Color.red);
		//g.fillOval(110,130,90,90);
		//g.drawArc(100,120,100,120,90,180);
		//g.drawLine(120,120,220,220);
		
		//g.fillOval(110,130,90,90);
		//g.drawRect(110,130,90,90);
		//g.setColor(Color.red);
		//g.fillOval(115,135,80,80);
		//g.drawOval((i*80)+10,80,130,130);
		
		
	}
}

//path="C:\Program Files (x86)\Java\jdk1.8.0_144\bin"
/*
<Applet code=Appmethods.class width=500 height = 500> 
</Applet>
*/