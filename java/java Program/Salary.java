import java.util.Scanner;
class Employee
{
	int basicSalary;
	String empName;
	String design;
		Employee (String ename,String d,int b)
	{ 
		empName=ename;
		design=d;
		basicSalary=b;
	}
	float calculateSalary()
	{
		float da,hra,medical,pf,insurance,gross;
		da=basicSalary*0.15f;
		hra=basicSalary*0.1f;
		medical=basicSalary*0.04f;
		gross=basicSalary+da+hra+medical;
		pf=gross*0.05f;
		insurance=gross*0.07f;
		float net=gross-pf-insurance;
		return net;	
	}
	
}
class Salary
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Employee emp[]=new Employee[5];
		for(int i=0;i<5;i++)
		{
			
		System.out.println("enter name of the employee:");
		String name=sc.nextLine();
		System.out.println("enter the designation of the employee:");
		String design=sc.nextLine();
		System.out.println("enter the salary of the employee:");	
		int basicSalary=sc.nextInt();
    	emp[i]=new Employee(name,design,basicSalary);
		System.out.println("salary of employee"+i+"="+i+emp.calculateSalary());
		}
	}
}