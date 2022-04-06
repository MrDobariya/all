import java.util.*;
import java.lang.*;
abstract class Cricket
{
	public int matches;
	public String name;
	public String type;
	Scanner sc1=new Scanner(System.in);
	Cricket()
	{
		System.out.print("Enter the Cricketer Name : ");
		name=sc1.nextLine();
		System.out.print("Enter the Match No : ");
		matches=sc1.nextInt();
		sc1.nextLine();
	}
	abstract public void Average();
	public void displayinfo() 
	{
		System.out.println();
		System.out.println("Cricketer Type : "+type);
		System.out.println("Name : " +name);
		System.out.println("Matches : " +matches);
	}
}

class Batsman extends Cricket
{
	Scanner sc2=new Scanner(System.in);
	public int run;
	public float average;
	Batsman() 
	{
		System.out.print("Enter the Total  Runs : ");
		run = sc2.nextInt();

	}
	public void Average()
	{
		average =(float) run/matches;
		System.out.println("Total Runs : "+run);
		System.out.println("Average : "+average);
	}
}

class Bowler extends Cricket
{
	Scanner sc3=new Scanner(System.in);
	public int wickets;
	public float average;
	Bowler() 
	{
		System.out.print("Enter The Wickets : ");
		wickets = sc3.nextInt();
	}
	public void Average()
	{
		average = (float) wickets/matches;
		System.out.println("Total Wickets : "+wickets);
		System.out.println("Average : "+average);
	}
}

class Match
{
	public static void main(String args[])
	{
		Scanner sc4=new Scanner(System.in);
		Cricket[] cal= new Cricket[5];
		
		int i;
		for(i=0;i<2;i++)
		{
			System.out.println();
			System.out.print("Enter Bowler or Batsman : ");
			String sc =sc4.nextLine();
			if(sc.equals("Bowler"))
			{
				cal[i]=new Bowler();
				cal[i].type=sc;
			}
			else
			{
				cal[i]=new Batsman();
				cal[i].type=sc;
			}
		}
		for(i=0;i<2;i++)
		{
			cal[i].displayinfo();
			cal[i].Average();
		}
	}
}