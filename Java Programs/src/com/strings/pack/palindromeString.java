package com.strings.pack;
public class palindromeString {
	public static boolean ispalin(String s)
	{
		char[] arr=s.toCharArray();
		int i=0; int j=arr.length-1;
		while(i<j)
		{
			if(arr[i]!=arr[j])return false;
			{
				i++;
				j--;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(ispalin("madam"));
	}

}
