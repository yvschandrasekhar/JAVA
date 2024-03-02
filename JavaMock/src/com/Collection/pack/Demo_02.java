package com.Collection.pack;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Demo_02 {

	public static void main(String[] args) {
		Map m=new TreeMap();
		m.put("yvs", 16);
		m.put("yvscs", 19);
		m.put("chandu", 20);
		m.put("bunty", 10);
		m.put("dudu", 22);
		System.out.println("size======"+m.size());
		Set s=m.keySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			Object k=itr.next();
			Object v=m.get(k);
			System.out.println("k="+k+" , v="+v);
		}
	}

}
