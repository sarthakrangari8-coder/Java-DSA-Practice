class MergeSolution {
    public ListNode mergeSortedList(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;

        }
        if (l1!=null)curr.next=l1;
        if (l2!=null)curr.next=l2;


        return dummy.next;
    }
}
public class MergeSortedLinkedList {
    public static void main(String[] args) {
        fun L1=new fun();
        fun L2=new fun();

        //List 1
        L1.insertAtHead(4);
        L1.insertAtHead(2);
        L1.insertAtHead(1);

        //List 2
        L2.insertAtHead(4);
        L2.insertAtHead(3);
        L2.insertAtHead(1);

        System.out.println("List 1 :");
        L1.print();

        System.out.println("List 2 :");
        L2.print();

        MergeSolution obj=new MergeSolution();

        ListNode ans=obj.mergeSortedList(L1.head,L2.head);

        System.out.println("Merge Sorted list : ");
        ListNode temp=ans;
        while (temp!=null){
            System.out.print(temp.data);
            temp=temp.next;
        }

    }
}
