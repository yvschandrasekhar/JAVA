package com.innerclasses.pack;

public class Outerr {
	static class inner
	{
		public void m1()
		{
			System.out.println("chandu yvs");
		}
	}
	public static void main(String[] args)
	{
		Outerr.inner i =new inner();
		i.m1();
	}

}
