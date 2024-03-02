
package com.threads.pack;
class T11 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"T1 Thread");
			try {
				Thread.sleep(500);
			}catch(InterruptedException e){
			}
		}
	}
}
public class Demo_03 {

	public static void main(String[] args)throws InterruptedException{
		T11 t=new T11();
		t.start();
		for(int j=65;j<=75;j++)
		{
			System.out.println((char)j+"main thread");
			Thread.sleep(500);
		}
	}

}
