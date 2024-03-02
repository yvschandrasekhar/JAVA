package com.singleLinkedList.pack;

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
		else {
			Node curr=head;
			while(curr.next!=null)
			{
				curr=curr.next;
			}
			curr.next=new Node(e);
			count++;
		}
	}
	public int size()
	{
		return count;
	}
	public Object get(int index)
	{
		if(index<=-1 || index>=size())throw new IndexOutOfBoundsException();
		Node curr=head;
		for(int i=1;i<=index;i++)
		{
			curr=curr.next;
		}
		return curr.ele;
	}
	public void add(int index,Object e)
	{
		if(index<=-1 || index>=size())throw new IndexOutOfBoundsException();
		if(index==0)
		{
			head=new Node(e,head);
			count++;
		}
		else
		{
			Node curr=head;
			for(int i=1;i<index;i++)
			{
				curr=curr.next;
			}
			curr.next=new Node(e,curr.next);
			count++;
		}
	}
	public void remove(int index)
	{
		if(index==0)
		{
			head=head.next;
			count--;
		}
		else
		{
			Node curr=head;
			for(int i=1;i<index;i++)
			{
				curr=curr.next;
			}
			curr.next=curr.next.next;
			count--;
		}
	}
	public void reverse()
	{
		Node prev=null;
		Node curr=head;
		Node next=null;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;
	}
}
