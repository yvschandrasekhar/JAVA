package com.String.Prgm;

public class NoOfDigits {

	public static void main(String[] args) {
		String s="a1b3b45ff";
		int count=0;
		int sum=0;
		char[]c=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='0' && c[i]<='9')
			{
				count++;
				sum=sum+c[i]-'0';
			}
		}
		System.out.println(count);
		System.out.println(sum);
	}

}
