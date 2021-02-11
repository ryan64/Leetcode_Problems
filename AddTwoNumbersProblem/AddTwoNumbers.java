package AddTwoNumbersProblem;

public class AddTwoNumbers {
    //Implemented solution
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode headOfNewList = null;
        ListNode tempList = null;
        int carryOver = 0;

        while (l1 != null || l2 != null){
            int sum = carryOver;

            if (l1 != null){
                sum = sum + l1.val;
                l1 = l1.next;
            }

            if (l2 != null){
                sum = sum + l2.val;
                l2 = l2.next;
            }

            ListNode node = new ListNode(sum % 10);
            carryOver = sum / 10;

            if (tempList == null){
                tempList = headOfNewList = node;
            }

            else {
                tempList.next = node;
                tempList = tempList.next;
            }

        }

        if (carryOver > 0) {
            tempList.next = new ListNode(carryOver);
        }

        return headOfNewList;
    }
}
