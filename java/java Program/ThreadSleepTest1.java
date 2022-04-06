import java.util.Scanner;
class ThreadSleep extends Thread
{
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		String Data[]=new String[5]; 

		for(int i=0;i<5;i++)
		{
			System.out.print("Enter Data : " + i + " : ");
			Data[i]=sc.nextLine();
			System.out.println();
		}
		
		try
		{
			for(int i=0;i<5;i++)4
			
			{
				System.out.println("Data Is  : " + (i+1) + " : " + Data[i]);
				sleep(1000);
				System.out.println();
			}
		}
		catch(Exception e)
		{

		}
		
	}

}

class ThreadSleepTest1
{
	public static void main(String args[])
	{
		ThreadSleep ts = new ThreadSleep();
		ts.start();
	}
}