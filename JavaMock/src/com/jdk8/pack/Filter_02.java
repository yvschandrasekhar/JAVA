package com.jdk8.pack;
import java.util.Arrays;
import java.util.List;

public class Filter_02 {

	public static void main(String[] args) {
		List<String>li=Arrays.asList("chandu","yvs","yvscs");
		li.stream().filter(s-> s.length()>3).forEach(s->System.out.println(s));
	}

}
