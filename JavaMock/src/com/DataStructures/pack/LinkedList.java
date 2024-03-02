package com.DataStructures.pack;
class Node{
	Object ele;
	Node next;
	Node(Object e){
		ele=e;
	}
	Node(Object e,Node n){
		ele=e;
		next=n;
	}
}
public class LinkedList {
	Node head=null;
	int count=0;
	public void add(Object e) {
		if(head==null) {
			head=new Node(e);
			count++;
			return;
		}
		Node curr=head;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=new Node(e);
		count++;
	}
	public int size() {
		return count;
	}
	public Object get(int index) {
		if(index<=-1||index>=size()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		Node curr=head;
		for(int i=1;i<=index;i++){
			curr=curr.next;
		}
		return curr.ele;
	}
	public void add(int index,Object e) {
		if(index<=-1||index>=size()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		if(index==0)
		{
			head=new Node(e,head.next);
			count++;
			return;
		}
		Node curr=head;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		curr.next=new Node(e,curr.next);
	}
	public void remove(int index)
	{
		if(index<=-1||index>=size()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		if(index==0)
		{
			head=head.next;
			count--;
			return;
		}
		Node curr=head;
		for(int i=1;i<index;i++)
		{
			curr=curr.next;
		}
		curr.next=curr.next.next;
		count--;
	}
	public void reverse() {
		Node curr=head;
		Node prev=null;
		Node next=null;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;
	}
}
