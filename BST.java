import java.util.*;

class LL
{
	Node root;
	int flag = 0;
	class Node
	{
		int data;
		Node left,right;
		public Node(int d)
		{
			data = d;
			left=right=null;
		}
	}
	public void inOrder(Node last)
	{
		if(last != null)
		{
			inOrder(last.left);
			System.out.println("\t"+last.data);
			inOrder(last.right);
		}
	}
	public void insert(int d)
	{
		root = insertMe(root,d);
	}
	Node insertMe(Node last,int d)
	{
		if(last == null)
		{
			last = new Node(d);
			return last;
		}
		if(last.data > d)
		{
			last.left = insertMe(last.left,d);
		}
		else if(last.data < d)
		{
			last.right = insertMe(last.right,d);
		}
		return last;
	}
}
class BST
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		LL l1 = new LL();
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			l1.insert(sc.nextInt());
		}
		l1.inOrder(l1.root);
		
	}
}