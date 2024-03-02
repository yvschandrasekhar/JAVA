package com.collection.java;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.remove(0);
		System.out.println(a.isEmpty());
		ArrayList a1=new ArrayList();
		a1.add(40);
		a1.add(50);
		a.addAll(a1);
		for(Object o:a)
		{
			System.out.println(o);
		}
	}

}
