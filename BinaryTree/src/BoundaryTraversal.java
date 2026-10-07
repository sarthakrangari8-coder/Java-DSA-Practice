import java.util.ArrayList;
import java.util.Stack;

class BoundaryTraversal {
    //check leaf
    boolean isLeaf(Node node ){
        return node.left==null && node.right==null;
    }
    //add left
    void  leftBoundary(Node node){
        while (node!=null){
            if(!isLeaf(node)){
                ans.add(node.data);
            }
            if (node.left!=null)node=node.left;
            else  node =node.right;
        }
    }
    //add leaf
    void addLeaves(Node node){
        if (node==null)return;

        if (isLeaf(node)){
            ans.add(node.data);
            return;
        }
        addLeaves(node.left);
        addLeaves(node.right);

    }
    //add right
    void rightboundary(Node node){
        Stack<Integer>st=new Stack<>();
        while (node!=null){
            if(!isLeaf(node))st.push(node.data);

            if (node.right!=null)node=node.right;
            else node = node.left;
        }
        while (!st.isEmpty())ans.add(st.pop());

    }
    ArrayList<Integer>ans=new ArrayList<>();
    ArrayList<Integer>boundaryTraversal(Node node){
        if(node==null) return ans;

        if(!isLeaf(node))ans.add(node.data);

        //functions
        leftBoundary(node.left);
        addLeaves(node);
        rightboundary(node.right);

        return ans;

    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        binaryTree tree=new binaryTree();

        Node root=tree.buildTree(nodes);

        BoundaryTraversal obj=new BoundaryTraversal();

        ArrayList<Integer>ans=obj.boundaryTraversal(root);

        System.out.println(ans);


    }
}
