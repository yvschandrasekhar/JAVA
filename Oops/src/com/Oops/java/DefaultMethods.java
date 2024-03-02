package com.Oops.java;
interface fan
{
	void standfan();
	default void ceilingfan() {
		System.out.println("ceiling fan is rotating");
	}
}
class room implements fan
{

	@Override
	public void standfan() {
		System.out.println("Stand fan is rotating");	
	}
	
}
public class DefaultMethods {

	public static void main(String[] args) {
		fan f=new room();
		f.ceilingfan();
		f.standfan();
	}

}
