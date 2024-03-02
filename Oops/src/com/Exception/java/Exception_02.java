package com.Exception.java;

public class Exception_02 {

	public static void main(String[] args) {
		String s=null;
		try {
		System.out.println(s.toString());
		}catch(NullPointerException e) {
			String s1="chandu";
			System.out.println(s1.toString());
			System.out.println(s1.length());
		}
	}

}
