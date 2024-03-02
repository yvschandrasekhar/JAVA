package com.strings.pack;
import java.util.Scanner;
public class Palindrome2 {
	public static boolean ispalin(String a)
	{
		char[] c=a.toCharArray();
		int i=0;
		int j=a.length()-1;
		while(i<j)
		{
			if(c[i]!=c[j])return false;
			{
				i++;
				j--;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String");
		String X=s.next();
		if(ispalin(X))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
		s.close();
	}

}
