class ListNode {
    int data;
    ListNode next;
    //for fattening
    ListNode bottom;

    ListNode(int data) {
        this.data = data;
        this.next = null;
        //for fattening
        this.bottom=null;
    }
}
class fun{
    ListNode head=null;
    ListNode tail=null;
    void insertAtHead(int data) {
        ListNode newNode = new ListNode(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }
    void print() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

}


class solution{

    public ListNode reverseList(ListNode head){
        ListNode prev=null;
        ListNode curr=head;

        while (curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    //by recursion
    public ListNode reverseListByRecursion(ListNode head){
        if (head==null || head.next==null) return head;
        ListNode newHead=reverseListByRecursion(head.next);

        head.next.next=head;

        head.next=null;

        return newHead;



    }

}


public class ReverseLinkedList {
    public static void main(String[] args) {
        fun al=new fun();
        al.insertAtHead(10);
        al.insertAtHead(20);
        al.insertAtHead(30);
        al.insertAtHead(40);


        System.out.println("original list : ");
        al.print();

        solution obj = new solution();
        //al.head=obj.reverseList(al.head);
        al.head=obj.reverseListByRecursion(al.head);

        System.out.println("reverse list : ");
        al.print();




    }






}







