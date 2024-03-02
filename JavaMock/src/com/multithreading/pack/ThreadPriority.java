package com.multithreading.pack;
class T4 implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"\t chandu");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadPriority {

	public static void main(String[] args)throws InterruptedException {
		T4 t=new T4();
		Thread t1=new Thread(t);
		//Thread t2=new Thread(t);
		t1.setPriority(6);
		System.out.println(t1.getPriority());
		System.out.println(t1.getName());
		t1.start();
		for(int j=1;j<=10;j++)
		{
			System.out.println(j+"\t yvscs");
			Thread.sleep(500);
		}
	}

}
