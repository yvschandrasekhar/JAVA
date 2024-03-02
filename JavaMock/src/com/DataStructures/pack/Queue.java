package com.DataStructures.pack;

public class Queue {
	Object[]queue=new Object[5];
	int count=0;
	int front=0;
	int rear=0;
	public void enqueue(Object data)
	{
		if(!isfull()){
			queue[rear]=data;
			rear=(rear+1)%5;
			count++;
		}else {
			System.out.println("Queue is full");
		}
	}
	public Object deque(){
		Object data=queue[front];
		if(!isempty()) {
			front=front+1;
			count--;
		}else {
			System.out.println("Queue is empty");
		}
		return data;
	}
	public int size() {
		return count;
	}
	public boolean isfull() {
		if(size()>=5)return true;
		return false;
	}
	public boolean isempty() {
		if(size()<=0)return true;
		return false;
	}
	public Object get(int index) {
		return queue[(front+index)%5];
	}
}
