package com.stream.pack;

import java.util.ArrayList;
import java.util.List;

public class Demo_01 {

	public static void main(String[] args) {
		List<Integer> lis = new ArrayList<Integer>();
		lis.add(10);
		lis.add(11);
		lis.add(20);
		lis.add(21);
		lis.add(30);
		lis.add(31);
		lis.add(40);
		lis.add(41);
		lis.stream().filter(i->i%2==0).forEach(i->System.out.println(i));
	}

}
