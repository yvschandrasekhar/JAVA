package com.Queue.pack;

public class Test2 {

	public static void main(String[] args) {
		Queuee qu=new Queuee();
		qu.enQuee(10);
		qu.enQuee(20);
		qu.enQuee(30);
		qu.enQuee(40);
		qu.enQuee(50);
		qu.deQueue();
		qu.deQueue();
		qu.deQueue();
		qu.deQueue();
		qu.enQuee(40);
		qu.enQuee(30);
		qu.show();
	}

}
