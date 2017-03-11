import java.util.*;

class Collection_Linked_List
{
	public static void main(String []args)
	{
		//Scanner sc = new Scanner(System.in);
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(50);
		l1.add(62);
		l1.add(13);
		l1.add(58);
		
		l1.addFirst(01);
		l1.addLast(99);
		
		l1.add(2,777);
		
		Iterator it = l1.iterator(); // It only traverse in forword direction
		//ListIterator it = l1.listIterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println();
		l1.remove();
		l1.remove(2);
		l1.remove(new Integer(99));
		
		System.out.println("\tAfter Deletion...");
		//System.out.println(l1.getFirst());
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		
		System.out.println("\tReverse Order...");
		it = l1.descendingIterator();	// 'descendingIterator()' may be only for linked-list 
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}