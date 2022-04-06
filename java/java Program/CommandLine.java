class CommandLine
{
	public static void main(String args[])
	{
		int len=args.length;
		System.out.println("No Of Arguments Passed : " +len);
		
		for(int i=0;i<len;i++)
		{
			System.out.println("Arguments "+(i+1)+" : "+args[i]);
		}
	}		
}