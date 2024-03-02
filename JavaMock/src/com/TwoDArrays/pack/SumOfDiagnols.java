package com.TwoDArrays.pack;

public class SumOfDiagnols {

	public static void main(String[] args) {
		int[][]a= {{1,2,3},
				   {1,2,3},
				   {1,2,3}};
		int sum=0;
		int len=a.length;
		for(int i=0;i<len;i++)
		{
			sum=sum+a[i][i];
			if(len%2!=0 && i==len/2)continue;
			sum=sum+a[i][len-1-i];
		}
		System.out.println(sum);
	}

}
