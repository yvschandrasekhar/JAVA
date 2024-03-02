package com.strings.pack;

public class SubStringPalin {
	public static boolean ispalin(String a,int start,int end)
	{
		char[]c=a.toCharArray();
		int i=start;
		int j=end;
		while(i<j)
		{
			if(c[i]!=c[j])return false;
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		String s="malayalam";
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(ispalin(s,i,j))
				System.out.println(s.substring(i, j+1));
			}
		}
	}

}
