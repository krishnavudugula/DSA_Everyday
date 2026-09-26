// class Node {

//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// class LinkedList {

//     Node head;

//     void insertAtBeginning(int data) {

//         Node newNode = new Node(data);

//         newNode.next = head;

//         head = newNode;
//     }

//     void insertAtEnd(int data) {

//         Node newNode = new Node(data);

//         if (head == null) {
//             head = newNode;
//             return;
//         }

//         Node temp = head;

//         while (temp.next != null) {
//             temp = temp.next;
//         }

//         temp.next = newNode;
//     }

//     void display() {

//         Node temp = head;

//         while (temp != null) {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }

//         System.out.println("null");
//     }
// }

// public class LL {

//     public static void main(String[] args) {

//         LinkedList l1 = new LinkedList();

//         l1.insertAtBeginning(10);
//         l1.insertAtEnd(20);
//         l1.insertAtBeginning(5);

//         System.out.println("Original LL:");
//         l1.display();

//         l1.insertAtBeginning(0);

//         l1.display();
//     }
// }
// // public class LinkedList {

// //     static class Node {

// //         int data;
// //         Node next;

// //         Node(int data) {
// //             this.data = data;
// //             this.next = null;
// //         }
// //     }

// //     public static void main(String[] args) {

// //         Node first = new Node(10);
// //         Node second = new Node(20);
// //         Node third = new Node(30);

// //         first.next = second;
// //         second.next = third;

// //         Node head = first;

// //         Node current = head;

// //         while (current != null) {
// //             System.out.print(current.data + " -> ");
// //             current = current.next;
// //         }
// //         System.out.println("null");
// //     }
// // }

import java.util.*;
public class LL {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Linked List : " + list);
        list.addFirst(5);

        list.addLast(35);

        System.out.println(list);

        System.out.println(list.get(3));

        list.remove(Integer.valueOf(20)); //list.remove(index);

        System.out.println(list);

        list.size();
        // System.out.println(Integer.parseInt("101", 16));
        
    }
}