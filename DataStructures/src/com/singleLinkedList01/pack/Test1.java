package com.singleLinkedList01.pack;

public class Test1 {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.remove(0);
		//list.add(3, 45);
		list.show();
		System.out.println("----------------");
		list.size();
		
	}

}
