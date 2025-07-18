package com.questions;

import java.util.Scanner;

public class TwoDigitsSum {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter your second number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.println("You sum of the number is: "+sum);
    }
}
