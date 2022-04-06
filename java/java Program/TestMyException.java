import java.lang.Exception;
class MyException extends Exception
{
	MyException(String message)
	{
		super(message);
	}
}

class TestMyException
{
	public static void main(String args[])
	{
		int x=5,y=1000;
		float z=(float)x/(float)y;
		try
		{
			if(z<0.01)
			{
				throw new MyException("Number too small");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}