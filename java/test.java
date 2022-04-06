import java.util.Scanner;

class test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int ch,i,v=0,s=0,d=0;
		String str1;

		System.out.println("Enter the String : ");
		str1=sc.nextLine();

		do
		{
			System.out.println("");
			System.out.println("Press 1 For Count Vovel!");
			System.out.println("Press 2 For Count Space!");
			System.out.println("Press 3 For Count Digit!");
			System.out.println("Press 0 For Exit!");

			System.out.println("Enter the Choice : ");
			ch=sc.nextInt();

			switch(ch)
			{

				case 1:
					for(i=0;i<=str1.length()-1;i++)
					{
						char str=str1.charAt(i);
						if(str=='a' || str=='e' || str=='i' || str=='o' || str=='u' )
						{
								v++;
						}
						
					}
					System.out.println("Vovel Is  : "+v);
					break;
				case 2:
					for(i=0;i<=str1.length()-1;i++)
					{
						char str=str1.charAt(i);
						if(str==' ')
						{
							s++;
						}
						
					}
					System.out.println("Space Is  : "+s);
					break;

				case 3:
					for(i=0;i<=str1.length()-1;i++)
					{
						char str=str1.charAt(i);
						if(str>='0' && str<='9')
						{
								d++;
						}
					}

					System.out.println("Digit Is  : "+d);
					break;

				}

		}while(ch!=0);
	}
}