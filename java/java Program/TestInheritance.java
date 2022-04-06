class Room
{
	int length,breadth;
	
	Room(int x, int y)
	{
		length=x;
		breadth=y;
	}
	
	int area()
	{
		return(length*breadth);
	}
}

class BedRoom extends Room
{
	int height;
	
	BedRoom(int x, int y, int z)
	{
		super(x,y);
		height=z;
	}
	
	int volume()
	{
		return(length*breadth*height);
	}
}

class TestInheritance
{
	public static void main(String args[])
	{
		BedRoom b=new BedRoom(15,35,10);
		int area=b.area();
		int volume=b.volume();
		
		System.out.println("Area = "+area);
		System.out.println("Volume = "+volume);
	}
}