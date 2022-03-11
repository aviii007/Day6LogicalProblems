package com.java.day6;

import java.util.Random;
import java.util.Scanner;

public class CouponNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of coupons:");
        int n = scanner.nextInt();
        char[] s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();

        for (int i = 0; i < n; i++) {
            int random = (int) (Math.random() * 999999999); // to increase the value of math.random and storing it at
            // int.
            StringBuffer sb = new StringBuffer();
            while (random > 0) {
                sb.append(s[random % s.length]);
                random /= s.length;
            }

            String CouponCode = sb.toString();
            System.out.println("Coupon Code: " + CouponCode);
        }
}
    }

