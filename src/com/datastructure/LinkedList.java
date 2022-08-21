package com.datastructure;


public class LinkedList {

    Node head;
    Node tail;
    public Node add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        return newNode;
    }
    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;

                head = newNode;
            }
        }
        public void insertAfter(Node prevNode, int data) {
            if (prevNode == null) {
                System.out.println("Prev Node should not be null");
                return;
            }
            Node newNode = new Node(data);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }
        public void show() {
            if (head == null) {
                System.out.println("Linked list is Empty");
            } else {
                Node temp = head;
                while (temp != null) {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
                System.out.println();
            }
        }
    }