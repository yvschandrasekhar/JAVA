package com.DataStructures.pack;

public class StackTest {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push("virat");
		s.push("Rohit");
		s.push("Dhoni");
		s.push("Hardik");
		for(int i=0;i<s.size();i++) {
			String st=(String)s.get(i);
			System.out.println(st);
		}
		System.out.println("-----------------");
		System.out.println(s.size());
		System.out.println(s.pop(s));
		System.out.println(s.peek(s));
	}

}
