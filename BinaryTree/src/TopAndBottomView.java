import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

class TopAndBottomView {
    //making pairs
     static class Pair{
         Node node;
         int hd;

         Pair(Node node,int hd){
             this.node=node;
             this.hd=hd;
         }
    }
    public ArrayList<Integer>TopView(Node root){
         ArrayList<Integer>res=new ArrayList<>();

        Queue<Pair>q=new LinkedList<>();

        TreeMap<Integer,Integer>map=new TreeMap<>();

        q.offer(new Pair(root,0));

        while (!q.isEmpty()){
            Pair curr=q.poll();
            //using curr to exies node and hd(level);
            Node node =curr.node;
            int hd=curr.hd;
            //if hd is present in map we did not add hd
            if (!map.containsKey(hd)){
                map.put(hd,node.data);
            }
            if (node.left!=null)q.offer(new Pair(node.left,hd -1));
            if (node.right!=null)q.offer(new Pair(node.right,hd +1));
        }
        for (int val : map.values()) res.add(val);

        return res;
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        binaryTree tree=new binaryTree();

        Node root=tree.buildTree(nodes);

        TopAndBottomView obj=new TopAndBottomView();

        ArrayList<Integer>ans=obj.TopView(root);

        System.out.println(ans);

    }


}
