class Node4{
    int data;
    Node4 next;
    Node4 random;

    Node4(int data){
        this.data=data;
        this.next=null;
        this.random=null;

    }

}

 class CopyLIstWithRandomPointer {
    public Node4 copyRandomList(Node4 head){
        if (head==null) return null;

        //step 1: create new nodes;
        Node4 temp=head;
        while (temp!=null){
            Node4 newNode=new Node4(temp.data);
            newNode.next=temp.next;
            temp.next=newNode;
            temp=newNode.next;
        }

        //step 2: Assign the random pointers
        temp=head;
        while (temp!=null){
            if (temp.random!=null){
                temp.next.random= temp.random.next;
            }
            temp=temp.next.next;
        }
        //step 3: separate the cloned list form original list
        temp=head;
        Node4 newHead=head.next;
        Node4 copy=newHead;

        while (temp!=null){
            temp.next=temp.next.next;
            if (copy.next!=null){
                copy.next=copy.next.next;
                copy=copy.next;
            }
            temp=temp.next;
        }
        return newHead;


    }

     public static void main(String[] args) {
         // Create original nodes
         Node4 a = new Node4(10);
         Node4 b = new Node4(20);
         Node4 c = new Node4(30);

         // Connect next
         a.next = b;
         b.next = c;

         // Connect random
         a.random = c;      // 10.random -> 30
         b.random = a;      // 20.random -> 10
         c.random = b;      // 30.random -> 20

         // Copy the list
         CopyLIstWithRandomPointer obj = new CopyLIstWithRandomPointer();

         Node4 copyHead = obj.copyRandomList(a);

         // Print original
         System.out.println("Original list:");
         printList(a);

         // Print copied
         System.out.println("Copied list:");
         printList(copyHead);
     }

     public static void printList(Node4 head) {

         Node4 temp = head;

         while (temp != null) {

             System.out.print("Data: " + temp.data + " | Random: ");

             if (temp.random != null)
                 System.out.println(temp.random.data);
             else
                 System.out.println("null");

             temp = temp.next;
         }

         System.out.println();
     }

}
