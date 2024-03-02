package com.innerclasses.pack;

public class Outter {

	public static void main(String[] args) {
		class inner
		{
			public void m1()
			{
				System.out.println("chandu");
			}
		}
		inner i=new inner();
		i.m1();
	}

}
