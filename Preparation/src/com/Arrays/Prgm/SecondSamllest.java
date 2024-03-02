package com.Arrays.Prgm;

public class SecondSamllest {

	public static void main(String[] args) {
		int[]a= {5,7,3,4,9};
		int s1=a[0];
		int s2=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==s1)continue;
			if(a[i]<s1)
			{
				s2=s1;
				s1=a[i];
			}
			else if(s1==s2||a[i]<s2)
			{
				s2=a[i];
			}
		}
		System.out.println(s2);
	}

}
