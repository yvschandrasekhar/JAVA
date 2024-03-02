package com.innerclasses.pack;

import java.util.function.Predicate;

public class Predicateinterface {

	public static void main(String[] args) {
		Predicate<Integer> pr = i->(i>10);
		System.out.println(pr.test(11));
		Predicate<String> pr1 = s->s.length()>10;
		System.out.println(pr1.test("chandu"));
		Predicate<Integer> pr2 = i->(i%2==0 && i>10);
		int[]arr= {1,2,3,4,5,6,7,8,9,10};
		for(int n : arr) {
			if(pr2.test(n)) {
				System.out.println(n);
			}
		}
	}

}
