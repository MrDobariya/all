void main()
{
	var num=5;
	var factorial=1;
	int i;

	for(i=num;i>=1;i--)
	{
		factorial *= i;
	}
	print("Factorial Is : ${factorial}");
} 