package com.innerclasses.pack;

public class Demo1 {
	private int a=50;
	class inner{
		public void m1() {
			System.out.println(a);   		}
	}
	public static void main(String[]args)
	{
		Demo1 d=new Demo1();
		Demo1.inner i=d.new inner();
		i.m1();
		/*Demo1.inner a=new Demo1().new inner();
		a.m1();*/
		/*new Demo1().new inner().m1();*/
	}
}
