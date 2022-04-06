import java.util.*;
class WordCount
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter Data : ");
		String str=sc.nextLine();
		str=str.trim();
		StringBuffer sb=new StringBuffer(str);
		int ch=0,w=0,s=0;
		for(int i=0;i<sb.length();i++)
		{
			if(sb.charAt(i)==' '|| sb.charAt(i)==',')
			{
				w++;
			}
			else if(sb.charAt(i)=='.' || sb.charAt(i)=='?' || sb.charAt(i)=='!')
			{
				s++;
				w++;
				ch++;
			}
			else
			{
				ch++;
			}
		}
		System.out.println("Character : "+ch);
		System.out.println("Word : "+w);
		System.out.println("Sentences : "+s);
	}
}