package com.DoubleLinkedList.pack;

public class Test2 {

	public static void main(String[] args) {
		LinkedLisst list=new LinkedLisst();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(10);
		list.add(2, 45);
		list.show();
		System.out.println("---------------------------------");
		list.size();
	}

}
