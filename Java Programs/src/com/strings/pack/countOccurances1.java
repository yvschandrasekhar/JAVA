package com.strings.pack;

public class countOccurances1 {

	public static void main(String[] args) {
		String s5="chandu";
		while(s5.length()>0)
		{
			char c=s5.charAt(0);
			String s4=s5.replace(c+" ","");
			int count=s5.length()-s4.length();
			System.out.println("count="+ count);
			s5=s4;
		}
	}

}
