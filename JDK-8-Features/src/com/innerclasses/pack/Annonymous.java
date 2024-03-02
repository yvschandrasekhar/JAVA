package com.innerclasses.pack;

public class Annonymous {
	int age;
	public void study() {
		System.out.println("My name is chandu");
		System.out.println(age+" is my age");
	}
	public static void main(String[] args) {
		Annonymous an=new Annonymous();
		an.age=21;
		an.study();
		Annonymous an1=new Annonymous() {
			public void study() {
				System.out.println("Trained as a java developer");
			}
		};
		an1.study();
	}
	

}
