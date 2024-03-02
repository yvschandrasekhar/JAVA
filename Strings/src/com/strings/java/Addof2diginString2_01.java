package com.strings.java;

public class Addof2diginString2_01 {

	public static void main(String[] args) {
		String a="my20 name30 i40s chan17du";
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
		System.out.println(sum);
	}

}
