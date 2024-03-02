package com.Oops.java;
class cycle
{
	String Brand;
	int cost;
	cycle(String B,int c){
		Brand=B;
		cost=c;
	}
	cycle(cycle c){
		Brand=c.Brand;
		cost=c.cost;
	}
	void display() {
		System.out.println("Brand="+Brand+" ,cost"+cost);
	}
}
public class CopyConstructor {

	public static void main(String[] args) {
		cycle c=new cycle("Hero",5000);
		c.display();
		cycle c1=new cycle(c);
		c.display();
	}

}
