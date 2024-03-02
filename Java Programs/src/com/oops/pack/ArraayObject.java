package com.oops.pack;

import java.util.Arrays;

interface Animal
{
	void makesound();
}
class dog implements Animal
{
	public void makesound()
	{
		System.out.println("Bow Bow");
	}
	@Override
	public String toString()
	{
		return "i am a dog";
	}
}
class cat implements Animal
{
	public void makesound()
	{
		System.out.println("meow meow");
	}
	@Override
	public String toString()
	{
		return "i am a cat";
	}
}
public class ArraayObject {

	public static void main(String[] args) {
		Animal[]arr=new Animal[4];
		arr[0]=new dog();
		arr[1]=new cat();
		arr[2]=new dog();
		arr[3]=new cat();
		for(Animal a:arr)
		{
			System.out.println(a);
			
		}
	}

}
