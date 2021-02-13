package Problem2_AddTwoNumbers;

public class Driver {
    //Driver Code
    public static void main(String[] args){
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        Solution algorithm = new Solution();

        ListNode resultingList = algorithm.addTwoNumbers(l1, l2);
        System.out.print("Resultant List: ");
        while (resultingList != null) {
            System.out.print(resultingList.val + " ");
            resultingList = resultingList.next;
        }
    }
}
