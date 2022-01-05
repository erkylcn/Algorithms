package leetcode.solutions;

public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;

        ListNode l11 = new ListNode(5);
        ListNode l12 = new ListNode(6);
        ListNode l13 = new ListNode(4);
        l11.next = l12;
        l12.next = l13;

       ListNode r = new AddTwoNumbers().addTwoNumbers(l1, l11);
        while (r != null){
            System.out.println(r.val);
            r = r.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode total = null;
        ListNode totalRoot = null;
        int plusOne = 0;
        while (l1 != null || l2 != null) {

            int val = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);

            if (plusOne > 0) {
                val++;
                plusOne = 0;
            }

            if (val > 9) {
                val = val % 10;
                plusOne++;
            }

            if (total == null) {
                total = new ListNode(val);
                totalRoot = total;
            } else {
                total.next = new ListNode(val);
                total = total.next;
            }

            l2 = l2 != null ? l2.next : null;
            l1 = l1 != null ? l1.next : null;
        }
        
        if(plusOne == 1){
            total.next = new ListNode(1);
        }

        return totalRoot;
    }
}