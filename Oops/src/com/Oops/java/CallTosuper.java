package com.Oops.java;
class E
{
	E()
	{
		System.out.println("E is alphabet");
	}
}
class F extends E
{
	F(int i){
		super();
		System.out.println(i+"th alphabet is F");
	}
}
class G extends F
{
	G(){
		super(6);
		System.out.println("G is an alphabet");
	}
}
public class CallTosuper //used in inheritence concept
{

	public static void main(String[] args) {
		new G();
	}

}
