import java.lang.Exception;
class MyException extends Exception
{
	MyException(String message)
	{
		super(message);
	}
}

class sample
{
	public static void main(String args[])
	{
		String s[]=new String[5];
		int f=1;
		for(int i=0;i<5;i++)
		{
			s[i]=args[i];
		}
		try 
		{
			for(int i=0;i<5;i++)
			{
				f=1;
				if(s[i].equals("BCA")==true || s[i].equals("MCA")==true || s[i].equals("BBA")==true || s[i].equals("MBA")==true || s[i].equals("OTHER")==true)
				{
					f=0;
				}
				if(f==1)
				{
					throw new MyException("Argument not in list");
				}
			}
		}
		catch(MyException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
