package Automation_test;

import java.util.LinkedList;
import java.util.ListIterator;

public class Java_Test_ListIterator {
	
	public static void main(String[] args) {
	
		
		LinkedList l =new LinkedList();
		
		l.add("Bala");
		l.add("Venki");
		l.add("Chiru");
		l.add("Nag");
		
		System.out.println(l);
		
		ListIterator itr=l.listIterator();
		
		while(itr.hasNext())
		{
			String name=(String)itr.next();
			
			System.out.println(name);
			
			if(name.equals("Venki"))
			{
				itr.remove();
			}
			
			else if (name.equals("Nag")) {
				itr.add("Chaitu");
			}
			
			else if (name.equals("Chiru")) {
				itr.set("Charan");
			}
		}
		
		System.out.println(l);
	}

}
