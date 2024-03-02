package com.collection.java;
import java.util.Stack;
public class Test1 {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(20);
		s.push(20);
		s.pop();
		for(Object o:s)
		{
			System.out.println(o);
		}
	}

}
