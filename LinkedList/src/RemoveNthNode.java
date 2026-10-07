class solutionRemoveNthNode{
    public ListNode removeNthNodeFromEnd(ListNode head,int n){
        ListNode dummy=new ListNode(0);
        dummy.next=head;

        ListNode slow=dummy;
        ListNode fast=dummy;

        //jab tak fast less then n hai tab tak  loop chlega
        for (int i=0;i<=n;i++){
          fast=fast.next;
        }
        //jab fast greater ho jaye n se tb slow aage bdayege
        //jab tak fast null nhi ho jata
        while (fast!=null){
            slow=slow.next;
            fast=fast.next;
        }

        //point slow to slow.next.next node ;
        slow.next=slow.next.next;
        return dummy.next;
    }

}




public class RemoveNthNode {
    public static void main(String[] args) {
        fun al=new fun();
        al.insertAtHead(6);
        al.insertAtHead(5);
        al.insertAtHead(4);
        al.insertAtHead(3);
        al.insertAtHead(2);
        al.insertAtHead(1);

        System.out.println("Original list : ");
        al.print();

        solutionRemoveNthNode obj=new solutionRemoveNthNode();

        ListNode ans=obj.removeNthNodeFromEnd(al.head,3);

        System.out.println("After remove the Nth node :  "+ ans + " ");

        ListNode temp=ans;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }

    }

}
