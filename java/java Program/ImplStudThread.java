import java.util.*;
class StudentData
{
	int age;
	String name;
	StudentData(String nm,int a)
	{
		name=nm;
		age=a;
	}
}
class StudThread extends Thread
{
	StudentData st[]=new StudentData[10];
	StudThread(StudentData std[])
	{
		st=std;
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			for(int j=i+1;j<10;j++)
			{
				if(st[i].age>st[j].age)
				{
					StudentData temp=st[i];
					st[i]=st[j];
					st[j]=temp;
				}
			}
		}
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("Name : "+st[i].name);
				System.out.println("Age : "+st[i].age);
				Thread.sleep(1000);
			}
		}
		catch(Exception ex)
		{

		}
	}
}
class ImplStudThread
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		StudentData st[]=new StudentData[10];
		String nm;
		int x;
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter Student name for student : "+i);
			nm=sc.nextLine();
			System.out.println("Enter Student age: ");
			x=sc.nextInt();
			sc.nextLine();
			st[i]=new StudentData(nm,x);
		}
		StudThread th=new StudThread(st);
		th.start();
	}
}