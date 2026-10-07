class Node3{
    int data;
    Node3 next;
    Node3(int data){
        this.data=data;
    }
}
class List3{
    Node3 head=null;
    //for cycle
   void insertAtBeginning(int data){
       Node3 newNode=new Node3(data);
       if (head==null){
           head=newNode;
           newNode.next=head;
           return;
       }
       Node3 temp=head;
       while (temp.next!=head){
           temp=temp.next;
       }
       newNode.next=head;
       temp.next=newNode;
       head=newNode;
   }
   void printInCircularLL(){
       if (head==null){
           System.out.println("list is empty ");
           return;
       }
       Node3 temp=head;
       do {
           System.out.print(temp.data + " ");
           temp=temp.next;
       }while (temp!=head);
       System.out.println();
   }
   void insertAtTailCll(int data){
       Node3 newNode=new Node3( data);
       if (head==null){
           head=newNode;
           newNode.next=head;
           return;
       }
       Node3 temp=head;
       while (temp.next!=head){
           temp=temp.next;
       }
       temp.next=newNode;
       newNode.next=head;
   }
   void deleteAtHeadCCl(){
       if (head==null){
           System.out.println("list is empty ");
           return;
       }
       if (head.next==head){
           head=null;
           return;
       }
       Node3 temp=head;
       while(temp.next!=head){
           temp=temp.next;
       }
       head=head.next;
       temp.next=head;
   }
   void deleteAtTailCCl(){
       if (head==null){
           System.out.println("list is empty ");
           return;
       }
       if (head.next==head){
           head=null;
           return;
       }
       Node3 temp=head;
       while(temp.next.next!=head){
           temp=temp.next;
       }
       temp.next=head;

   }


}

public class CircularLL {
    public static void main(String[] args) {
        List3 cl=new List3();
        cl.insertAtBeginning(10);
        cl.insertAtBeginning(20);
        cl.insertAtBeginning(30);
        cl.insertAtBeginning(40);
        cl.insertAtBeginning(50);
        cl.printInCircularLL();
        cl.insertAtTailCll(300);
        cl.printInCircularLL();
        cl.deleteAtHeadCCl();
        cl.printInCircularLL();
        cl.deleteAtTailCCl();
        cl.printInCircularLL();





    }


}
