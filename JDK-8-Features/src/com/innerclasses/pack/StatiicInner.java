package com.innerclasses.pack;

public class StatiicInner {
	static class A{
		int a=10;
		public void m1() {
			int a=20;
			System.out.println(a);
		}
	}
	public static void main(String[] args) {
		StatiicInner.A si=new StatiicInner. A();
		si.m1();
		System.out.println(si.a);
	}

}
