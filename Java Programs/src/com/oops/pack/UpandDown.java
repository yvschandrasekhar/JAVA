package com.oops.pack;
class Animals
{
	void dog()
	{
		System.out.println("dog is an animal");
	}
	void rabbit()
	{
		System.out.println("rabbit is an animal");
	}
}
class pets extends Animals
{
	void bark()
	{
		System.out.println("Dogs will bark");
	}
	void sound()
	{
		System.out.println("Rabitt Makes sound");
	}
}
public class UpandDown {

	public static void main(String[] args) {
		Animals a=new pets();
		a.dog();
		a.rabbit();
		pets p=(pets)a;
		p.bark();
		p.sound();
	}

}
