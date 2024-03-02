package com.DataStructures.pack;

public class ArrayTest {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		/*al.add("chandu");
		al.add("yvscs");
		al.add("yvs");
		al.add("bunty");
		for(int i=0;i<al.size();i++)
		{
			String s=(String)al.get(i);
			System.out.println(s);
		}*/
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("-----------------");
		System.out.println(al.size());
	}

}
