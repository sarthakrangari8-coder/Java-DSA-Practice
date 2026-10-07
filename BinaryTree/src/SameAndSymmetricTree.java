class SameAndSymmetricTree {
    public boolean isSameTree(Node p,Node q ){
        if (p==null && q==null)return true;

        if (p==null || q==null || p.data !=q.data)return false;

        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
    boolean isSymmetricTree(Node t1,Node t2){
        if(t1==null && t2==null)return true;

        if(t1==null || t2==null || t1.data!= t2.data)return false;

        return isSymmetricTree(t1.left,t2.right) && isSymmetricTree(t1.right,t2.left);
    }

    public static void main(String[] args) {
//        int [] p= {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
//        int[] q = {1, 2, 3, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
//        binaryTree tree=new binaryTree();
//
//        Node root=tree.buildTree(p);
//
//        binaryTree.index=-1;
//
//        Node root2=tree.buildTree(q);
//
//
//
//        SameTree obj=new SameTree();
//
//       boolean ans= obj.isSameTree(root,root2);
//
//        System.out.println(ans);
//
        int[] nodes = {1, 2, 3, -1, -1, 4, -1, -1, 2, 4, -1, -1, 3, -1, -1};

        binaryTree tree=new binaryTree();

        Node root=tree.buildTree(nodes);

        SameAndSymmetricTree obj=new SameAndSymmetricTree();

        boolean ans=obj.isSymmetricTree(root.left,root.right);
        System.out.println(ans);


    }
}
