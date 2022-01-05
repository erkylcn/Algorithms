package leetcode.solutions;

public class MergeTwoSortedList {

    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode l1 = list1;
        ListNode l2 = list2;
        ListNode retNode = null;
        ListNode root = null;

        while (l1 != null && l2 != null) {

            if (l1.val <= l2.val) {
                if (root == null) {
                    root = l1;
                    retNode = l1;
                } else {
                    retNode.next = l1;
                    retNode = l1;
                }

                l1 = l1.next;
            } else {
                if (root == null) {
                    root = l2;
                    retNode = l2;
                } else {
                    retNode.next = l2;
                    retNode = l2;
                }
                l2 = l2.next;
            }
        }

        if (l1 == null && l2 != null) {
            if (root == null) {
                root = l2;
            } else
                retNode.next = l2;
        } else if (l1 != null && l2 == null) {
            if (root == null) {
                root = l1;
            } else
                retNode.next = l1;
        }

        return root;
    }
}
