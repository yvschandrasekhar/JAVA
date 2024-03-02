package com.Oops.pack;
abstract class Cricket{
	abstract void bating();
	abstract void bowling();
	public static void player() {
		System.out.println("A player can bat and bowl");
	}
	Cricket(String name){
		System.out.println("JoeRoot belongs to "+name);
	}
}
class JoeRoot extends Cricket{
	void bating() {
		System.out.println("JoeRoot is a left-handed batsman");
	}
	void bowling() {
		System.out.println("JoeRoot is a spin bowler");
	}
	JoeRoot(int a){
		super("england");
	}
}
public class Abbstract {

	public static void main(String[] args) {
		Cricket c=new JoeRoot(10);
		Cricket.player();
		c.bating();
		c.bowling();
		System.out.println("--------------------------------------------------");
		//JoeRoot jr=(JoeRoot)c;
		JoeRoot jr=new JoeRoot(10);
		jr.bating();
		jr.bowling();
	}

}
