// Java program to demonstrate working of nested iterators 
// may not work as expected and throw exception. 
import java.util.*; 

public class LinkedListDemo 
{ 
	public static void main(String args[]) 
	{ 
		// Create a link list which stores integer elements 
		java.util.LinkedList<Integer> l = new java.util.LinkedList<Integer>(); 
		

		// Now add elements to the Link List 
		l.add(2); 
		l.add(3); 
		l.add(4); 

		
		System.out.println(l.element());
		// Make another Link List which stores integer elements 
		List<Integer> s=new java.util.LinkedList<Integer>(); 
		s.add(7); 
		s.add(8); 
		s.add(9); 

		// Iterator to iterate over a Link List 
		for(Integer first:l)
		{
			for(Integer second : s)
			{
				if(first > second)
				{
					System.out.println("First:"+first);
				}
			}
		}
	}
} 
