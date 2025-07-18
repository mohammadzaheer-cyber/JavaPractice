package com.questions;

import java.util.Scanner;

public class TakeNumberInput {
    static Scanner input = new Scanner(System.in);

    static int numberInput(String message) {
        System.out.println(message);
        return input.nextInt();
    }
}
