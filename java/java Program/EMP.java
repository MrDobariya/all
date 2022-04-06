import java.awt.*; 
import java.applet.*;
/*
<applet code = "EMP" width = 500 height = 500>
<param name = "Name" value = "Rishi">
<param name = "AGE" value = "19">
<param name = "SALARY" value = "50000">
<param name = "CITY" value = "Surat">
</applet>
*/
public class EMP extends Applet
{
	String name; 
	String age; 
	String salary; 
	String city;
	public void init()
	{
		name = getParameter("NAME"); 
		age = getParameter("AGE"); 
		salary = getParameter("SALARY");
		city = getParameter("CITY");
	}
	public void paint(Graphics g)
	{
		g.drawString("Details Of Employee : ",20,20); 
		g.drawString("NAME : "+ name,20,40); 
		g.drawString("AGE : "+ age,20,60); 
		g.drawString("SALARY : "+ salary,20,80); 
		g.drawString("CITY : "+ city,20,100);
	}
} 