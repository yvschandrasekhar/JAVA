package com.TwoDArrays.pack;

public class MulAddSub {
		public static int[][] MullAddSub (int[][]a,int[][]b)
		{
			int len=a.length;
			int[][]c=new int[len][len];
			for(int i=0;i<len;i++)
			{
				for(int j=0;j<len;j++)
				{
					int value=0;
					for(int k=0;k<len;k++)
					{
						value=value+a[i][k]*b[k][j];
						//value=value+a[i][k]+b[k][j];
						//value=value+a[i][k]-b[k][j];
					}
					c[i][j]=value;
				}
			}
			return c;
		}
		public static void main(String[] args) {
			int[][]a= {{1,2,3},{1,2,3},{1,2,3}};
			int[][]b= {{1,2,3},{1,2,3},{1,2,3}};
			int[][]c= MullAddSub(a,b);
			for(int[]t:c)
			{
				for(int e:t)
				{
					System.out.print(e+"\t");
				}
				System.out.println();
			}
			
		}
	}


