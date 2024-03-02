package com.jdk8.pack;

import java.util.function.Predicate;

public class Predicatee {

	public static void main(String[] args) {
		Predicate<Integer>pr=i->i>10;
		System.out.println(pr.test(5));
		Predicate<String>pr1=a->a.length()>10;
		System.out.println(pr1.test("chandu"));
		Predicate<Integer>pr2=n-> (n%2==0 && n>10);
		int[]a= {10,11,12,13,14,15,16};
		for(int c:a) {
			if(pr2.test(c)) {
				System.out.println(c);
			}
		}
	}

}
