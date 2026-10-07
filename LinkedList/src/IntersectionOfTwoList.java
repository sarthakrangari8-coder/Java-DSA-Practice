class solutionIntersectionList{
    public ListNode printIntersectionNode(ListNode l1,ListNode l2){
        ListNode a=l1;
        ListNode b=l2;

        while (a!=b){
            if(a==null)a=l2;
            else a=a.next;

            if (b==null)b=l1;
            else b=b.next;
        }
        return a;
    }

}



public class IntersectionOfTwoList {
    public static void main(String[] args) {

        ListNode common1 = new ListNode(30);
        ListNode common2 = new ListNode(40);

        common1.next = common2;

        // List 1
        ListNode l1 = new ListNode(10);
        ListNode l1_2 = new ListNode(20);

        l1.next = l1_2;
        l1_2.next = common1;

        // List 2
        ListNode l2 = new ListNode(5);
        l2.next = common1;   // <-- intersection!

        solutionIntersectionList obj = new solutionIntersectionList();

        ListNode ans = obj.printIntersectionNode(l1, l2);

        if (ans != null)
            System.out.println("Intersection: " + ans.data);
        else
            System.out.println("No intersection");
    }
}










