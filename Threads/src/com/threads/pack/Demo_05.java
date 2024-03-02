package com.threads.pack;
class T21 extends Thread
{
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println("Thread-1");
		}

	}
}
class T22 extends Thread
{
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println("Thread-2");
		}
	}
}
public class Demo_05 {

	public static void main(String[] args)throws InterruptedException {
		T21 t1=new T21();
		T22 t2=new T22();
		t2.start();
		t1.start();
		t2.join();
		t1.join();
		for(int i=0;i<=3;i++)
		{
			System.out.println("main "+i);
		}
	}

}
