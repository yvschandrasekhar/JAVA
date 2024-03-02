package com.stack.pack;

public class Test1 {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		//s.push(30);
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		//s.peek();
		//s.size();
		s.show();
	}

}
