package com.stringsnew.java;

public class MaxOccurancesOfchar {

	public static void main(String[] args) {
		String a="elleelee";
		char[]c=a.toCharArray();
		int max=0;
		if(c.length==1) {
			System.out.println(c[0]);
		}
		for(int i=1;i<c.length;i++)
		{
			int count=1;
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					count++;
				    c[j]=' ';
				}
			}
			if(count>max)
			{
				max=count;
				if(c[i]!=' ')
				System.out.print(count+""+c[i]+" ");
			}
		}
	}

}
