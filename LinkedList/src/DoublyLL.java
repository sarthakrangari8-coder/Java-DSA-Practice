class Node2{
    int data;
    Node2 prev;
    Node2 next;

   Node2(int data){
       this.data=data;
       this.prev=null;
       this.next=null;

   }
}
class List2{

    Node2 head=null;
    Node2 tail=null;

    //insert at head in DLL
    void insertAtHead(int data){
         Node2 newNode=new Node2(data);
         if (head==null){
             head=tail=newNode;
             return;
         }
         //logic
         newNode.next=head;
         head.prev=newNode;
         head=newNode;
    }
    //print forward in DDL
    void  printForward(){
        if (head==null){
            System.out.println("list is empty");
            return;
        }
        Node2 temp=head;
        while (temp!=null){
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
        System.out.println();
    }
    //print backward in DDl
    void printBackward(){
        if (head==null){
            System.out.println("list is empty");
            return;
        }
        Node2 temp=tail;
        while (temp!=null){
            System.out.print(temp.data +" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    //insert at tail in DDL
    void insertAtTail(int data){
        Node2 newNode =new Node2(data);
        if (head==null){
           head=tail=newNode;
            return;
        }
        //logic
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;


    }
    //insert at position
    void insertAtPosition(int position ,int data){
        if (position<=0){
            System.out.println("invalid position");
            return;
        }
        if (position==1){
            insertAtHead(data);
            return;
        }
        //convert the data in node
        Node2 newNode=new Node2(data);
        Node2 temp=head;
        int i=1;
        while (i<position-1 && temp!=null){
            temp =temp.next;
            i++;
        }
        if (temp==null){
            System.out.println("position out of range");
            return;
        }
        //logic
        newNode.next=temp.next;
        newNode.prev=temp;
        //if inserting at end
        if (newNode.next==null){
            tail=newNode;
        }else {
            temp.next.prev=newNode;
        }
        temp.next=newNode;

    }
    //delete at head in DLL
    void deleteAtHead(){
        if (head==null){
            System.out.println("List is empty");
            return;
        }
        if (head==tail){
            head=tail=null;
            return;
        }
        head=head.next;
        head.prev=null;
    }
    //delete at tail
    void deleteAtTail(){
        if (tail==null){
            System.out.println("list is empty");
            return;
        }
        if (head==tail){
            head=tail=null;
        }
        tail=tail.prev;
        tail.next=null;
    }
    //delete at position
    void deleteAtPosition(int position){
        if (head==null || position<=0){
            System.out.println("List is empty or invalid position");
            return;
        }
        if (position==1){
            deleteAtHead();
            return;
        }
        Node2 temp=head;
        int i=1;
        while (i<position-1 && temp!=null){
            temp=temp.next;
            i++;
        }
        if (temp==null){
            System.out.println("position out of range");
            return;
        }
        //logic
        Node2 NodeToDelete =temp.next;
        temp.next=NodeToDelete.next;
        if (NodeToDelete.next!=null){
            NodeToDelete.next.prev=temp;
        }


    }


}




public class DoublyLL {
    public static void main(String[] args) {
        List2 dl=new List2();
        dl.insertAtHead(20);
        dl.insertAtHead(30);
        dl.insertAtHead(40);
        dl.insertAtHead(50);
        dl.insertAtTail(70);
        dl.printForward();
        dl.insertAtPosition(6,45);
        dl.printForward();
        //dl.deleteAtHead();
        dl.deleteAtTail();
        dl.printForward();
       dl.deleteAtPosition(4);
       dl.printForward();







    }

}
