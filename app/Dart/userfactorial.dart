/*import 'dart:io';
void main()
{
	print("Enter the Number : ");
	int? no = int.parse(stdin.readLineSync()!);

	var f = 1;

	int factorial(int no)
	{
		while(no >=1)
		{
			f = f * no;
			no--;
		}
		return f;
	}

	var fact=factorial(no);
	print("${fact} is Factorial of ${no}");
}*/

import 'dart:io';
void main()
{
	print("Enter the Number : ");
	int? no = int.parse(stdin.readLineSync()!);

	var f = 1;
	int i;

	int factorial(int no)
	{
		for(i=no;i>=1;i--)
		{
			f = f * i;
		}
		return f;
	}

	var fact=factorial(no);
	print("${fact} is Factorial of ${no}");
}