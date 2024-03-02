package com.oops.pack;
class A1
{
	int i;
	void m1(int i)
	{
		this.i=i;
		System.out.println(i);
	}
}
public class thiskeyword {
	public static void main(String[] args) {
		A1 a=new A1();
		a.m1(10);
	}

}
