package com.lambda.pack;
interface C{
	void add(int i ,int j);
}
public class Lambda_07 {

	public static void main(String[] args) {
		C c=(i,j)->System.out.println(i+j);
		c.add(10, 20);
	}

}
