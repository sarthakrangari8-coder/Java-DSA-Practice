class Node{
    int data;
    Node next;
    //constructor

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class List{
    Node head=null;
    Node tail=null;

    //inserts at head
    void insertAtHead(int data){
        Node newNode=new Node(data);
        //in case we did not have list
        if (head==null){
            head=tail=newNode;
            return;
        }
        //if node is given
        newNode.next=head;
        head=newNode;
    }
    //inserts at tail
    void insertAtTail(int data){
        Node newNode=new Node(data);
        if (tail==null){
            head=tail=newNode;return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    void print (){
        if (head==null){
            System.out.println("list is empty ! ");return;
        }
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }
    //insert at position
    void insertAtPosition(int position,int data){
        if (position<0){
            System.out.println("invalid position");
            return;
        }
        //if position is 1 so we call the head function because 1 position is head position.
        if (position==1){
            insertAtHead(data);
            return;
        }
        //convert the data in node
        Node newNode=new Node(data);
        //to move the temp for find positon
        Node temp=head;
        int i=1;
        while (i<position-1 && temp!=null){
            temp=temp.next;
            i++;
        }
        //if temp is go to null in this case
        if (temp==null){
            System.out.println("position out of range ");
            return;
        }
        //logic to add in position
        newNode.next=temp.next;
        temp.next=newNode;
        if (newNode.next==null){
            tail=newNode;
        }

    }
    //delete at head
    void deleteAtHead(){
        if (head==null){
            System.out.println("list is empty ");
            return;
        }
        head=head.next;
        if (head==null){
            tail=null;
        }
    }
    //delete at tail
    void deleteAtTail(){
        if (head==null){
            System.out.println("list is empty");
            return;
        }
        if (head==tail){
            head=tail=null;
            return;
        }
        Node temp=head;
        while (temp.next!=tail){
            temp=temp.next;
        }
        //logic
        temp.next=null;
        tail=temp;

    }
    //delete at position
    void deleteAtPosition(int positon){
        if (positon<=0){
            System.out.println("list is empty");
            return;
        }
        if (positon==1){
            deleteAtHead();
            return;
        }
       Node temp=head;
        int i=1;
        while (i<positon-1 && temp!=null){
            temp=temp.next;
            i++;
        }
        if (temp.next==tail){
            tail=temp;
        }
        temp.next=temp.next.next;
    }
    int  lengthOfList(){
        if (head==null){
            return 0;
        }
        Node temp=head;
        int count=0;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        return count;

    }

}
public class SinglyLL {
    public static void main(String[] args) {
        List l1= new List();
        l1.insertAtHead(10);
        l1.insertAtHead(20);
        l1.insertAtHead(30);
        l1.insertAtHead(40);
        l1.print();
        l1.insertAtTail(50);
        l1.insertAtTail(70);
        l1.print();
        l1.insertAtPosition(3,700);
        l1.print();
        l1.deleteAtHead();
        l1.print();
        System.out.println(l1.lengthOfList());






    }
}