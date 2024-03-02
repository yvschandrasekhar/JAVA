package com.String.Prgm;

public class AdditionOfdigits {

	public static void main(String[] args) {
		String s="My10 Name20 is30 chandu40";
		char[]c=s.toCharArray();
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
		System.out.println(sum);
	}

}
