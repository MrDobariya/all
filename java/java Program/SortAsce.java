import java.util.Scanner;
class SortAsce
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[];
		int len=sc.nextInt();
		arr=new int[len];
		int i;
		
		for(i=0;i<len;i++)
		{
			arr[i]=sc.nextInt();
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