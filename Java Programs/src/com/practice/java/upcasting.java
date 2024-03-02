package com.practice.java;
class games
{
	void indoor()
	{
		System.out.println("indoor games played at courts");
	}
	void outdoor()
	{
		System.out.println("outdoor Games played at grounds");
	}
}
class abc extends games
{
	void shuttle()
	{
		System.out.println("Shuttel is played at courts");
	}
	void cricket()
	{
		System.out.println("Cricket is palyed at Grounds");
	}
}
public class upcasting {
	public static void main(String[] args) {
		games g=new abc();
		g.indoor();
		g.outdoor();
	}

}
