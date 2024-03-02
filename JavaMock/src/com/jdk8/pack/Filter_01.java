package com.jdk8.pack;

import java.util.ArrayList;

public class Filter_01 {

	public static void main(String[] args) {
		ArrayList<Integer>li=new ArrayList<Integer>();
		li.add(10);
		li.add(15);
		li.add(20);
		li.add(25);
		li.add(30);
		li.stream().filter(i-> i%2==0 && i>=10).forEach(i->System.out.println(i));
	}

}
