package com.stringsTest.java;

public class Numbersin_string {

	public static void main(String[] args) {
		String s="a7b2cd5k9mn41";
		char[]c=s.toCharArray();
		String a=" ";String b=" ";String d=" ";
		char[]e=null;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='0' && c[i]<='9')
			{
				a=a+c[i];
			}else {
				b=b+c[i];
			}
		}
		e=a.toCharArray();
		for(int i=0;i<e.length-1;i++)
		{
			for(int j=0;j<e.length-1;j++)
			{
				if(e[j]>e[j+1]) {
					char temp=e[j];
					e[j]=e[j+1];
					e[j+1]=temp;
				}
			}
		}
		d=b+new String(e);
		System.out.println(d);
	}

}
