package com.oops.pack;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount");
		int amount = sc.nextInt();
		if(amount>=2000) {
			System.out.println("2000*"+amount/2000);
			amount=amount%2000;
		}
		if(amount>=1000) {
			System.out.println("1000*"+amount/1000);
			amount=amount%1000;
		}
		if(amount>=500) {
			System.out.println("500*"+amount/500);
		}
		sc.close();
	}

}
