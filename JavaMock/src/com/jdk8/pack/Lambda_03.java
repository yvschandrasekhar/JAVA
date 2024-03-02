package com.jdk8.pack;
interface Animal
{
	void run();
}
class Dog implements Animal
{
	public void run()
	{
		System.out.println("Dog is running");
	}
}
public class Lambda_03 {

	public static void main(String[] args) {
		Animal a=()->{
			System.out.println("yes Dog is running");
		};
		a.run();
	}

}
