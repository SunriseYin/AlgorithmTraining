package cn.sunrise.leecode.chapter01;

import cn.sunrise.leecode.chapter01.domain.ListNode;

public class Code142 {

    public static void main(String[] args) {

    }

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        do {
            if (fast == null || fast.next == null) {
                return null;
            }

            fast = fast.next.next;
            slow = slow.next;

        } while (fast != slow);

        fast = head;

        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}
