package com.juvenxu.mvnbook.helloworld.linkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
//
//        while (node != null) {
//            System.out.print(node.val + " ");
//            node = node.next;
//        }

        ListNode prev=null;
        ListNode tempNode=node.next;
        node.next=prev;
        System.out.println(tempNode.val);
    }
}
