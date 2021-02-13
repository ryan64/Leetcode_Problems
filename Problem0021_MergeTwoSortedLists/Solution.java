package Problem0021_MergeTwoSortedLists;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode resultantList;
        ListNode pointer;

        if (l1 == null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }

        if (l1.val < l2.val){
            resultantList = new ListNode(l1.val);
            pointer = resultantList;
            l1 = l1.next;
        } else {
            resultantList = new ListNode(l2.val);
            pointer = resultantList;
            l2 = l2.next;
        }

        while (l1 != null && l2 != null){
            if (l1.val < l2.val){
                pointer.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            else {
                pointer.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            pointer = pointer.next;
        }

        while (l1 != null){
            pointer.next = new ListNode(l1.val);

            l1 = l1.next;
            pointer = pointer.next;
        }

        while (l2 != null){
            pointer.next = new ListNode(l2.val);

            l2 = l2.next;
            pointer = pointer.next;
        }

        return resultantList;
    }
}
