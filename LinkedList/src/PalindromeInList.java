class solutionPalindrome{
    public boolean palindromeInList(ListNode head){
        //step 1:-find the middle node
        ListNode slow=head;
        ListNode fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //step 2:-reverse the second half
        ListNode Prev=null;
        while (slow!=null){
            ListNode next=slow.next;
            slow.next=Prev;
            Prev=slow;
            slow=next;
        }
        //step 3:-compare both side
        ListNode left= head;
        ListNode right=Prev;
        if (right!=null){
            if (left.data !=right.data) return false;
            left=left.next;
            right=right.next;
        }
        return true;
    }
}





public class PalindromeInList {
    public static void main(String[] args) {
        fun al=new fun();
        al.insertAtHead(1);
        al.insertAtHead(2);
        al.insertAtHead(3);
        al.insertAtHead(3);
        al.insertAtHead(2);
         al.insertAtHead(4);

        solutionPalindrome obj=new solutionPalindrome();

       boolean asn= obj.palindromeInList(al.head);

        System.out.println(asn);




    }

}
