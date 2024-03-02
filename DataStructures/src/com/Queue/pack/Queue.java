        package com.Queue.pack;

public class Queue
{
	Object[] queue=new Object[5];
	int size=0;
	int front=0;
	int rear=0;
	public void enQue(Object data)
	{
		if(!isfull()) {
			queue[rear]=data;
			rear=(rear+1)%5;
			size++;
		}
		else{
			System.out.println("Queue is full");
		}
	}
	public Object deQue()
	{
		Object data=queue[front];
		if(!isempty()) {
			front=front+1;
			size--;
		}
		else {
			System.out.println("Queue is empty");
		}
		return data;
	}
	public int size()
	{
		System.out.println("-------------");
		System.out.println(size);
		return size;
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
	public void Show()
	{
		for(int i=0;i<size;i++)
		{
			System.out.println(queue[(front+i)%5]+" ");
		}
	}
}
