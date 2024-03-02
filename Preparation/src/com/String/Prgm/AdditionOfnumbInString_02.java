package com.String.Prgm;

public class AdditionOfnumbInString_02 {

	public static void main(String[] args) {
		String a="we10 are20 humans 40";
		char[]c=a.toCharArray();
		String num="";
		int sum=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='0' && c[i]<='9')
			{
				num=num+c[i];
			}
			else
			{
				if(num!="")
				{
					int n=Integer.parseInt(num);
					sum=sum+n;
					num="";
				}
			}
		}
		int n=Integer.parseInt(num);
		sum=sum+n;
		System.out.print(sum);
	}

}
