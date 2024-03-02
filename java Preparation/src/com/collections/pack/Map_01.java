package com.collections.pack;

import java.util.HashMap;
import java.util.Map;

public class Map_01 {

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("chandu" , 99);
		m.put("chandu" , 100);
		System.out.println(m.get("chandu"));
	}

}
