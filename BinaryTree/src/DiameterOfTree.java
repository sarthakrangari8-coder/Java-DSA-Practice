 class DiameterOfTree {
    int diameter=0;
    int Height(Node root){
        if (root==null)return 0;

        int left=Height(root.left);
        int right=Height(root.right);

        diameter=Math.max(diameter,(left+right));

        return 1+Math.max(left,right);

    }
    int diameterOfTree(Node root){
        Height(root);
        return diameter;
    }


     public static void main(String[] args) {
         int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

         binaryTree tree=new binaryTree();

         Node root=tree.buildTree(nodes);

         DiameterOfTree obj=new DiameterOfTree();

         int ans=obj.diameterOfTree(root);

         System.out.println(ans);
     }


}
