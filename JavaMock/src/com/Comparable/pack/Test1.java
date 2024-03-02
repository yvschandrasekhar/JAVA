package com.Comparable.pack;

import java.util.Arrays;

class Car implements Comparable<Object>
{
	String Brand;
	int id;
	double prize;
	static int num=1;
	Car(String B,int i,double p)
	{
		Brand=B;
		id=i;
		prize=p;
		num=num++;
	}
	public int compareTo(Object o) {
		//return Brand.compareTo(((Car)o).Brand);
		//  return id-(((Car)o).id);
		return (int) (prize-(((Car)o).prize));
	}
	public String toString()
	{
		return "Brand="+Brand+",id="+id+",prize="+prize+",num="+num;
	}
}
public class Test1 {

	public static void main(String[] args) {
		Car[]c= {new Car("Skoda",111,2500000),
				 new Car("Audi",117,50000000),
				 new Car("Creta",200,2500000),
				 new Car("bmw",121,8000000),
				 new Car("Lamborghini",112,10000000)
		};
		Arrays.sort(c);
		for(Car e:c) {
			System.out.println(e);
		}
	}

}
