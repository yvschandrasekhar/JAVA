package com.TwoDArrays.pack;

public class Spiral {
	public static int[][] spiral(int size){
		int[][]a=new int[size][size];
		int c=-1;int r=0;
		char d='r';
		for(int i=1;i<=size*size;i++) {
			switch(d) {
			case 'r': c++;
			 		  a[r][c]=i;
			 		  if(c==size-1||a[r][c+1]!=0)d='d';
			 		  break;
			case 'd': r++;
					  a[r][c]=i;
					  if(r==size-1||a[r+1][c]!=0)d='l';
					  break;
			case 'l': c--;
				      a[r][c]=i;
				      if(c==0||a[r][c-1]!=0)d='u';
				      break;
			case 'u': r--;
					  a[r][c]=i;
					  if(a[r-1][c]!=0)d='r';
					  break;
			}
		}
		return a;
	}
	public static void main(String[] args) {
		int[][]a=spiral(5);
		for(int[]t:a) {
			for(int n:t) {
				System.out.print(n+"\t");
			}
			System.out.println();
		}
	}

}
