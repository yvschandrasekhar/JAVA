package com.DoubleLinkedList_01.pack;

public class LinkedList 
{
	Node head;
	int count=0;
	public void add(Object e)
	{
		if(head==null)
		{
			head=new Node(e);
			count++;
		}
		else
		{
			Node curr=head;
			while(curr.next!=null)
			{
				curr=curr.next;
			}
			curr.next=new Node(e,null,curr);
			count++;
		}
	}
	public int size()
	{
		return count;
	}
	public Object get(int index)
	{
		Node curr=head;
		for(int i=1;i<=index;i++)
		{
			curr=curr.next;
		}
		return curr.ele;
	}
	public void add(int index,Object e)
	{
		if(index==0)
		{
			head=new Node(e,head,null);
			count++;
		}
	}
}
