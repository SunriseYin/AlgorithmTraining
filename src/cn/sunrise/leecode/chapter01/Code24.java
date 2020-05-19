package cn.sunrise.leecode.chapter01;

import cn.sunrise.leecode.chapter01.domain.ListNode;

public class Code24 {

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4};
        ListNode cur = null;
        ListNode head = null;
        for (int i : a) {
            if(cur == null){
                cur = new ListNode(i);
                head = cur;
            } else {
                cur.next = new ListNode(i);
                cur = cur.next;
            }
        }

        ListNode listNode = swapPairsNoDi(head);

        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    //TODO:背诵递归和非递归算法
    //1.递归，抽象 前 -> head -> next -> 后
    public static ListNode swapPairsDi(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairsDi(next.next);
        next.next = head;

        return next;
    }

    //设置一个前置节点 优先链接后续的节点最后在链接相邻转化的节点
    //分为 三个部分  前 -> 中 -> 后 —> 后2
    public static ListNode swapPairsNoDi(ListNode head){
        ListNode pre = new ListNode(0);
        pre.next = head;

        ListNode temp = pre;

        while (temp.next != null && temp.next.next != null){
            ListNode start = temp.next;
            ListNode end = temp.next.next;
            //转化
            temp.next = end;
            start.next = end.next;
            end.next = start;
            //赋值
            temp = start;
        }

        return pre.next;
    }
}
