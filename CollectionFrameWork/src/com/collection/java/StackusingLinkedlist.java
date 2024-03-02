package com.collection.java;

import java.util.LinkedList;
import java.util.List;

public class StackusingLinkedlist {

	public static void main(String[] args) {
		List l=new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
	}

}
