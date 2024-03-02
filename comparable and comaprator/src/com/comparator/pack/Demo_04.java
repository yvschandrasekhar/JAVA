package com.comparator.pack;

import java.util.Arrays;

class car implements Comparable
{
	int no;
	String brand;
	int Reg;
	static int num=100; 
	car(int n,String b)
	{
		no=n;
		brand=b;
		Reg=num++;
	}
	public String toString()
	{
		return "no="+no+" ,brand="+brand+" ,Reg="+Reg; 
	}
	public int compareTo(Object o)
	{
		car c=(car)o;
		return brand.compareTo(((car)o).brand) ;
	}
}
public class Demo_04 {

	public static void main(String[] args) {
		car[]c= {
				new car(11,"skoda"),
				new car(12,"shift"),
				new car(13,"ertiga"),
				new car(14,"creta"),
				new car(15,"bmw")
		        };
		Arrays.sort(c,new brand());
		for(car e:c)
		{
			System.out.println(e);
		}
	}

}
