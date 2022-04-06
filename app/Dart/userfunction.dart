import "dart:io";
void main()
{
	
	print("Enter First Number :");
	int? n1=int.parse(stdin.readLineSync()!);

	print("Enter Second Number :");
	int? n2=int.parse(stdin.readLineSync()!);

	int sum(int n1,int n2)
	{
		int result;
		result=n1+n2;
		return result;
	}
	
	var c=sum(n1,n2);
	print("The Sum Is : ${c}");
}

