package com.JDK8.pack;

public class Regularinner {
	int a=50;
	class inner{
		public void m1() {
			System.out.println(a);
		}
	}
	public static void main(String[] args) {
		Regularinner.inner reg = new Regularinner().new inner();
		reg.m1();
	}

}
