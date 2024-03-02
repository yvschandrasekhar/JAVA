package com.stack.pack;

public class DyanmicStack
{
	int[] stack=new int[5];
	int top=0;
	public void push(int data)
	{
		if(top>4 )
		{
			System.out.println("Stack is full");
		}
		else {
		stack[top]=data;
		top++;
		}
	}
	public int pop()
	{
		int data=0;
		if(isempty())
		{
			System.out.println("Stack is empty");
		}
		else {
			top--;
			data=stack[top];
			stack[top]=0;
			System.out.println("pop="+data);
		}
			return data;	
	}
	public int peek()
	{
		int data=stack[top-1];
		System.out.println("peek="+data);
		return data;		
	}
	public int size()
	{
		System.out.println("size="+top);
		return top;
	}
	public boolean isempty()
	{
		if(top<=0)return true;
		return  false;
	}
	public void show()
	{
		for(int n:stack)
		{
			System.out.print(n+" ");
		}
	}
}
