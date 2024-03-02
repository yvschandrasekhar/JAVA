package com.DataStructures.pack;

public class Stack {
	Object[]Stack=new Object[5];
	int top=0;
	public void push(Object o)
	{
		if(!isfull()) {
			Stack[top]=o;
			top++;
		}else {
			System.out.println("Stack is full");
		}
	}
	public Object pop(Object o) {
		Object data=0;
		if(!isempty()) {
			top--;
			data=Stack[top];
		}else {
			System.out.println("Stack is empty");
		}
		return data;
	}
	public Object peek(Object o) {
		Object data=Stack[top-1];
		return data;
	}
	public int size() {
		return top;
	}
	public boolean isempty() {
		if(size()<=0)return true;
		return false;
	}
	public boolean isfull() {
		if(size()>=5)return true;
		return false;
	}
	public Object get(int index) {
		return Stack[index];
	}
}
