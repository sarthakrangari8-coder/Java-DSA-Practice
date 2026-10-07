import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class LargestValueInTree {
    void largestValueInTree(Node root, List<Integer>res){
        if (root==null)return;

        Queue<Node>q=new LinkedList<>();

        q.offer(root);

        while (!q.isEmpty()){
            int size=q.size();
            int maxVal=Integer.MIN_VALUE;
            for (int i=0;i<size;i++){
                Node curr=q.poll();
                maxVal=Math.max(maxVal,curr.data);
                if (curr.left!=null)q.offer(curr.left);
                if (curr.right!=null)q.offer(curr.right);
            }
            res.add(maxVal);

        }
    }

    public static void main(String[] args) {
        int[] nodes = {1, 3, 2, 5, 3, -1,9,-1};

        binaryTree tree=new binaryTree();

        Node root=tree.buildTree(nodes);

        LargestValueInTree obj=new LargestValueInTree();

        List<Integer>res=new ArrayList<>();

        obj.largestValueInTree(root,res);

        System.out.println(res);

    }


}
