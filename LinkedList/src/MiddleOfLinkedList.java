class MiddleSolution{
    int length(ListNode head){
        ListNode temp=head;
        int count=0;

        while (temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public ListNode middleNode(ListNode head){
        int mid=length(head)/2;

        ListNode temp=head;
        for (int i=0;i<mid;i++){
            temp=temp.next;
        }
        return temp;

    }
    //by two pointer method imp
    public ListNode middleOfListByTwoPointer(ListNode head){
        ListNode slow=head;
        ListNode fast=head;

        while (fast!=null && fast.next!=null){
            slow =slow.next;
            fast=fast.next.next;
        }
        return slow;
    }


}
public class MiddleOfLinkedList {
    public static void main(String[] args) {
       fun bl =new fun();
        bl.insertAtHead(20);
        bl.insertAtHead(30);
        bl.insertAtHead(40);
        bl.insertAtHead(50);
        bl.insertAtHead(60);

        MiddleSolution obj= new MiddleSolution();



        ListNode ans=obj.middleNode(bl.head);


        System.out.println(ans.data);









    }
}
