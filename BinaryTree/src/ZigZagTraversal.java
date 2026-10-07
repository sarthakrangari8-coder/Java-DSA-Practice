import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class ZigZagTraversal {
    public List<List<Integer>>zigZagTraversal(Node root){
        List<List<Integer>>res=new ArrayList<>();

        if(root==null)return res;

        Queue<Node>q=new LinkedList<>();

        q.offer(root);
        //make a variable leftToRight when we are in level 1 the value is true
        //when we are in 2 level we change that vale to false
        boolean leftToRight=true;

        while (!q.isEmpty()){
            int size=q.size();
            //make a list to save for add element of each and every level
            List<Integer>level=new ArrayList<>();
            for (int i=0;i<size;i++){
                Node node=q.poll();

                //if (leftToRight = true) is true we add node data;
              if (leftToRight)level.add(node.data);
              else level.add(0,node.data);


              if (node.left!=null)q.offer(node.left);
              if (node.right!=null)q.offer(node.right);
            }
            res.add(level);

            leftToRight=!leftToRight;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};

        binaryTree tree=new binaryTree();

        Node root=tree.buildTree(nodes);

        ZigZagTraversal obj=new ZigZagTraversal();

        List<List<Integer>>ans=obj.zigZagTraversal(root);

        System.out.println(ans);

    }
}
