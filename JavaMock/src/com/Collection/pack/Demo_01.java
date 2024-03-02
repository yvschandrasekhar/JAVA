package com.Collection.pack;

import java.util.Hashtable;
import java.util.Map;

public class Demo_01 {

	public static void main(String[] args) {
		Map m=new Hashtable();
		m.put("java", 10);
		m.put("sql", 20);
		m.put("java", 30 );
		System.out.println(m.size());
		System.out.println(m.get("java"));
	}

}
