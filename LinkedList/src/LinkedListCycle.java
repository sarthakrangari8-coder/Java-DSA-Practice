import org.w3c.dom.Node;

class  ListSolution{
    public boolean  hashCycle( ListNode head){
        if (head==null) return false;

        ListNode slow=head;
        ListNode fast=head;

        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if (slow==fast)return true;
        }
        return false;

    }
    public ListNode PrintNodeWeCyStart(ListNode head){
        if (head==null) return null;
        ListNode slow=head;
        ListNode fast=head;

        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                slow=head;

                while (slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }

        }
        return null;

    }
    //delete cycle in linked list
    public ListNode deleteCycle(ListNode head){
        if (head==null) return null;
        ListNode slow=head;
        ListNode fast=head;

        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if (slow==fast){
                slow=head;
                ListNode prev =fast;

                while (slow!=fast){
                    slow=slow.next;
                    prev=fast;
                    fast=fast.next;
                }
                prev.next=null;
                return slow;

            }
        }
        return null;
    }

    public void printCycleStart(ListNode head) {
        ListNode node = PrintNodeWeCyStart(head);

        if (node != null) {
            System.out.println("Cycle starts at node: " + node.data);
        } else {
            System.out.println("No cycle found");
        }

    }



}
public class LinkedListCycle{
    public static void main(String[] args) {
       fun bl=new fun();
       bl.insertAtHead(20);
        bl.insertAtHead(30);
        bl.insertAtHead(40);
        bl.insertAtHead(50);

        bl.tail.next=bl.head.next.next;

        ListSolution obj=new ListSolution();



        //obj.printCycleStart(bl.head);

        obj.deleteCycle(bl.head);
        bl.print();









    }
}








