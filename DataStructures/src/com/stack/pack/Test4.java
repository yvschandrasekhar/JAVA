package com.stack.pack;

public class Test4 {

	public static void main(String[] args) {
		Sstack s=new Sstack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.show();
		System.out.println("-------------------");
		System.out.println(s.peek());
	}

}
