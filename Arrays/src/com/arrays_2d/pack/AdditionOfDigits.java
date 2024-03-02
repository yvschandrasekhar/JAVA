package com.arrays_2d.pack;

public class AdditionOfDigits {

	public static void main(String[] args) {
		String s="Elephant1 is2 big3";
		char c[] = s.toCharArray();
		int sum=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='0' && c[i]<='9')
			{
				sum = sum+c[i]-'0';
			}
		}
		System.out.println(sum);
	}

}
