package com.String.Prgm;

public class AdditionOfnumbInString {

	public static void main(String[] args) {
		String a="we3 are5 indians9";
		char[]c=a.toCharArray();
		int sum=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='0' && c[i]<='9')
			{
				sum=sum+c[i]-'0';
			}
		}
		System.out.println(sum);
	}

}
