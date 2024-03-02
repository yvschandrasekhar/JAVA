package com.threads.pack;
class T1 extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i+" T1 thread");
		}
	}
}
public class Demo_01 {

	public static void main(String[] args) {
		T1 t=new T1();
		t.start();
		for(int i=65;i<=75;i++)
		{
			System.out.println((char)i+" main thread");
		}
	}

}
