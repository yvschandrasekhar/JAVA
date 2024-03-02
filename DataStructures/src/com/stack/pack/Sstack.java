package com.stack.pack;

public class Sstack {
	Object[]stack=new Object[5];
	int top=0;
	public void push(Object e)
	{
		if(!isfull()) {
		stack[top]=e;
		top++;
		}else {
			System.out.println("Stack is full");
		}
	}
	public Object pop()
	{
		Object e=0;
		if(!isempty())
		{
			top--;
			e=stack[top];
		}else {
			System.out.println("Stack is empty");
		}
		return e;
	}
	public Object peek()
	{
		Object e=stack[top-1];
		return e;
	}
	public int size()
	{
		return top;
	}
	public boolean isfull()
	{
		if(size()>=5)return true;
		return false;
	}
	public boolean isempty()
	{
		if(size()<=0)return true;
		return false;
	}
	public void show()
	{
		for(Object n:stack)
		{
			System.out.println(n);
		}
	}
}
