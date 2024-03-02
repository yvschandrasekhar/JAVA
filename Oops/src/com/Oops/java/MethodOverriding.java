package com.Oops.java;
class cars
{
	void ac()
	{
		System.out.println("In Every car Ac is fixed");
	}
	void music()
	{
		System.out.println("In Every car music System is fixed");
	}
}
class skoda extends cars
{
	void ac()
	{
		System.out.println("Skoda Contains Best Ac");
	}
	void music()
	{
		System.out.println("Skoda contains Best Music System");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		skoda s=new skoda();
		s.ac();
		s.music();
	}

}
