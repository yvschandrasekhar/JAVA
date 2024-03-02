package com.oops.pack;
class player
{
	private String name;
	private int age;
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public int getage()
	{
		return age;
	}
	public void setage(int age)
	{
		this.age=age;
	}
	player(String n,int a)
	{
		this.name=n;
		this.age=a;
	}
}
public class Encaps {

	public static void main(String[] args) {
		player p=new player("Dhoni",40);
		System.out.println(p.getname());
		System.out.println(p.getage());
		p.setage(42);
		System.out.println(p.getname());
		System.out.println(p.getage());
	}

}
