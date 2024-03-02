package com.Oops.java;
class studentt
{
	int age;
	String name;
	studentt(int a,String n)
	{
		this.age=a;
		this.name=n;
	}
	void display() {
		System.out.println("age="+age+", name="+name);
	}
}
public class This {

	public static void main(String[] args) {
		studentt s=new studentt(10,"tommy");
		s.display();
	}

}
