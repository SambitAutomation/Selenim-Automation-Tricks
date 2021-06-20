package Automation_test;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class Java_Test_Iterator {

	public static void main(String[] args) {
		
		ArrayList l=new ArrayList();
		
		for(int i=0;i<=10;i++) {
			l.add(i);
		}
		
		System.out.println(l);
		
		System.out.println("Size Of Vector : "+l.size());
		
		//System.out.println("Capacity Of Vector : "+l.capacity());
		
		Iterator i=l.iterator();
		
		while(i.hasNext())
		{
			Integer I=(Integer)i.next();
		//	System.out.println(i);
			
			if(I%2==0)
			{
				System.out.println(I);
			}
			else 
				i.remove();
		}
		System.out.println(l);

	}

}
