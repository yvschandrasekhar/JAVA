package com.multithreading.pack;
class T5 extends Thread
{
	public void run()
	{
		for(int i=65;i<=75;i++)
		{
			System.out.println((char)i+"\t dudu");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Synchronization {

	public static synchronized void main(String[] args)throws InterruptedException {
		T5 t=new T5();
		t.start();
		for(int j=1;j<=5;j++)
		{
			System.out.println(j+"\t Bubbu");
			Thread.sleep(500);
		}
	}

}
