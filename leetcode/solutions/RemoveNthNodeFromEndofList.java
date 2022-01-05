package leetcode.solutions;

public class RemoveNthNodeFromEndofList {

    public static void main(String[] args) {

        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;

       ListNode r = new RemoveNthNodeFromEndofList().removeNthFromEnd(l1, 3);

        while (r != null){
            System.out.println(r.val);
            r = r.next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode pointer = head;
        ListNode pointerMinusN = null;
        
        while(pointer != null){
           
            if(n == 0){
                pointerMinusN = head;
            }
            else if(n < 0){
                pointerMinusN = pointerMinusN.next;
            }
            n--;
            pointer = pointer.next;
        }
        
        if(pointerMinusN == null){
           return head.next;
        }

        pointerMinusN.next = pointerMinusN.next != null ? pointerMinusN.next.next : pointerMinusN.next;

        return head;
    }
}