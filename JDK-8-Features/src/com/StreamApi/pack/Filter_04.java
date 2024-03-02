package com.StreamApi.pack;

import java.util.Arrays;
import java.util.List;

public class Filter_04 {

	public static void main(String[] args) {
		List<String>li=Arrays.asList("tyson","snoopy","maxy","tommy","micky");
		li.stream().filter(i-> i!=null).forEach(i->System.out.println(i));
	}

}
