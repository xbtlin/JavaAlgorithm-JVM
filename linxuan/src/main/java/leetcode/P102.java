package leetcode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class P102 {

    public static class ListNode {
            int val;
            ListNode next;
            ListNode(int x) { val = x; }
         }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode result = new P102().addTwoNumbers(l1,l2);
        ListNode f = result;
        while(f != null){
            System.out.println(f.val);
            f=f.next;
        }

    }
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode prev = new ListNode(0);
//        ListNode head = prev;
//        int carry = 0;
//        while (l1 != null || l2 != null || carry != 0) {
//            ListNode cur = new ListNode(0);
//            int sum = ((l2 == null) ? 0 : l2.val) + ((l1 == null) ? 0 : l1.val) + carry;
//            cur.val = sum % 10;
//            carry = sum / 10;
//            prev.next = cur;  //moving to next pointer
//            prev = cur;   //making next pointer the current pointer
//            l1 = (l1 == null) ? l1 : l1.next;
//            l2 = (l2 == null) ? l2 : l2.next;
//        }
//        return head.next;
//    }
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode head = null, node = null;
            int carry = 0, remainder = 0, sum = 0;
            head = node = new ListNode(0);

            while(l1 != null || l2 != null || carry != 0) {
                sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
                carry = sum / 10;
                remainder = sum % 10;
                node = node.next = new ListNode(remainder);
                l1 = (l1 != null ? l1.next : null);
                l2 = (l2 != null ? l2.next : null);
            }
            return head.next;
        }
}