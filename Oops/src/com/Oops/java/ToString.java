package com.Oops.java;
class hero
{
	String name;
	int age;
	hero(String n,int a){
		this.name=n;
		this.age=a;
	}
	@Override
	public String toString() {
		return "name="+name+", age="+age;
	}
}
public class ToString {

	public static void main(String[] args) {
		hero h=new hero("chandu",20);
		System.out.println(h);
	}

}
