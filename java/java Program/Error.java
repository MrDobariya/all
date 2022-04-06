class Error
{
	public static void main(String args[])
	{
		int a=10;
		int b=5;
		int c=5;
		int x,y;
		
		try
		{
			x=a/(b-c);
			System.out.println("X = "+x);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by Zero");
		}
		
		y=a/(b+c);
		System.out.println("Y = "+y);
	}
}