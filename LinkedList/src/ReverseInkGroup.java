class kGroupSolution{
    public ListNode reverseInkGroup(ListNode head ,int k){
        ListNode curr=head;
        int count=0;

        while (count<k && curr!=null){
            curr=curr.next;
            count++;
        }
        if(count==k){
            curr=reverseInkGroup(curr,k);

            while (count!=0){
                    ListNode temp=head.next;
                    head.next=curr;
                    curr=head;
                    head=temp;

                    count--;
            }
            head=curr;
        }
        return head;
    }
}




public class ReverseInkGroup {
    public static void main(String[] args) {
        fun al=new fun();
        al.insertAtHead(20);
        al.insertAtHead(30);
        al.insertAtHead(40);
        al.insertAtHead(50);
        al.insertAtHead(60);
       // al.insertAtHead(70);

        System.out.println("Original list : ");
        al.print();

        kGroupSolution obj=new kGroupSolution();

       al.head= obj.reverseInkGroup(al.head,3);
        al.print();


    }

}
