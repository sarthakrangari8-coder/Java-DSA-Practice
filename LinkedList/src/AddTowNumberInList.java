class solutionAdd{
   public ListNode addTwoNumbersInList(ListNode l1,ListNode l2){
       ListNode dummy=new ListNode(-1);
       ListNode curr=dummy;


       // carry stores the extra value that needs to be added
       // to the next position.
       // Example: 8 + 7 = 15
       // We put 5 in the current node and carry 1 to the next node.
       int carry=0;




       // Continue while:
       // 1. l1 still has nodes, OR
       // 2. l2 still has nodes, OR
       // 3. carry is still remaining.
       while (l1!=null || l2!=null || carry!=0){

           // Start sum with the carry from the previous addition.
           int sum=carry;

           if (l1!=null){
               sum+= l1.data;
               l1=l1.next;
           }
           if (l2!=null){
               sum+= l2.data;
               l2=l2.next;
           }

           // Calculate the carry for the next position.
           //
           // Example:
           // sum = 15
           // 15 / 10 = 1
           // carry = 1
           carry=sum/10;


           // Example:
           // sum = 15
           // 15 % 10 = 5
           // So we create a node containing 5.
           curr.next=new ListNode(sum%10);


           curr=curr.next;
       }
       return dummy.next;
   }

}



public class AddTowNumberInList {
    public static void main(String[] args) {
        fun L1=new fun();
        fun L2=new fun();

        //List 1
        L1.insertAtHead(3);
        L1.insertAtHead(4);
        L1.insertAtHead(2);

        //List 2
        L2.insertAtHead(4);
        L2.insertAtHead(6);
        L2.insertAtHead(5);

        System.out.println("List 1 :");
        L1.print();

        System.out.println("List 2 :");
        L2.print();

        solutionAdd obj=new solutionAdd();

        ListNode ans=obj.addTwoNumbersInList(L1.head,L2.head);

        ListNode temp=ans;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }

}
