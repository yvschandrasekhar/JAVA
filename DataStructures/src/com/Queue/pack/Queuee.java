package com.Queue.pack;

public class Queuee
{
	Object [] q=new Object[5];
	int size=0;
	int front=0;
	int rear=0;
	public void enQuee(Object e)
	{
		if(!isfull()) {
		q[rear]=e;
		rear=(rear+1)%5;
		size++;
		}else {
			System.out.println("Queue is full");
		}
	}
	public Object deQueue()
	{
		Object e=q[front];
		if(!isempty()) {
		front=front+1;
		size--;
		}else {
			System.out.println("Queue is empty");
		}
		return e;
	}
	public int size() {
		return size;
	}
	public boolean isfull()
	{
		if(size>=5)return true;
		return false;
	}
	public boolean isempty()
	{
		if(size<=0)return true;
		return false;
	}
	public void show()
	{
		for(int i=0;i<size();i++)
		{
			System.out.println(q[(front+i)%5]+" ");
		}
	}
}
