package com.jdk8.pack;

import java.util.LinkedList;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		List<Integer>li=new LinkedList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		/*for(int i:li) {
			System.out.println(i);
		}*/
		li.forEach(i->System.out.println(i)); 
	}

}
