package com.dsa.linkedList.practiceSingly;

public class StudentNode {
    int roll_number;
    String name;
    double marks;
    StudentNode next;

    StudentNode(int roll_number, String name, double marks) {
        this.roll_number = roll_number;
        this.name = name;
        this.marks = marks;
    }
}
