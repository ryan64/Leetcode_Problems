package Problem0021_MergeTwoSortedLists;

public class Driver {
    public static void main(String[] args){
       ListNode l1 = new ListNode(1);
       l1.next = new ListNode(2);
       l1.next.next = new ListNode(4);

       ListNode l2 = new ListNode(1);
       l2.next = new ListNode(3);
       l2.next.next = new ListNode(4);

       Solution algorithm = new Solution();
       ListNode resultingList = algorithm.mergeTwoLists(l1, l2);
       System.out.println("Resulting List: ");
        while (resultingList != null) {
            System.out.print(resultingList.val + " ");
            resultingList = resultingList.next;
        }
    }
}
