package com.comparator.pack;

import java.util.Arrays;

class emp implements Comparable
{
	String name;
	int id;
	double salary;
	public static int num=100; 
	emp(String n,double s)
	{
		name=n;
		salary=s;
		id=num++;
	}
	
	@Override
	public String toString() {
		return "name="+name+  ", salary="+salary;
	}
	@Override
	public int compareTo(Object o) {
		return name.compareTo(((emp)o).name);
	}
	
}
public class Demo_01 {

	public static void main(String[] args) {
		emp[]e= {new emp("Ronila",50000.50),
				 new emp("Dev",20000.0),
				 new emp("Krish",30000.8),
				 new emp("Roshan",15000.5),
				 new emp("Gill",10000.9)
	};
	Arrays.sort(e);
	//Arrays.sort(e,new Salcomparator());
	//Arrays.sort(e,new NameDesc());
	//Arrays.sort(e,new IdDesc());
	//Arrays.sort(e,new SalDesc());
	for(emp a:e)
	{
		System.out.println(a);
	}
  }
}
