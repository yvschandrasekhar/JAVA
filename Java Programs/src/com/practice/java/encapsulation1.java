package com.practice.java;
class J
{
	private int i;
	public int geti()
	{
		return i;
	}
	public void seti(int i)
	{
		this.i=i;
	}
}
public class encapsulation1 {

	public static void main(String[] args) {
		J j=new J();
		System.out.println(j.geti());
		j.seti(15);
		System.out.println(j.geti());
	}

}
