package com.comparator.pack;

import java.util.Arrays;

class cars implements Comparable
{
	String color;
	String Brand;
	int price;
	int RegNo;
	static int num=100;
	cars(String c,String B,int p)
	{
		color =c;
		Brand=B;
		price=p;
		RegNo=num++;
	}
	@Override
	public String toString() {
		return "colour="+color+" ,Brand="+Brand+" ,price="+price+" ,RegNo="+RegNo;
	}
	public int compareTo(Object o) {
		//return color.compareTo(((cars)o).color);
		cars c=(cars)o;
		//return price-c.price;
		return RegNo-c.RegNo;
	}
	
}
public class Demo_02 {

	public static void main(String[] args)
	{
		cars[]arr= {new cars("red","skoda",12000),
					new cars("Blue","Kia",15000),
					new cars("Black","Audi",18000),
					new cars("Cement","Benz",20000),
					new cars("White","Ertiga",14000)};
		Arrays.sort(arr);
	for(cars c:arr)
	{
		System.out.println(c);
	}
  }
}
