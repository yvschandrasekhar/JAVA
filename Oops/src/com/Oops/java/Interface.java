package com.Oops.java;
interface Switch
{
	void on();
	void off();
}
class LedBulb implements Switch
{
	public void on() {
		System.out.println("LedBuld is switched on");
	}
	public void off() {
		System.out.println("LedBulb is switched off");
	}
}
class LcdBulb implements Switch
{

	public void on() {
		System.out.println("LcdBulb is switched on");		
	}
	public void off() {
		System.out.println("LcdBulb is switched off");	
	}
	
}
public class Interface {

	public static void main(String[] args) {
		Switch s=new LedBulb();
		s.on();
		s.off();
		Switch s1=new LcdBulb();
		s1.on();
		s1.off();
	}

}
