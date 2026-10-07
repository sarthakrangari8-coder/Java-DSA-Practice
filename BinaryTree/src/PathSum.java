 class PathSum {
    Boolean pathSum(Node root,int sum){
        if (root==null)return false;

        //if left and right both are null we check value of root is equal to sum or not
        if (root.left==null && root.right==null)return root.data==sum;

        boolean left=pathSum(root.left,sum- root.data);
        boolean right=pathSum(root.right,sum- root.data);

        return left || right;

    }

     public static void main(String[] args) {
         int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

         binaryTree tree=new binaryTree();

         Node root=tree.buildTree(nodes);

         PathSum obj=new PathSum();

         boolean ans=obj.pathSum(root,11);

         System.out.println(ans);

     }
}
