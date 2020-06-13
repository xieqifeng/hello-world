package com.juvenxu.mvnbook.helloworld.linkedList;

public class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

class Main{
    public static void main(String[] args) {
        ListNode node=new ListNode(1);
        ListNode node2=new ListNode(0);
        ListNode node3=new ListNode(1);
        ListNode node4=new ListNode(0);
        ListNode node5=new ListNode(0);
        node.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
//        reversePrint(node);
        System.out.println(getDecimalValue(node));
    }

    public static int getDecimalValue(ListNode head) {
        if (head == null)
            return 0;
        int ans = 0;
        while (head != null) {
            ans = (ans << 1) + head.val;
            System.out.println(ans);
            head = head.next;
        }
        return ans;
    }

    public static void printLinkedList(ListNode node){
        while(node!=null){
            System.out.print(node.val+" ");
            node=node.next;
        }
        System.out.println();
    }

    public static void deleteNode(ListNode node,ListNode dn) {
        while(node!=null){
            if(node.next.hashCode()==dn.hashCode()){
                node.next=node.next.next;
                dn.next=null;
                break;
            }
            node=node.next;
        }
    }

    public static void deleteNode1(ListNode dn){
        dn.val=dn.next.val;
        dn.next=dn.next.next;
    }

    public static int[] reversePrint(ListNode head) {
        ListNode prev=null;
        ListNode cur=head;
        int length=0;
        while(cur!=null){
            ListNode tempNode=prev;
            prev=cur;
            cur=cur.next;
            prev.next=tempNode;
            length++;
        }
        printLinkedList(prev);
        int[] arr=new int[length];
        int index=0;
        while(prev!=null){
            arr[index]=prev.val;
            prev=prev.next;
            index++;
        }
        return arr;
    }
}
