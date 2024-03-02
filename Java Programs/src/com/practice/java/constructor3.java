package com.practice.java;
class car
{
	int regnum;
	String color;
	static int n=1000;
	{
		regnum=n++;
	}
	car()
	{
		color="white";
	}
	car (String c)
	{
		color=c;
	}
}
public class constructor3 {

	public static void main(String[] args) {
		car c=new car();
		System.out.println(c.regnum+" "+c.color);
		car c1=new car("blue");
		System.out.println(c1.regnum+" "+c1.color);
	}

}
