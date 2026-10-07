import java.util.ArrayList;

class LowestCommonAncestor {
    Node LCU(Node root,Node p,Node q){
        if (root==null || root==p || root==q)return root;

        Node left=LCU(root.left,p,q);
        Node right= LCU(root.right,p,q);

        if (left!=null && right!=null)return root;
        return (left!=null) ? left : right;
    }

     public static void main(String[] args) {
         int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

         binaryTree tree=new binaryTree();

         Node root=tree.buildTree(nodes);

         LowestCommonAncestor obj=new LowestCommonAncestor();
         Node p=root.left.left;
         Node q=root.left.right;

         Node ans=obj.LCU(root,p,q);

         System.out.println("LCA = " + ans.data);






     }


}
