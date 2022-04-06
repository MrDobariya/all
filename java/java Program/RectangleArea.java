class Rectangle
{
	int length,width;
	
	void getData(int x, int y)
	{
		length=x;
		width=y;
	}
	void rectArea()
	{
		int area;
		area=length*width;
		System.out.println(area);
	}
}

class RectangleArea
{
	public static void main(String args[])
	{
		Rectangle r=new Rectangle();
		r.getData(15,20);
		r.rectArea();
	}
} 
