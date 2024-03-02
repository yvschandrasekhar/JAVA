package com.threads.pack;
class Thread1 extends Thread
{
	public synchronized void run()
	{
		for(int i=1;i<=3;i++) 
		{
			try{Thread.sleep(500);
			}catch(InterruptedException e) {
			}
			System.out.println("chandu "+i);
		}
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			try{Thread.sleep(500);
			}catch(InterruptedException e) {
			}
			System.out.println("yvs "+i);
		}
	}
}
public class Demo_06 {

	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		t1.start();
		t2.start();
	}

}
