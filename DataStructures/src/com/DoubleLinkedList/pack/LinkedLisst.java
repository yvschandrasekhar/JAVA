package com.DoubleLinkedList.pack;

public class LinkedLisst
{
	Node head;
	int count=0;
	public void add(Object ele)
	{
		Node node=new Node(ele);
		node.ele=ele;
		node.next=null;
		if(head==null)
		{
			head=node;
			count++;
		}
		else
		{
			Node curr=head;
			while(curr.next!=null)
			{
				curr=curr.next;
			}
			curr.next=node;
			count++;
		}
	}
	public void size()
	{
		System.out.println(count);
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
	public void add(int index,Object ele)
	{
		Node node=new Node(ele);
		node.ele=ele;
		node.next=null;
		
		if(index==0)
		{
			node.next=head;
			node.prev=null;
			head=node;
			count++;
		}
		else
		{
			Node curr=head;
			for(int i=1;i<index;i++)
			{
				curr=curr.next;
			}
			node.next=curr.next;
			node.prev=curr;
			curr.next=node;
			count++;
		}
	}
	public void remove(int index)
	{
		Node curr=head;
		if(index==0)
		{
			head=curr.next;
			curr.prev=null;
			count--;
		}
		else
		{
			for(int i=1;i<index;i++)
			{
				curr=curr.next;
			}
			curr.next=curr.next.next;
			curr.next.prev=curr;
			count--;
		}
	}
}
