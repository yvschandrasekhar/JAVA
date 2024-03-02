package com.stack.pack;

public class Staack
{
	Object[]stack=new Object[5];
	int top=0;
	public void push(Object e)
	{
		stack[top]=e;
		top++;
	}
	public Object pop()
	{
		Object data;
		top--;
		data=stack[top];
		stack[top]=0;
		return data;
	}
	public Object peek()
	{
		Object data=stack[top-1];
		return data;
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
	public void show() {
		for(Object o:stack)
		{
			System.out.println(o);
		}
	}
}
