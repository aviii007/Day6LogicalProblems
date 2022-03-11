package com.java.day6;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String args[]) {
        int num, reverse = 0;
        System.out.println("Enter the number to reverse: ");
        Scanner s = new Scanner(System.in);

        num = s.nextInt();
        while (num != 0) {
            reverse = reverse * 10;
            reverse = reverse + num % 10;
            num = num / 10;
        }
        System.out.println("The Reverse of entered number is: " + reverse);
    }
}
