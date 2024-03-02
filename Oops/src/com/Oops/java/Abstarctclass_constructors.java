package com.Oops.java;
abstract class H{
	H(){
		System.out.println("Java Developer");
	}
}
class I extends H{
	I(int i){
		super();
		System.out.println("java is "+i+"st language");
	}
}
public class Abstarctclass_constructors {

	public static void main(String[] args) {
		new I(1);
	}

}
