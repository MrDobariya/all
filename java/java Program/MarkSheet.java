import java.util.Scanner;
class Student
{
	int rollno,java,vb,iot;
	String name,sclass;
	int total;
	double per;
	String grade="";

	Student()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter the Roll No. : ");
		rollno=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the Name : ");
		name=sc.nextLine();
		System.out.print("Enter the Class : ");
		sclass=sc.nextLine();

		System.out.print("ENter the JAVA Marks : ");
		java=sc.nextInt();
		System.out.print("Enter the VB.NET Marks : ");
		vb=sc.nextInt();
		System.out.print("Enter the IOT Marks : ");
		iot=sc.nextInt();

		total=java+vb+iot;
		per=total/300.2*100.2;
		if (per >= 90)
		{
            grade = "A+";
		}
        else if (per >= 80 && per<90)
       	{
      		grade = "A";
       	}
       	else if (per >=70 && per<80)
        {
            grade = "B+";
     	}
        else if (per >= 60 && per<70)
        {
            grade = "B";
        }
        else if (per >= 50 && per<60)
        {
            grade = "C";
        }
        else if (per >= 40 && per<50)
        {
            grade = "D";
        }
        else
        {
            grade = "E";
        }
	}
	void DisplayStudent()
	{
		System.out.println();
		System.out.println("Roll No : "+rollno);
		System.out.println("Name : "+name);
		System.out.println("Class : "+sclass);

		System.out.println("JAVA Marks : "+java);
		System.out.println("VB.NET Marks : "+vb);
		System.out.println("IOT Marks : "+iot);

		System.out.println("Total Marks : " +total);
		System.out.println("Percentage : "+per);
		System.out.println("Grade : "+grade);
	}

}

class MarkSheet
{
	public static void main(String args[])
	{
		Student[] m=new Student[5];
		int i;
		for(i=0;i<2;i++)
		{
			m[i]=new Student();
		}
		for(i=0;i<2;i++)
		{
			m[i].DisplayStudent();
		}
	}
}
