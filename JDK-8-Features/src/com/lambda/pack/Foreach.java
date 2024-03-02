package com.lambda.pack;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		List<Integer>values=Arrays.asList(1,2,3,4,5);
		values.forEach(a->System.out.println(a));
	}

}
