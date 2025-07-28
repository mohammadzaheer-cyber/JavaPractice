package com.dsa.linkedList.practiceSingly;

public class StudentNodeImplementation {
    StudentNode head;

    void insertLast(int roll_number, String name, double marks) {
        StudentNode newNode = new StudentNode(roll_number, name, marks);
        if (head == null) {
            head = newNode;
        } else {
            StudentNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void insertFirst(int roll_number, String name, double marks) {
        StudentNode newNode = new StudentNode(roll_number, name, marks);
        newNode.next = head;
        head = newNode;
    }

    void insertAtPosition(int index, int roll_number, String name, double marks) {
        if (index <= 1) {
            insertFirst(roll_number, name, marks);
            return;
        }
        StudentNode newNode = new StudentNode(roll_number, name, marks);
        StudentNode temp = head;
        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of bounds. Adding at end.");
            insertLast(roll_number, name, marks);
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    void printList() {
        StudentNode temp = head;
        while (temp != null) {
            System.out.print("Roll Number: " + temp.roll_number + " Name: " + temp.name + " Mark: " + temp.marks + " ➡️ ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
