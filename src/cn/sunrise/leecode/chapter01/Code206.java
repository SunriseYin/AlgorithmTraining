package cn.sunrise.leecode.chapter01;

import cn.sunrise.leecode.chapter01.domain.ListNode;

/**
 * 思路2.最优解 O(1) 双指针 快指针遍历 将快指针的next 指向满指针后 移动满指针的位置
 */
public class Code206 {

    public static void main(String[] args) {

    }

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode temp = null;

        while( cur != null){
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }

        return pre;
    }
}
