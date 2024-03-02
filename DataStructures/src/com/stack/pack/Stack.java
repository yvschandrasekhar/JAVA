

package com.stack.pack;

public class Stack
{
	Object[] stack=new Object[5];
	int top=0;
	public void push(Object data)
	{
		if(!isfull()) {
			stack[top]=data;
			top++;
			}
		else
		{
			System.out.println("Stack is full");
		}
	}
	public Object pop()
	{
		Object data=0;
		if(!isempty())
		{
			top--;
			data=stack[top];
			stack[top]=0;
			System.out.println("pop="+data);
		}
		else {
			System.out.println("Stack is empty");
		}
			return data;	
	}
	public Object peek()
	{
		Object data=stack[top-1];
		System.out.println("peek="+data);
		return data;		
	}
	public int size()
	{
		//System.out.println("size="+top);
		return top;
	}
	public boolean isempty()
	{
		if(size()<=0)return true;
		return  false;
	}
	public boolean isfull()
	{
		if(size()>=5)return true;
			return false;
	}
	public void show()
	{
		for(Object n:stack)
		{
			System.out.print(n+" ");
		}
	}
}
