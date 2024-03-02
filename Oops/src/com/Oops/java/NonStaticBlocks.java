package com.Oops.java;

public class NonStaticBlocks {
	NonStaticBlocks(int i)
	{
		System.out.println(i);
	}
	{
		System.out.println("We are Human Creatures");
	}
	{
		System.out.println("We can do anything");
	}
	public static void main(String[] args) {
		NonStaticBlocks n=new NonStaticBlocks(10);
	}
	static
	{
		System.out.println("Wonderful Creature");
	}
	static 
	{
		System.out.println("Humans eat food");
	}

}
