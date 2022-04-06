import java.io.*;
import java.util.*;

public class linklist
{
	Node first;
	Node curr;
	Node temp;

	static class Node
	{
		int data;
		Node next;

		Node(int number)
		{
			data=number;
			next=null;
		}
	}

	public static linklist insertnode(linklist list,int data)
	{
		Node newnode=new Node(data);
		newnode.next=null;

		if(list.first==null)
		{
			list.first=newnode;
		}
		else
		{
			list.curr=list.first;
			while(list.curr.next!=null)
			{
				list.curr=list.curr.next;
			}
			list.curr.next=newnode;
		}

		return list;
	}

	public static void display(linklist list)
	{
		if(list.first==null)
		{
			System.out.println("Linklist is empty!");
			return;
		}
		list.curr=list.first;
		while(list.curr.next!=null)
		{
			System.out.print("["+ list.curr + "|" + list.curr.data + "|" + list.curr.next +"]--");
			list.curr=list.curr.next;
		}
		System.out.print("["+ list.curr + "|" + list.curr.data + "|" + list.curr.next +"]");
	}

	public static void deletenode(linklist list)
	{
		if(list.first==null)
		{
			System.out.println("Linklist is empty!");
			return;
		}
		list.curr=list.first;
		while(list.curr.next!=null)
		{
			list.temp=list.curr;
			list.curr=list.curr.next;
		}
		list.curr=list.temp;
		list.curr.next=null;
		System.out.println("Last Node Successfully Deleted!");
	}

	public static void main(String args[])
	{
		Scanner o=new Scanner(System.in);
		linklist list=new linklist();
		int ch,num;

		do
		{
			System.out.println("");
			System.out.println("Press 1 for new node");
			System.out.println("Press 2 for delete node");
			System.out.println("Press 3 for display node");
			System.out.println("Press 0 for exit");
			System.out.println("");

			System.out.print("Enter your choise:");
			ch=o.nextInt();

			switch(ch)
			{
				case 1:
					System.out.print("Enter Value:");
					num=o.nextInt();
					list=insertnode(list, num);
					display(list);
					break;
				case 2:
					deletenode(list);
					display(list);
					break;
				case 3:
					display(list);
					break;
				case 0:
					break;
				default:
					System.out.println("Wrong choise!");
			}

		}while(ch!=0);
	}

}