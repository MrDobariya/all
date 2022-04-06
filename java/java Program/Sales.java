import store.Stock;
import java.util.Scanner;
class Sales
{
	public static void main(String args[])
	{
		Stock st=new Stock();
		Scanner sc=new Scanner(System.in);
		int sold[]=new int[5];
		int curstock[]=new int[5];
		int totlestock=0;

		for(int i=0;i<5;i++)
		{
			System.out.println("");
			System.out.print("Enter the Item No. : ");
			st.item_no[i]=sc.nextInt();
			sc.nextLine();
		
			System.out.print("Enter the Item Name : ");
			st.item_name[i]=sc.nextLine();
		
			System.out.print("Enter the Available Stock : ");
			st.stock[i]=sc.nextInt();
		
			System.out.print("Enter the Cost : ");
			st.cost[i]=sc.nextInt();
		
			System.out.print("Enter the Quantity Sold : ");
			sold[i]=sc.nextInt();
		}
		

		for(int i=0;i<5;i++)
		{
			System.out.println("");
			System.out.println("Item No. : "+st.item_no[i]);
			System.out.println("Item Name : "+st.item_name[i]);
			System.out.println("Item Stock : "+st.stock[i]);
			System.out.println("Item Cost : "+st.cost[i]);
			System.out.println("Item Sold : "+sold[i]);
		
			curstock[i]=st.stock[i]-sold[i];
			System.out.println("currant Stock is :"+curstock[i]);

			totlestock=totlestock+curstock[i];
		}
		System.out.println("Total Stock Is : "+totlestock);
	}
}