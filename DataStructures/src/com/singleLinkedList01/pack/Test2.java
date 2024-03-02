package com.singleLinkedList01.pack;

public class Test2 {

	public static void main(String[] args) {
		LiinkedList li=new LiinkedList();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.remove(0);
		//li.add(2,35);
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
	}

}
