package com.lambda.pack;
interface I1{
	int add(int a,int b);
}
public class Lamda_01 {

	public static void main(String[] args) {
		I1 i=(a,b)->a+b;
		System.out.println(i.add(10, 20));
	}

}
