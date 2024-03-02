package com.jdk8.pack;
interface B
{
	int add(int a,int b);
}
public class Lambda_02 {

	public static void main(String[] args) {
		B c=(int a,int b)->{
			return a+b;
		};
		System.out.println(c.add(10, 20));
	}

}
