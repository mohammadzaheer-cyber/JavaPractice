package com.dsa.linkedList.practiceSingly;

public class TestStudentNode {

    public static void main(String[] args) {
        StudentNodeImplementation studentsList = new StudentNodeImplementation();

        studentsList.insertLast(20, "Zaheer", 98.9);
        studentsList.insertLast(23, "Khan", 98.99);
        studentsList.insertLast(25, "Aman", 96);

        studentsList.insertFirst(1, "Hero", 64.6);
        studentsList.insertFirst(2, "Rahim", 89.0);
        studentsList.insertFirst(3, "Honda", 78.0);

        studentsList.insertAtPosition(3, 44, "Ayan", 88.5);

        studentsList.printList();
    }
}
