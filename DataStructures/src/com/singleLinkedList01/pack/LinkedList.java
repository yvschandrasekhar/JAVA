package com.singleLinkedList01.pack;

public class LinkedList {
	Node head;
	int count=0;
	public void add(Object ele)
	{
		Node node =new Node();
		node.ele=ele;
		node.next=null;
		if(head==null)
		{
			head=node;
			count++;
		}
		else
		{
			Node fresh=head;
			while(fresh.next!=null)
			{
				fresh=fresh.next;
			}
			fresh.next=node;
			count++;
		}
	}
	public int size()
	{
		System.out.println(count);
		return count;
	}
	public void addfirst(Object ele)
	{
		Node node=new Node();
		node.ele=ele;
		node.next=null;
		node.next=head;
		head=node;
		count++;
	}
	public void add(int index,Object ele)
	{
		Node node=new Node();
		node.ele=ele;
		node.next=null;
		Node fresh=head;
		if(index==0)
		{
			addfirst(ele);
		}else {
		for(int i=0;i<index;i++)
		{
			fresh=fresh.next;
		}
		node.next=fresh.next;
		fresh.next=node;
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
		else {
			Node fresh=head;
			for(int i=1;i<index;i++)
			{
				fresh=fresh.next;
			}
			fresh.next=fresh.next.next;
			count--;
		}
	}
	public void show()
	{
		Node node=head;
		while(node.next!=null)
		{
			System.out.println(node.ele);
			node=node.next;
		}
		System.out.println(node.ele);
	}
}
