class A
{
	A()
	{
		System.out.println("Super Class Constructor!");
	}
	void display()
	{
		System.out.println("Super Class Method!");
	}
}

class B extends A
{
	B()
	{
		System.out.println("Sub Class Constructor!");
	}
	void display()
	{
		System.out.println("Sub Class Method!");
	}
}

class MultilevelInheritance
{
	public static void main(String args[])
	{
		//A a=new A();
		//a.display();
		A b=new B();
		b.display();
	}
}