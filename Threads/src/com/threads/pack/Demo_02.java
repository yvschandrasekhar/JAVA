package com.threads.pack;
class T2 extends Thread
{
	public void run() {
		for(int i=0;i<=10;i++)
		{
			if(i==5)System.out.println(10/10);
			System.out.println(i+" T1 thread");
			try {
				Thread.sleep(500);
			}catch(InterruptedException e ) {
				e.printStackTrace();
			}
		}
	}
}
public class Demo_02 {

	public static void main(String[] args)throws InterruptedException {
		T2 t=new T2();
		t.start();
		for(int i=65;i<=75;i++)
		{
			System.out.println((char)i+" Thread");
			Thread.sleep(500);
			
		}
	}

}
