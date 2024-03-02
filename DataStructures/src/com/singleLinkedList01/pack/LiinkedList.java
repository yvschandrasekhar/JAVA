package com.singleLinkedList01.pack;

public class LiinkedList
{
	Noode head;
	int count=0;
	public void add(Object e)
	{
		if(head==null)
		{
			head=new Noode(e);
			count++;
		}else {
		Noode curr=head;
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		curr.next=new Noode(e);
		count++;
		}
	}
	public int size() {
		return count;
	}
	public Object get(int index)
	{
		if(index<=-1 || index>=size())throw new ArrayIndexOutOfBoundsException(); 
		Noode curr=head;
		for(int i=1;i<=index;i++)
		{
			curr=curr.next;
		}
		return curr.ele;
	}
	public void add(int index,Object e)
	{
		if(index<=-1 || index>=size())throw new ArrayIndexOutOfBoundsException(); 
		if(index==0)
		{
			head=new Noode(e,head);
			count++;
		}
		else
		{
			Noode curr=head;
			for(int i=1;i<index;i++)
			{
				curr=curr.next;
			}
			curr.next=new Noode(e,curr.next);
			count++;
		}
	}
	public void remove(int index)
	{
		if(index<=-1 || index>=size())throw new ArrayIndexOutOfBoundsException(); 
		if(index==0)
		{
			head=head.next;
			count--;
		}
		else
		{
			Noode curr=head;
			for(int i=1;i<index;i++)
			{
				curr=curr.next;
			}
			curr.next=curr.next.next;
			count--;
		}
	}
}
