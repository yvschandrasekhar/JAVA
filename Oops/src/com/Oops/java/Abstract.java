package com.Oops.java;
abstract class carr
{
	public abstract void drive();
	public abstract void fly();
	public void playmusic() {
		System.out.println("We can play music in cars");
	}
}
abstract class wagnor extends carr
{
	public void drive() {
		System.out.println("I am driving a car");
	}
}
class updatedwagnor extends wagnor //concrete classes.
{
	@Override
	public void fly() {
		System.out.println("Cars cannot fly");		
	}
	
}
public class Abstract {

	public static void main(String[] args) {
		carr c=new updatedwagnor();
		c.drive();
		c.fly();
		c.playmusic();
	}

}
