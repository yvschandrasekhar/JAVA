package com.collections.pack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_02 {

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("nobitha", 1);
		m.put("suneo", 2);
		m.put("doremon", 3);
		m.put("Geon", 4);
		m.put("suzika", 5);
		m.put("doremi", 6);
		
		Set<String> s = m.keySet();
		Iterator<String> itr = s.iterator();
		while(itr.hasNext()) {
			Object k = itr.next();
			Object v = m.get(k);
			System.out.println(k+"\t"+v);
		}
	}

}
