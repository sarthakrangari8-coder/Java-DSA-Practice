class problem2{
    public ListNode flatteningList(ListNode root){
        //base case
        if (root==null || root.next==null) return root;

        //recursive call
        root.next=flatteningList(root.next);


        //function for  merging the nodes or list
        root=merge(root,root.next);

        return root;

    }

    public ListNode merge(ListNode a,ListNode b){
        if (a==null)return a;
        if (b==null)return b;
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while (a!=null && b!=null){
            if (a.data< b.data){
                temp.bottom=a;
                a=a.bottom;
            }else{
                temp.bottom=b;
                b=b.bottom;
            }
            temp=temp.bottom;
        }
        if (a!=null) temp.bottom=a;
        else temp.bottom=b;

        ListNode curr=dummy.bottom;
        while (curr!=null){
            curr.next=null;
            curr=curr.bottom;
        }
        return dummy.bottom;
    }
}

 class FlatteningList {
    public static void main(String[] args) {

        // Main nodes connected using NEXT
        ListNode n5 = new ListNode(5);
        ListNode n10 = new ListNode(10);
        ListNode n19 = new ListNode(19);
        ListNode n28 = new ListNode(28);

        // Bottom nodes
        ListNode n7 = new ListNode(7);
        ListNode n8 = new ListNode(8);
        ListNode n30 = new ListNode(30);

        ListNode n22 = new ListNode(22);
        ListNode n50 = new ListNode(50);


        // ---------- NEXT CONNECTIONS ----------
        n5.next = n10;
        n10.next = n19;
        n19.next = n28;


        // ---------- BOTTOM CONNECTIONS ----------

        // 5 -> 7 -> 8 -> 30
        n5.bottom = n7;
        n7.bottom = n8;
        n8.bottom = n30;

        // 19 -> 22 -> 50
        n19.bottom = n22;
        n22.bottom = n50;


        // 10 has no bottom
        // 28 has no bottom


        // Run flattening
        problem2 obj = new problem2();

        ListNode ans = obj.flatteningList(n5);


        // Print flattened list
        System.out.println("Flattened list:");

        ListNode temp = ans;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.bottom;
        }
    }
}

