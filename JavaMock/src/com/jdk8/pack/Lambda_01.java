package com.jdk8.pack;
interface A
{
	void show();
}
public class Lambda_01 {

	public static void main(String[] args) {
		A a=()->{
			System.out.println("HelloWorld");
		};
		a.show();
	}

}
