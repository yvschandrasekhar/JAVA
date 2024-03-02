package com.practice.java;
class Sports
{
	void cricket()
	{
		System.out.println("Cricket is sport");
	}
}
class play extends Sports
{
	void plays()
	{
		System.out.println("Chandu Plays Cricket");
	}
}
public class inheritance1 {
	public static void main(String[] args)
	{
		play p=new play();
		p.cricket();
		p.plays();
	}

}
