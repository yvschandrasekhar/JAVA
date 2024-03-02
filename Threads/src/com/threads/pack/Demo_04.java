  package com.threads.pack;
class T12 implements Runnable
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i+" Thread");
			try {  
				Thread.sleep(500);
			}catch(InterruptedException e) {
			}
		}
	}
}
public class Demo_04 {

	public static void main(String[] args)throws InterruptedException {
		T12 t=new T12();
		Thread t1=new Thread(t);
		t1.setPriority(5);
		System.out.println(t1.getPriority());
		System.out.println(t1.getName());
		t1.start();
		for(int j=65;j<=75;j++)
		{
			System.out.println((char)j+" Thread");
			Thread.sleep(500);
		}
	}

}
