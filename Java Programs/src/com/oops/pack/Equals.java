package com.oops.pack;
class circ
{
	int radius;
	circ(int r)
	{
		this.radius=r;
	}
	@Override
	public boolean equals(Object obj)
	{
		circ c=(circ)obj;
		return this.radius==((circ)obj).radius;
	}
}
public class Equals {

	public static void main(String[] args) {
		circ c1=new circ(10);
		circ c2=new circ(10);
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.toString());
	}

}
