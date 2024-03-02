package com.DataStructure.pack;
class Node
{
	Object ele;
	Node next;
	Node(Object e){
		ele=e;
	}
	Node(Object e , Node n){
		ele=e;
		next=n;
	}
}
public class LinkedList {
	Node head;
	int count;
	public void add(Object e) {
		if(head==null) {
			head=new Node(e);
			count++;
			return;
		}
		Node curr = head;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=new Node(e);
		count++;
	}
	public int size()
	{
		return count;
	}
	
}
