package com.StreamApi.pack;

import java.util.Arrays;
import java.util.List;

public class Filter_03 {

	public static void main(String[] args) {
		List<String>li=Arrays.asList("chandu","yvs","yvscs","bunty");
		li.stream().filter(i-> i.length()>3).forEach(i->System.out.println(i));
	}

}
