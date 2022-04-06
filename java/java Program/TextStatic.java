class Mathoperations
{
	static float mul(float x, float y)
	{
		return x*y;
	}
	static float divide(float x, float y)
	{
		return x/y;
	}
}

class TextStatic
{
	public static void main(String args[])
	{
		float a=Mathoperations.mul(15.0F,10.0F);
		System.out.println("Multiplication = "+a);
		
		float b=Mathoperations.divide(a,2);
		System.out.println("Divide = "+b);
	}
}