package com.DataStructures.pack;

public class QueueTest {

	public static void main(String[] args) {
		Queue q=new Queue();
		q.enqueue("doreamon");
		q.enqueue("Nobitha");
		q.enqueue("suneo");
		q.enqueue("Geon");
		q.enqueue("Suzika");
		for(int i=0;i<q.size();i++) {
			String s=(String)q.get(i);
			System.out.println(s);
		}
		System.out.println("-----------------");
		System.out.println(q.size());
		System.out.println(q.deque());
	}

}
