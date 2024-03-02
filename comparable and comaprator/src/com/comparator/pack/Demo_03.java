package com.comparator.pack;

import java.util.Arrays;

class Bikes
{
	String Brand;
	String color;
	int regNo;
	static int num=100;
	Bikes(String B,String c)
	{
		Brand=B;
		color=c;
		regNo=num++;
	}
	@Override
	public String toString() {
		return "Brand="+Brand+" ,          color="+color+" ,          regNo="+regNo;
	}
}
public class Demo_03 {

	public static void main(String[] args) {
		Bikes[]arr= { new Bikes("RoyalEnfield","Black"),
					new Bikes("pulsar","Blue"),
					new Bikes("FZ","Grey"),
					new Bikes("Glamour","Green"),
					new Bikes("R15","Red"),};
		Arrays.sort(arr,new BrandComparator());
		for(Bikes b:arr ) {
			System.out.println(b);
		}
	}

}
