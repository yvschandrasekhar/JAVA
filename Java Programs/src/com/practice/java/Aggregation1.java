package com.practice.java;
class father
{
	int age;
	father(int age)
	{
		this.age=age;
	}
	void work()
	{
		System.out.println(age+" aged father is working.");
	}
}
class family
{
	father fa;
	family(father fa)
	{
		this.fa=fa;
	}
	void happy()
	{
		fa.work();
		System.out.println("He looks his family very happily.");
	}
}
public class Aggregation1 {
	public static void main(String[] args) {
		family fam=new family(new father(20));
		fam.happy();
	}

}
