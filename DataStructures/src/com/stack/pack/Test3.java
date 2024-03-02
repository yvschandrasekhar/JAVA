package com.stack.pack;

public class Test3 {

	public static void main(String[] args) {
		Staack s=new Staack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.show();
		System.out.println(s.pop());
		System.out.println(s.peek());
	}

}
