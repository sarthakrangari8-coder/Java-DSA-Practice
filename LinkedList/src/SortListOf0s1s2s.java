class solutionSortDigit{
    public ListNode sortListOfDigits(ListNode head){
        if(head==null) return head;

        //dummy nodes
        ListNode zeroHead=new ListNode(-1);
        ListNode oneHead=new ListNode(-1);
        ListNode twoHead=new ListNode(-1);

        //pointers - tails for last nodes
        ListNode zero=zeroHead;
        ListNode one=oneHead;
        ListNode two=twoHead;

        //grouping
        ListNode temp=head;
        while (temp!=null){
            if (temp.data==0){
                zero.next=temp;
                zero=zero.next;
            }else if(temp.data==1){
                one.next=temp;
                one=one.next;
            }else {
                two.next=temp;
                two=two.next;
            }
            temp=temp.next;
        }
        //merge all list
        if (oneHead.next!=null){
            zeroHead.next=oneHead.next;
        }else {
            zeroHead.next=twoHead.next;
        }
        one.next=twoHead.next;
        two.next=null;
        return zeroHead.next;


    }

}
public class SortListOf0s1s2s {
    public static void main(String[] args) {
        fun al=new fun();
        al.insertAtHead(2);
        al.insertAtHead(2);
        al.insertAtHead(0);
        al.insertAtHead(2);
        al.insertAtHead(1);
        al.insertAtHead(2);
        al.insertAtHead(2);
        al.insertAtHead(1);

        System.out.println("Original list : ");
        al.print();


        solutionSortDigit obj=new solutionSortDigit();
        ListNode ans=obj.sortListOfDigits(al.head);

        System.out.println(ans);
        ListNode temp=ans;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }

    }

}
