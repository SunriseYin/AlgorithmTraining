package cn.sunrise.leecode.chapter01;

import cn.sunrise.leecode.chapter01.domain.ListNode;

public class Code25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dum = new ListNode(0);
        dum.next = dum;

        ListNode pre = dum;
        ListNode tail = dum;

        while (true){
            int a = 0;
            while ( tail != null && a != k){
                a ++;
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


        return dum.next;
    }

}
