package com.DataStructures.pack;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList li=new LinkedList();
		li.add("yvscs");
		li.add("dudu");
		li.add("yvs");
		li.add("chandu");
		li.add("Bunty");
		//li.add(2, "bubbu");
		//li.remove(3);
		li.reverse();
		for(int i=0;i<li.size();i++)
		{
			String s=(String)li.get(i);
			System.out.println(s);
		}
		System.out.println("------------------");
		System.out.println(li.size());
		System.out.println("------------------");
	}

}
