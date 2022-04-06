import java.util.*;
class CircularList
{
	static class Node
	{
		int data;
		Node next;
		Node(int x)
		{
			data=x;
			next=null;
		}
	}
	Node head=null;
	Node tail=null;
	public static void main(String args[])
	{
		int ch,x;
		CircularList sl=new CircularList();
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println();
			System.out.println("***** Circular LinkList *****");
			System.out.println("Press 1 For Insert First Node");
			System.out.println("Press 2 For Insert Last Node");
			System.out.println("Press 3 For Delete First Node");
			System.out.println("Press 4 For Delete Last Node");
			System.out.println("Press 5 For Display Node");
			System.out.println("Press 0 For Exi!");
			System.out.println("************ END ************");
			System.out.println();

			System.out.print("Enter Choice : ");
			ch=sc.nextInt();
			System.out.println();
			
			switch(ch)
			{
				case 1:
					System.out.print("Enter Value : ");
					x=sc.nextInt();
					sl=insert_first(sl,x);
					display(sl);
					break;
				case 2:							
					System.out.print("Enter Value : ");
					x=sc.nextInt();
					sl=insert_last(sl,x);
					display(sl);
					break;
				case 3:
					sl=delete_first(sl);
					display(sl);
					break;
				case 4:
					sl=delete_last(sl);
					display(sl);
					break;
				case 5:
					display(sl);
					break;	
				case 0:
					break;
				default:
					System.out.println("Wrong Choice!");
					break;
			}
		}while(ch!=0);
	}
	public static CircularList insert_first(CircularList sl,int x)
	{
		Node newNode= new Node(x);
		if(sl.head==null)
		{
			sl.head=newNode;
			sl.tail=newNode;
			newNode.next=sl.head;
			System.out.println("First Node Inserted successfully!");
			return sl;
		}
		else
		{
			newNode.next=sl.head;
			sl.head=newNode;
			System.out.println("First Node Inserted successfully!");
			return sl;
		}
	}
	public static CircularList insert_last(CircularList sl,int x)
	{
		Node newNode= new Node(x);
		if(sl.head==null)
		{
			sl.head=newNode;
			sl.tail=newNode;
			newNode.next=sl.head;
			System.out.println("Last Node Inserted successfully!");
			return sl;
		}
		else
		{		
			sl.tail.next=newNode;
			sl.tail=newNode;
			newNode.next=sl.head;
			System.out.println("Last Node Inserted successfully!");
		}
		return sl;
	}
	public static CircularList delete_first(CircularList sl)
	{
		if(sl.head==null)
		{
			System.out.println("List is Underflow!");
			return sl;
		}
		else 
		{
			if(sl.head==sl.tail)
			{
				sl.head=null;
				sl.tail=null;
				System.out.println("First Node Deleted successfully!");
			}
			else{
				Node temp=sl.head;
				sl.head=temp.next;
				System.out.println("First Node Deleted successfully!");
				temp=null;
			}
		}
		return sl;
	}
	public static CircularList delete_last(CircularList sl)
	{
		if (sl.head==null) 
		{
			System.out.println("List is Empty!");
			return sl;
		} 
		else 
		{
			if (sl.head!=sl.tail) 
			{
				Node curr=sl.head;
				while (curr.next!=sl.tail) 
				{
					curr=curr.next;
				}
				sl.tail=curr;
				sl.tail.next=sl.head;
				System.out.println("Last Node Deleted successfully!");
			}
			else 
			{
				sl.head=sl.tail;
				sl.head=null;
				System.out.println("Last Node Deleted successfully!");
			}
		}
		return sl;
	}
	public static void display(CircularList sl)
	{
		if(sl.head==null)
		{
			System.out.println("List is Empty");
			return;
		}
		else
		{
			Node curr=sl.head;
			System.out.println("");
			System.out.println(":: Circular LinkList ::");
			while(curr!=sl.tail)
			{
				System.out.print(" "+curr.data);
				curr=curr.next;
			}
			System.out.print(" "+curr.data);
			System.out.println("");
		}
	}
}