package com.Oops.pack;
class Camera{
	public void photos(int a) {
		System.out.println("camera can take photos");
	}
	public void video(String n) {
		System.out.println("Camera can take videos");
	}
}
class Phone extends Camera{
	public void photos(int b) {
		System.out.println("phone can take photos");
	}
	public void video(String a) {
		System.out.println("phone can take videos");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		Phone p=new Phone();
		p.photos(10);
		p.video("java");
	}

}
