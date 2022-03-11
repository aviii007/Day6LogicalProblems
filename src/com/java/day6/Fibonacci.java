package com.java.day6;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]) {

        int num, a = 0, b = 0, c = 1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value of n:");
        num = s.nextInt();
        System.out.print("Fibonacci Series:");
        for (int i = 1; i <= num; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a + " ");

        }
    }
}
