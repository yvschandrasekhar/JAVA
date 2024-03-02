package com.oops.pack;

import java.util.Arrays;
class Round implements Comparable
{
    int radius;
	Round(int r)
	{
		this.radius=r;
	}
	@Override
	public int compareTo(Object o)
	{
		return this.radius-((Round)o).radius;
	}
	
	@Override
	public String toString()
	{
		return "radius"+"="+radius;
	}
	
	
}
public class ComparetoObject {

	public static void main(String[] args) {
		Round[]arr= {
						new Round(40),
						new Round(30),
						new Round(20),
						new Round(10),
						new Round(60),
					};
		Arrays.sort(arr);
		for(Round c:arr)
		{
			System.out.println(c);
		}
	}

}
