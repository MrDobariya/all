class Sorting
{
	public static void main(String args[])
	{
		int arr[]={5,2,9,8,7};
		int len=arr.length;
		int i;
		
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
