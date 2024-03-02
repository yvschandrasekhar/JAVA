package com.numprgms.pack;
import java.util.Scanner;		
public class hcf {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Number");
		int a=s.nextInt();
		int b=s.nextInt();
		int hcf=1;
		for(int i=1;i<=a && i<=b;i++)
		{
			if(i%a==0 && i%b==0)break;
				hcf=i;
		}
		System.out.println(hcf);
		s.close();
	}

}
