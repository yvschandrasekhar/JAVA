package com.practice.java;
interface cricket
{
	void play();
	void notplay();
}
class virat implements cricket
{
	public void play()
	{
		System.out.println("Virat plays Cricket everday");
	}
	public void notplay()
	{
		System.out.println("Virat is not playing cricket");
	}
}
class dhoni implements cricket
{
	public void play()
	{
		System.out.println("Dhoni plays cricket everyday");
	}
	public void notplay()
	{
		System.out.println("Dhoni is not playing cricket");
	}
}
public class interface1 {
	public static void main(String[] args) {
		cricket c=new virat();
		c.play();
		c.notplay();
		cricket c1=new dhoni();
		c1.play();
		c1.notplay();
	}

}
