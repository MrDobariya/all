void main()
{
	var num=0;
	var count=0;

	for(num=0;num<=20;num++)
	{
		if(num%2==0)
		{
			continue;
		}
		count++;
	}
	print("The count of odd value between 0 ans 20 is : ${count}");
}