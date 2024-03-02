package com.DoubleLinkedList.pack;

public class Tes1 {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		//l.add(2, 25);
		//l.add(2,20);
		//l.add(3,30);
		l.remove(2);
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
	}

}
