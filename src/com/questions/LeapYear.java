package com.questions;

import java.util.Scanner;

public class LeapYear {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a year to check year is leap or not: ");
        int year = input.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Year is leap");
                } else {
                    System.out.println("Year is not leap");
                }
            } else {
                System.out.println("Year is leap");
            }
        } else {
            System.out.println("Year is not leap");
        }
    }
}
