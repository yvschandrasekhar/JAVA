package com.DoubleLinkedList_01.pack;

public class Test1 {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(1, l);
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
	}

}
