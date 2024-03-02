package com.globussoft.pack;

import java.util.Scanner;

public class Cool1 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter values:");
	        while (true) {
	            long a = sc.nextLong();
	            long b = sc.nextLong();
	            if (a == 0 && b == 0) {
	                break; 
	            }
	            int coolCount = countCoolNumbers(a, b);
	            System.out.println(coolCount);
	        }
	        sc.close();
	    }

	    public static int countCoolNumbers(long a, long b) {
	        int Count = 0;
	        for (long num = a; num <= b; num++) {
	            if (isCool(num)) {
	                Count++;
	            }
	            
	        }
	        return Count;
	    }

	    public static boolean isCool(long num) {
	        String Str = String.valueOf(num);
	        int len = Str.length();
	        for (int i = 1; i < len; i++) {
	            long x = Long.parseLong(Str.substring(0, i));
	            long y = Long.parseLong(Str.substring(i));
	            if (sumDigits(x) == sumDigits(y)) {
	                return true;
	            }
	        }
	        return false;
	    }

	    	public static long sumDigits(long num) {
	        long sum = 0;
	        while (num > 0) {
	            sum =sum+ num % 10;
	            num =num/ 10;
	        }
	        return sum;
	    }
	}

