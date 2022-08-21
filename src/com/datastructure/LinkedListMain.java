package com.datastructure;

import java.util.Scanner;
public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Choose your option:\n" + "1. Create a simple LinkedList\n" // uc1
                        + "2. Create Linked List by adding 30 and 56 to 70\n" // uc2
                        + "3. Create Linked List by apending 30 and 70 to 56\n" // uc3
                        + "4. Insert 30 between 56 & 70\n" // uc4
                        + "5. Ability to delete the first element\n"
                        + "6. Ability to delete the last element\\n ");// uc5
        int option = sc.nextInt();
        System.out.println();
        switch (option) {
         
                System.out.println(" ");
                break;

                case 3 :
                    list.add(56);
                    list.add(30);
                    list.add(70);
                    list.show();
                    System.out.println(" ");
                    break;
                case 4 :
                    Node prevNode = list.add(56);
                    list.add(70);

                    list.add(70);
                    list.show();
                    int pop = list.pop();
                    System.out.println("Deleted element:" + pop);
                    list.show();
                    case 6 :
                        list.add(56);
                        list.add(30);
                        list.add(70);
                        list.show();
                        list.popLast();
                        list.show();
                        break;
                }
            }
        }