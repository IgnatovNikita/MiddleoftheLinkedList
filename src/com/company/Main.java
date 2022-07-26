package com.company;

public class Main {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode middleNode(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
try{
    while (fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
}catch (NullPointerException ex){
    return slow;
}

    return slow;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3,new ListNode(4,new ListNode(5, new ListNode(6) ) ) )));
	// write your code here
        System.out.println(middleNode(head).val);
    }
}
