package com.java.day6;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args){
        int num, sum = 0;

        System.out.println("Enter a number: ");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();

        /* If number is greater than zero */
        if (num > 0) {
            for (int i = 1; i < num; i++) {

                /* sum of it's factors */
                if ( num % i == 0) {
                    sum = sum + i;
                }
            }
            if ( sum == num) {
                System.out.println(num + " is a perfect number ");

            } else {
                System.out.println (num + " is not a perfect number ");
            }

        }   else {

            System.out.println (" Please enter positive number ");
        }
    }

}
