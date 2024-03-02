package com.StreamApi.pack;

import java.util.Arrays;
import java.util.List;

public class Filter_02 {

	public static void main(String[] args) {
		List<Integer>al=Arrays.asList(10,11,27,3,15,18,20);
		al.stream().filter(i->i%2!=0 && i>10).forEach(i->System.out.println(i));
	}

}
