class Employee
{
	int basicSalary;
	String empName;
	String design;
	
	Employee (String ename,String d,int bS)
	{ 
		empName=ename;
		design=d;
		basicSalary=bs;
	}
	float calculateSalary()
	{
		float da,hra,medical,pf,insurance,gross;
		da=basicSalary*0.15f;
		hra=basicSalary*0.1f;
		medical=basicSalary*0.04f;
	}
}