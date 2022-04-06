interface Area
{
	final static float pi=3.142f;
	float compute(float x, float y);
}

class Rectangle implements Area
{
	public float compute(float x, float y)
	{
		return(x*y);
	}
}

class Circle implements Area
{
	public float compute(float x, float y)
	{
		return(pi*x*x);
	}
}

class Square implements Area
{
	public float compute(float x,float y)
	{
		return(x*x);
	}
}

class InterfaceTest
{
	public static void main(String args[])
	{
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		Square s=new Square();
		Area area;
		area=r;
		float ar = r.compute(10,20);
		System.out.println("Area of Rectangle = "+ar);
		area=c;
		System.out.println("Area of Circle = "+area.compute(10,0));
		area=s;
		float sq=s.compute(10,50);
		System.out.println("Area of Square = "+sq);
	}
}

