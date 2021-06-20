package Automation_test;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class Java_test_Enumeration_CUrsor {

	public static void main(String[] args) {
		Vector v =new Vector();
		
		for(int i=0;i<=10;i++) {
			v.addElement(i);
		}
		
		System.out.println(v);
		
		System.out.println("capacity of Vector : "+v.capacity());
		
		System.out.println("Size Of Vector : "+v.size());
		
		Enumeration e=v.elements();
		
		while(e.hasMoreElements())
		{
			Integer i=(Integer)e.nextElement();
			System.out.println(i);
//			if(i%2==0)
//			{
//				System.out.println(i);
//			}
		}
		System.out.println(v);		
		
	}

}
