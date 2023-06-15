package ch15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample3 {

	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Java");
		set.add("Spring");
		
		Iterator<String> it=set.iterator();
		while(it.hasNext()) {
			String element=it.next();
			System.out.println(element);
			if(element.equals("JSP")) {
				it.remove();
			}
		}
		System.out.println();
		set.remove("JDBC");
		for(String s:set) {
			System.out.println(s);
		}
		

	}

}
