package com.practice.java;
class country
{
	void india()
	{
		System.out.println("india is my country");
	}
	void America()
	{
		System.out.println("America is a country");
	}
}
class state extends country
{
	void andhra()
	{
		System.out.println("I belongs to andhra");
	}
	void karnataka()
	{
		System.out.println("Studying at karnataka");
	}
}
public class downcasting {
	public static void main(String[] args)
	{
		country c= new state();
		c.india();
		c.America();
		state s=(state)c;
		s.andhra();
		s.karnataka();
	}

}
