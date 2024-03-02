package com.String.Prgm;

public class Remove_Duplicates_in_sentence {

	public static void main(String[] args) {
		String a="we are won and won learning";
		String[]b=a.split(" ");
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]==b[j])
				{
					b[j]="";
				}
			}
			if(b[i]!=" ")
			{
				System.out.println(b[i]);
			} 
		}
	}

}
