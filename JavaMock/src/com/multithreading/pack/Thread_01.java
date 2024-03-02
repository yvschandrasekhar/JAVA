package com.multithreading.pack;
class T1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"\t T1 thread");
		}
	}
}
public class Thread_01 {

	public static void main(String[] args) {
		T1 t1=new T1();
		t1.start();
		for(int j=1;j<=10;j++)
		{
			System.out.println(j+"\t T2 thread");
		}
	}

}
