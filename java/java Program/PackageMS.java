import P1.stud;
import P1.P2.result;
import java.util.Scanner;
class PackageMS
{
	public static void main(String args[])
	{
		stud s=new stud();
		result r=new result();
		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.print("Enter the Roll No. : ");
		s.rollno=sc.nextInt();
		System.out.print("Enter the Name : ");
		s.name=sc.nextLine();
		sc.nextLine();
		System.out.print("Enter the Class : ");
		s.stream=sc.nextLine();

		System.out.print("Enter the JAVA Marks : ");
		r.java=sc.nextInt();
		System.out.print("Enter the VB.NET Marks : ");
		r.vb=sc.nextInt();  	
		System.out.print("Enter the IOT Marks : ");
		r.iot=sc.nextInt();
		
		System.out.println("Shree Uttar Gujarat BCA College");
		System.out.println("Roll No. : " + s.rollno + "  Name : " + s.name);
		System.out.println("Class : " + s.stream);
		System.out.println(" :: Marks In :: ");
		System.out.println("JAVA : " + r.java + "  VB.NET : " + r.vb + "  IOT : " + r.iot);
		System.out.println("Total Marks : " +(r.java + r.vb + r.iot));
	}
}