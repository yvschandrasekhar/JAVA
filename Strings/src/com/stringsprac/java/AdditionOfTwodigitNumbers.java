package com.stringsprac.java;

public class AdditionOfTwodigitNumbers {

	public static void main(String[] args) {
		String a="My10 name20 is30 chandu40";
		String num="";
		int sum=0;
		char[] b=a.toCharArray();
		for(int i=0;i<b.length;i++)
		{
			if(b[i]>='0' && b[i]<='9')
			{
				num=num+b[i];
			}
			else {
				if(num!="")
				{
					int n=Integer.parseInt(num);
					sum=sum+n;
					num="";
				}
			}
		}
		System.out.println(sum);
	}

}
