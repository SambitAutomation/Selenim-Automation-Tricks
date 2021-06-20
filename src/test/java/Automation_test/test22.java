package Automation_test;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class test22 {

	public static void main(String[] args) {
		
		 HashMap hm = new HashMap();
	        hm.put("c",700);
	        hm.put("b",800);
	        hm.put("v",200);
	        hm.put("n",500);
	        System.out.println(hm);
	        System.out.println(hm.put("c",1000));
	        Set s = hm.keySet();
	        System.out.println(s);
	        Collection c = hm.values();
	        System.out.println(c);
	        Set s1 = hm.entrySet();
	        System.out.println(s1);
	        Iterator itr = s1.iterator();
	        while (itr.hasNext()){
	            Map.Entry m1 = (Map.Entry)itr.next();
	            System.out.println(m1.getKey() +".........."+m1.getValue());
	            if(m1.getKey().equals("n")){
	                m1.setValue(1000);
	            }
	        }
	        System.out.println(hm);

	}

}
