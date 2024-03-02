package com.stringsTest.java;

public class Numbers_in_String {

	public static void main(String[] args) {
		String s="3a2b1c";String s1=" ";
		
		char[]c=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			int n=0;
			if(c[i]>='0' && c[i]<='9')
			{
				n=c[i]-'0';
			}
			for(int j=0;i<n;i++)
			{
				s1=s1+c[i+1];
			}
//			while(n!=0)
//			{
//				s1=c[i+1]+" ";
//				n=n-1;
//			}
			System.out.print(s1);
		}
	}

}
