package com.Collection.pack;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Demo_04 {

	public static void main(String[] args) {
		Map m=new LinkedHashMap();
		m.put("Lab", 1);
		m.put("German", 2);
		m.put("Husky", 3);
		m.put("Daubor", 4);
		m.put("Lab", 5);
		Set s=m.keySet();
		System.out.println(s);
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			Object k=itr.next();
			Object v=m.get(k);
			System.out.println(k+"   "+v);
		}
	}

}
