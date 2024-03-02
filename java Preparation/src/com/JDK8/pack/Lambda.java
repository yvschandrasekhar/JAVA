package com.JDK8.pack;
interface abc{
	void show(int i);
}
//class yvs implements abc{
//	public void show(int i) {
//		System.out.println("we are indians");
//	}
//}
class Lambda{
	public static void main(String[] args) {
		abc a = (int i)-> 
				System.out.println("we are cicketers");
		a.show(10);
	}
}