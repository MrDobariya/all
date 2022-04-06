import "dart:io";
main()
{
	print("Sum of Two Number!");
	print("Enter First Number : " + int? n1=int.parse(stdin.readLineSync()!););
	//int? n1=int.parse(stdin.readLineSync()!);

	print("Enter Second Number :");
	int? n2=int.parse(stdin.readLineSync()!);

	int sum=n1+n2;
	print("Sum Is : $sum");
}