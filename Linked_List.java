import java.util.*;

class LL {
	Node head = null;
	class Node {
		int data;
		Node next;
		Node(int d)	//allocate memory to node
		{
			data = d;
			next = null;
		}
	}

	public void display()
	{
		Node last = head;
		while(last.next != null)
		{
			System.out.println("\t"+last.data);
			last = last.next;
		}
		System.out.println("\t"+last.data);
	}
	public void insert_beg(int d)
	{
		Node new_node = new Node(d);
		if(head == null)
		{
			head = new_node;
			//return ;
		}
		else {
			new_node.next = head;
			head = new_node;
		}
	}
	public void insert_rand(int d,int pos)
	{
		Node new_node = new Node(d);
		Node last = head;
		while(last != null && last.data != pos)
		{
			last = last.next;
		}
		if(last == null)	//element not found
		{
			System.out.println("Element not Found");
			return ;
		}
		else {
			new_node.next = last.next;
			last.next = new_node;
		}
	}
	public void insert_end(int d)
	{
		Node new_node = new Node(d);
		if(head == null)
		{
			head = new_node;
			//return ;
		}
		else {
			Node last = head;
			while(last.next != null)
			{
				last = last.next;
			}
			last.next = new_node;
		}
		//head = new_node;
	}
	public void delete(int d)
	{
		Node curr = head;
		Node pre = null;
		while(curr != null && curr.data != d)
		{
			pre = curr;
			curr = curr.next;
		}
		if(curr == null)
		{
			System.out.println("Element for deletion not Found");
			return ;
		}
		if(curr == head)
		{
			head = curr.next;
			curr.next = null;
			return;
		}
		pre.next = curr.next;
		curr.next = null;
	}
	public void merge(Node head1,Node head2)
	{
		Node last1 = head1;
		Node last2 = head2;
		Node tmp = head;	// head of 3rd LL;
		//System.out.println("\n"+last1.data);
		while(last1 != null || last2 != null)
		{
			//System.out.println("\t"+last1.data+"\t"+last2.data);
			if(last1.data<last2.data)
			{
				insert_end(last1.data);
				last1 = last1.next;
				System.out.println("\n"+head.data);
			}
			else
			{
				System.out.println("\n"+head.data);
				insert_end(last2.data);
				last2 = last2.next;

			}
		}
		if(last1 != null)
		{
			while(last1 != null)
			{
				insert_end(last1.data);
				last1 = last1.next;
			}
		}
		else
		{
			while(last2 != null)
			{
				insert_end(last2.data);
				last2 = last2.next;
			}
		}
		//System.out.println("\t"+last1.data+"\t"+last2.data);
	}
}

class Linked_List
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		LL l1 = new LL();
		LL l2 = new LL();
		LL l3 = new LL();
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int tmp = sc.nextInt();
			l1.insert_end(tmp);
			l2.insert_end(tmp-1);
		}
		//l1.insert_beg(101);
		//l1.insert_rand(202,20);
		//l1.insert_end(999);
		l1.display();
		System.out.println();
		l2.display();
		//l1.delete(999);
		//l1.display();
		l3.merge(l1.head,l2.head);
		l3.display();
	}
}