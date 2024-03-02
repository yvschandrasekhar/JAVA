package com.globussoft.pack;
import java.util.Scanner;

public class Rng {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt(); 

        for (int t = 0; t < T; t++) {
            int N = scn.nextInt();
            int A = scn.nextInt();
            int B = scn.nextInt();

            int[] X = new int[N];
            for (int i = 0; i < N; i++) {
                X[i] = scn.nextInt();
            }

            int count = countcom(N, A, B, X);
            double prob = (double) count / Math.pow(10, N);
            System.out.printf("%.9f\n", prob);
        }
        scn.close();
    }

    public static int countcom(int N, int A, int B, int[] X) {
        return 0;
    }
}


