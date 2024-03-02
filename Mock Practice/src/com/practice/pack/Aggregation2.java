package com.practice.pack;
class dhoni
{
	String name;
	dhoni(String name)
	{
		this.name=name;
	}
	void play()
	{
		System.out.println(name+" plays cricket");
	}
}
class cricket
{
	dhoni d;
	cricket(dhoni d)
	{
		this.d=d;
	}
	void played()
	{
		d.play();
		System.out.println("He played for india.");
	}
}
public class Aggregation2 {

	public static void main(String[] args) {
		cricket c=new cricket(new dhoni("Mahi"));
		c.played();
	}

}
