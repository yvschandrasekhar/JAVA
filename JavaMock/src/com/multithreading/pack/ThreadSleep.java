package com.multithreading.pack;
class T2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i+"\t i thread");
			try {
			Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadSleep {

	public static void main(String[] args) {
		T2 t=new T2();
		t.start();
		for(int j=1;j<=5;j++)
		{
			System.out.println(j+"\t j thread");
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
