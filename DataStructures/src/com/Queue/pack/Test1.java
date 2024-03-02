package com.Queue.pack;

public class Test1 {

	public static void main(String[] args) {
	Queue q=new Queue();
		q.enQue(10);
		q.enQue(20);
		q.enQue(30);
		q.enQue(40);
		q.enQue(50);
		//q.deQue();
		//q.deQue();
	
		q.enQue(60);
		//q.enQue(70);
		//q.enQue(80);
		q.Show();
		q.size();
		System.out.println(q.isempty());
		System.out.println(q.isfull());
		
	}

}
