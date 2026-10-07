class solutionRemove{
    public ListNode removeDuplicate(ListNode head){
        if (head==null || head.next==null) return head;
        ListNode curr=head;

        while (curr!=null && curr.next!=null){

            if (curr.data==curr.next.data){

                curr.next=curr.next.next;


            }else {


                curr=curr.next;
            }
        }
        return  head;
    }
}



public class RemoveDuplicatesForLIst {
    public static void main(String[] args) {
        fun al =new fun();
        al.insertAtHead(4);
        al.insertAtHead(4);
        al.insertAtHead(3);
        al.insertAtHead(2);
        al.insertAtHead(2);
        al.insertAtHead(1);

        System.out.println("Original list : ");
        al.print();

        solutionRemove obj= new solutionRemove();

        ListNode ans=obj.removeDuplicate(al.head);

        System.out.println(ans + " ");
        ListNode temp=ans;
        while (temp!=null){
            System.out.print(temp.data);
            temp=temp.next;
        }
    }

}
