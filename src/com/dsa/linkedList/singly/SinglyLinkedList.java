package com.dsa.linkedList.singly;

public class SinglyLinkedList {
    SingleNode head;

    public void addFirst(int data) {
        SingleNode newNode = new SingleNode(data);
        System.out.println(newNode + "New data at first index..");
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        SingleNode newNode = new SingleNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        SingleNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void addAtPosition(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        SingleNode newNode = new SingleNode(data);
        SingleNode current = head;
        for (int i = 0; i < index - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Index out of bounds");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    public void updateAtPosition(int index, int newData) {
        SingleNode current = head;
        for (int i = 0; i < index && current != null; i++) {
            current = current.next;
        }
        if (current != null) {
            current.data = newData;
        } else {
            System.out.println("Index out of bounds");
        }
    }

    public void deleteFirst() {
        if (head == null) return;
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
        SingleNode current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    public void deleteAtPosition(int index) {
        if (index == 0){
            deleteFirst();
            return;
        }

        SingleNode current = head;
        for (int i =0; i < index-1; i ++){
            current = current.next;
        }
        if (current == null || current.next == null){
            System.out.println("Index out of bounds");
            return;
        }
        current.next = current.next.next;
    }

    public void printList() {
        SingleNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
