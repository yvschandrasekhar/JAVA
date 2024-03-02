package com.stack.pack;

public class Stackk
{
	Object[]stack =new Object[5];
	int top=0;
	public void push(Object data)
	{
		stack[top]=data;
		top++;
	}
	public Object pop()
	{
		Object data=0;
		if(isempty())
		{
			System.out.println("Stack is empty");
		}else {
			top--;
			data=stack[top];
			stack[top]=0;
		}
		return data;
	}
	public int size()
	{
		//System.out.println("size="+top);
		return top;
	}
	public Object peek()
	{
		return stack[top-1];
	}
	public boolean isempty()
	{
		if(top<=0)return true;
		return false;
	}
	public boolean isfull()
	{
		if(top>=size())return true;
		return false;
	}
	public void show() {
		for(Object e:stack)
		{
			System.out.println(e);
		}
	}
}
