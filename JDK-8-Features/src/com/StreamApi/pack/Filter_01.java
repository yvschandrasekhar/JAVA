package com.StreamApi.pack;

import java.util.ArrayList;

public class Filter_01 {

	public static void main(String[] args) {
		ArrayList<Integer>a=new ArrayList<Integer>();
		a.add(1);
		a.add(10);
		a.add(15);
		a.add(30);
		a.add(35);
		a.stream().filter(i->i%2==0 && i>=10).forEach(i->System.out.println(i));
	}

}
