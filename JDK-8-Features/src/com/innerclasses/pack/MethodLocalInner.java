package com.innerclasses.pack;

public class MethodLocalInner {
	public void m1() {
		class chandu{
			public void m2(int a , int b) {
				System.out.println("we are java students..");
				System.out.println(a+b);
			}
		}
		chandu c=new chandu();
		c.m2(10,20);
		c.m2(30, 40);
	}
	public static void main(String[] args) {
		MethodLocalInner ml=new MethodLocalInner();
		ml.m1();
	}

}
