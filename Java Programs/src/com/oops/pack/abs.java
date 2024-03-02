package com.oops.pack;
abstract class sports
{
	abstract void cricket();
	abstract void football();
}
class virat extends sports
{
	public void cricket()
	{
		System.out.println("virat Plays cricket");
	}
	public void football()
	{
		System.out.println("virat wont play football");
	}
}
class dhoni extends sports
{
	public void cricket()
	{
		System.out.println("Dhoni plays cricket");
	}
	public void football()
	{
		System.out.println("Dhoni knows to play football");
	}
}
public class abs {

	public static void main(String[] args) {
		sports s=new virat();
		s.cricket();
		s.football();
		sports s1=new dhoni();
		s1.cricket();
		s1.football();
	}

}
