package com.stream.pack;

import java.util.LinkedList;
import java.util.List;

public class Demo_02 {
	public static void main(String[] args) {
		List<Integer> li = new LinkedList<Integer>();
		li.add(10);
		li.add(11);
		li.add(20);
		li.add(21);
		li.add(30);
		li.add(31);
		li.add(40);
		li.add(41);
		li.add(50);
		li.stream().filter(i->i%2!=0).map(i->i*2).forEach(i->System.out.println(i));;
	}
}
