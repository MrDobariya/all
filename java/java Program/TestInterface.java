interface AIR
{
	String tostring();
}

abstract class AIRPlan implements AIR
{
	char type;
	static int serno;
	int cap;
	AIRPlan(char t, int c)
	{
		type=t;
		cap=c;
	}
} 

class AIRINDIA extends AIRPlan
{
	AIRINDIA(char t, int c)
	{
		super(t,c);
	}
	public String tostring()
	{
		serno=serno+1;
		return("AIRINDIA : "+type+"\t"+serno+"\t"+cap);
	}
}

class JETAIR extends AIRPlan
{
	JETAIR(char t, int c)
	{
		super(t,c);
	}
	public String tostring()
	{
		serno=serno+1;
		return("JETAIR : "+type+"\t"+serno+"\t"+cap);
	}
}

class TestInterface
{
	public static void main(String args[])
	{
		AIRPlan rf;
		AIRINDIA ob1=new AIRINDIA('A',10);
		JETAIR ob2=new JETAIR('B',20);
		rf=ob1;
		System.out.println(rf.tostring());
		rf=ob2;
		System.out.println(rf.tostring());
	}
}