import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LeftAndRightView {
    ArrayList<Integer> leftView(Node root){
        ArrayList<Integer>res=new ArrayList<>();

        if(root==null)return res;

        Queue<Node>q=new LinkedList<>();

        q.offer(root);

        while(!q.isEmpty()){
            int size=q.size();

            Node temp=q.peek();

            res.add(temp.data);

            for(int i=0;i<size;i++){
                Node curr=q.poll();
                if (curr.left!=null)q.offer(curr.left);
                if (curr.right!=null)q.offer(curr.right);
            }
        }
        return res;

    }

    ArrayList<Integer> rightView(Node root){
        ArrayList<Integer>res=new ArrayList<>();

        if(root==null)return res;

        Queue<Node>q=new LinkedList<>();

        q.offer(root);

        while(!q.isEmpty()){
            int size=q.size();

            for(int i=0;i<size;i++){
                Node curr=q.poll();

                if(i==size-1)res.add(curr.data);
                if (curr.left!=null)q.offer(curr.left);
                if (curr.right!=null)q.offer(curr.right);
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        binaryTree tree=new binaryTree();

        Node root=tree.buildTree(nodes);

        LeftAndRightView obj=new LeftAndRightView();

        ArrayList<Integer>ans=obj.rightView(root);

        System.out.println(ans);




    }






}
