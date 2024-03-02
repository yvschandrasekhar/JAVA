package com.innerclasses.pack;

import java.util.ArrayList;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<Integer>();
		values.add(10);
		values.add(10);
		values.add(10);
		values.add(10);
		values.add(10);
		values.forEach(e-> System.out.println(e));
	}

}
