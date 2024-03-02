package com.jdk8.pack;

import java.util.Arrays;
import java.util.List;

public class Map_01 {

	public static void main(String[] args) {
		List <Integer>li=Arrays.asList(1,2,3,4,5);
		li.stream().map(i->i*3).forEach(i->System.out.println(i));
	}

}
