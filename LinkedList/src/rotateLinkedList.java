class Problem1{
   public ListNode rotateList(ListNode head,int k){
       if (head==null) return head;

       //1.to find length
       int length=1;
       ListNode dummy=head;
       while (dummy.next!=null){
           length++;
           dummy=dummy.next;
       }
       //1.To find  position
       int pos=k%length;
       if (pos==0) return head;  //if user give position like equal to position or greater than position.

       //2.travel to that position
       ListNode temp=head;
       for (int i=0;i<length-pos-1;i++){
           temp=temp.next;
       }
       //logic for rotate list
       ListNode newNode=temp.next;
       temp.next=null;
       dummy.next=head;
       return newNode;
   }


}

public class rotateLinkedList {
    public static void main(String[] args) {
        fun al=new fun();
        al.insertAtHead(5);
        al.insertAtHead(4);
        al.insertAtHead(3);
        al.insertAtHead(2);
        al.insertAtHead(1);

        System.out.println("Original list : ");
        al.print();

        Problem1 obj=new Problem1();

        ListNode ans=obj.rotateList(al.head,2);

        System.out.println("rotate list : ");

        ListNode temp=ans;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }

    }

}
