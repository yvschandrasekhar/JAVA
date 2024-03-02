package com.practice.java;
class AA
{
	static
	{
		System.out.println("chandu is a student");
	}
	static 
	{
		System.out.println("chandu is a cricketer");
	}
	AA()
	{
		System.out.println("He is full stack developer");
	}
	AA(int i)
	{
		System.out.println("He is JavaDeveloper");
	}
	{
		System.out.println("Chandu is staying at Banglore");
	}
	{
		System.out.println("Chandu is graduated");
	}
}
public class NonstaticBlocks1 {

	public static void main(String[] args) {
		AA a1=new AA();
		AA a2=new AA(100);
	}
}
