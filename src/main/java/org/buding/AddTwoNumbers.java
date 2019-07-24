package org.buding;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Administrator
 * \* Date: 2019/7/23 0023
 * \* Time: 23:29
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \ 逆序的意思是从个位开始算起
 * 若正序，改怎么算
 */
public class AddTwoNumbers {
    //链表
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode p = l1, q = l2, curr = listNode;
        int carry = 0;
        while (p != null || q != null) {
            int x = p != null ? p.val : 0;
            int y = q != null ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        //最后一位进位
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return listNode.next;
    }
}
