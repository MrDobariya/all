abstract class Shap
{
	int length,width;
	Shap(int x, int y)
	{
		length=x;
		width=y;
	}
	abstract float area();
}

class Rectangle extends Shap
{
	Rectangle(int x, int y)
	{
		super(x,y);
	}
	float area()
	{
		return(length*width);
	}
	
}

class Circle extends Shap
{
	static float pi=3.14f;
	
	Circle(int x)
	{
		super(x,0);
	}
	float area()
	{
		return(pi*length*length);
	}
}

class ShapInherits
{
	public static void main(String args[])
	{
		Rectangle r=new Rectangle(10,20);
		Circle c=new Circle(5);
		float ra=r.area();
		float ca=c.area();
		System.out.println("Area Of Rectangle : "+ra);
		System.out.println("Area Of Circle : "+ca);
		
	}
}