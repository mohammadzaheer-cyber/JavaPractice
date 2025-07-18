package com.questions;

import java.util.Scanner;


public class TableOfAnyNumber {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        int num = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}
