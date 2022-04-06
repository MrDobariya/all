class ErrorThrow
{
	public static void main(String args[])
	{
		try
		{
				int i=Integer.parseInt(args[0]);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Invalid Number");
			System.out.println(e.toString());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("No Argument Passed");
			System.out.println(e.toString());
		}
		finally
		{
			System.out.println("Finally Block Is Always Called");
		}
	}
}