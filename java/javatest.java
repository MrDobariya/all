import java.util.*;
import java.lang.*;
class javatest
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		int ch;
		
		test t=new test();
		t.getdata();
		//t.vovels();
	
		do
		{
			System.out.println("press 1 for number ");
			System.out.println("press 2 for space ");
			System.out.println("press 3 for vovels");
			System.out.println("press 0 for number ");
			System.out.print("Enter Choice :");
			
			ch=s.nextInt();
			
			switch (ch)
			{
				case 1:
						t.number();
						break;
				case 2:
						t.space();
						break;
				case 3:
						t.vovels();
						break;
				case 0:
						break;
				default :
						System.out.println("Please enter velid Choice");
			}
		}while(ch!=0);
	}
	
}
class test
{
	String data;
	StringBuffer stringB=new StringBuffer();
	
	Scanner s=new Scanner(System.in);
	void getdata()
	{
		System.out.print("Enter String :");
		data=s.nextLine();
	}
	void number()
	{
		int n=0;
		System.out.println("String Is :"+data);
		
		for(int i=0;i<=data.length()-1;i++)
		{
			char c=data.charAt(i);
			if(c>='0' && c<='9')
			{
				n++;
			}
		}
		System.out.println("Digit : "+n);
	}
	
	void vovels()
	{
		int c=0;
		for(int i=0;i<data.length();i++)
		{
			stringB.append(data.charAt(i));
			if(stringB.charAt(i)=='a'||stringB.charAt(i)=='e'||stringB.charAt(i)=='i'||stringB.charAt(i)=='o'||stringB.charAt(i)=='u')
			{
				c++;
			}
		}
		System.out.println("Vovel : " +c);
	}
	void space()
	{
		int sp=0;
		for(int i=0;i<data.length();i++)
		{
			stringB.append(data.charAt(i));
			if(stringB.charAt(i)==' ')
			{
				sp++;
			}
			
		}
		System.out.println("space : "+sp);
	}
}