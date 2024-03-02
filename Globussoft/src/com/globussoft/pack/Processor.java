package com.globussoft.pack;
import java.util.Scanner;
public class Processor {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (true) {
			int N = scn.nextInt();
	         if (N == -1) {
	             break;
	          }
	         int[] jobs = new int[N];
	         int totalJobs = 0;
	         for (int i = 0; i < N; i++) {
	              jobs[i] = scn.nextInt();
	              totalJobs =totalJobs+jobs[i];
	            }
	         if (totalJobs % N != 0) {
	                System.out.println(-1);
	            } else {
	                int targetJobs = totalJobs / N;
	                int rounds = 0;
	                for (int i = 0; i < N; i++) {
	                    int sub= jobs[i] - targetJobs;
	                    if (sub > 0) {
	                        jobs[i] = jobs[i]- sub;
	                        jobs[(i + 1) % N] = jobs[(i + 1) % N] + sub;
	                        rounds =rounds+ sub;
	                    }
	                }
	                System.out.println(rounds);
	            }
	         scn.nextLine();
	        }
			scn.close();
	    }
	}

