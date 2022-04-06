class SortAsc
{
	public static void main(String args[])
	{
		int arr[];
		int len=args.length;
		arr=new int[len];
		int i;
		
		for(i=0;i<len;i++)
		{
			arr[i]=Integer.parseInt(args[i]);
		}
		
		for(i=0;i<len;i++)
		{
			for(int j=i;j<len;j++)
			{
				if(arr[i]>arr[j])
				{
					int t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
		System.out.println("After Shorting : ");
		
		for(i=0;i<len;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
