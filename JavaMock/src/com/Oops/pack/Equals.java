package com.Oops.pack;
class Rectangle{
	int length;
	int breadth;
	Rectangle(int l, int b){
		length=l;
		breadth=b;
	}
	public String toString() {
		return "length="+length+",breadth="+breadth;
	}
	public boolean equals(Object args) {
		if(args instanceof Rectangle)
		return this.length==((Rectangle)args).length && this.breadth==((Rectangle)args).breadth;
		else 
		return false;
	}
}
public class Equals {
	
	public static void main(String[] args) {
		Rectangle r=new Rectangle(10,20);
		Rectangle r1=new Rectangle(20,30);
		System.out.println(r.equals(r1));
	}

}
