import java.util.Scanner;

class Cricketer 
{
	Scanner sc = new Scanner(System.in);
	public String cname;
	public int nom;
	Cricketer() 
	{
		
		System.out.print("Enter the name of Cricketer: ");
		cname = sc.nextLine();
		System.out.print("Enter the Number of matches of Cricketer: ");
		nom = sc.nextInt();
		sc.nextLine();
	}
	public void displayinfo() 
	{
		System.out.println("Name " +cname);
		System.out.println("Matches " +nom);
	}
}

class Batsman extends Cricketer 
{
	public int total_run;
	public float average;
	Batsman() 
	{
		System.out.print("Enter the Total Number of Runs: ");
		total_run = sc.nextInt();
	}
	public void displayData()
	{
		System.out.println("Total Runs "+total_run);
	}
}
class Bowler extends Cricketer 
{
	public int wickets;
	public float average;
	Bowler() 
	{
		System.out.print("Enter the number of wickets: ");
		wickets = sc.nextInt();
	}
	public void displayData() 
	{
		System.out.println("Wickets "+wickets);
	}
}

class Cricket 
{
	public static void main(String[] args) 
	{
		Bowler[] bowl = new Bowler[5];
		Batsman[] bat = new Batsman[5];
		Cricketer[] cal = new Cricketer[5];
		for(int i=0;i<5;i++)
		{
			cal[i]=new Cricketer();
			bat[i]=new Batsman();
			bowl[i]=new Bowler();

			bowl[i].average = (float) bowl[i].wickets/cal[i].nom;
			bat[i].average = (float) bat[i].total_run/cal[i].nom;
		}
		for(int i=0;i<5;i++)
		{
			cal[i].displayinfo();
			bat[i].displayData();
			bowl[i].displayData();
			System.out.println("Batting Average: "+bat[i].average);
			System.out.println("Bowling Average: "+bowl[i].average);
		}
	}
}