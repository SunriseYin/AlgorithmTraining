package cn.sunrise.leecode.retry.chapter01;

import cn.sunrise.leecode.chapter01.domain.ListNode;

public class ReCode0025 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dup = new ListNode(0);
        dup.next = head;

        ListNode pre = dup;
        ListNode tail = dup;

        while (tail.next != null) {
            int count = 0;
            while (tail != null && count != k) {
                count ++;
                tail = tail.next;
            }

            if (tail == null) {
                break;
            }

            ListNode temp = pre.next;
            while (pre.next != tail) {
                ListNode cur = pre.next;

                pre.next = cur.next;
                cur.next = tail.next;
                tail.next = cur;
            }

            pre = temp;
            tail = temp;
        }

        return dup.next;
    }
}
