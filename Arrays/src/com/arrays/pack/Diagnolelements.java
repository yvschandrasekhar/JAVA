package com.arrays.pack;

public class Diagnolelements {

	public static void main(String[] args) {
		int[][]a= {{2,4,6},{8,10,12},{14,16,18}};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i][i];
			if(a.length%2!=0 && i==a.length/2)continue;
			sum=sum+a[i][a.length-1-i];
		}
		System.out.println(sum);
	}
}
