package com.innerclasses.pack;
class WhatsApp
{
	public void read()
	{
		System.out.println("Single Tick");
	}
}
public class Driver {

	public static void main(String[] args) {
		WhatsApp w1=new WhatsApp();
		w1.read();
		WhatsApp w2=new WhatsApp() {
			public void read() {
				System.out.println("Double Tick");
			}
		};
		w2.read();
		WhatsApp w3=new WhatsApp() {
			public void read() {
				System.out.println("Message seen");
			}
		};
		w3.read();
	}

}
