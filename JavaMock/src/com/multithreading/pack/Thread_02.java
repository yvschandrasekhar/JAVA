package com.multithreading.pack;
class T3 implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i+"\t chandu");
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
}
public class Thread_02 {

	public static void main(String[] args)throws InterruptedException {
		T3 t=new T3();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		t1.start();
		t2.start(); 
		for(int j=1;j<=5;j++)
		{
			System.out.println(j+"\t bunty");
			Thread.sleep(500);
		}
	}

}
