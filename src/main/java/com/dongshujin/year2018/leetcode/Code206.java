package com.dongshujin.year2018.leetcode;

import com.dongshujin.year2018.leetcode.structure.ListNode;

public class Code206 {

    public ListNode reverseList(ListNode head) {
        if (null == head || null == head.next)
            return head;

        ListNode left = head;
        ListNode mid = left.next;
        ListNode right = mid.next;

        left.next = null;

        while (null != mid) {
            mid.next = left;
            left = mid;
            mid = right;
            if (null == mid)
                break;
            right = right.next;
        }
        return left;
    }
}
