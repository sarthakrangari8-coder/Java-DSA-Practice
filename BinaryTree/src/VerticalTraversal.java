import java.util.*;

class VerticalTraversal {
    static class Pair{
        Node node;
        int vertical;
        int horizontal;

        Pair(Node node,int vertical,int horizontal){
            this.node=node;
            this.vertical=vertical;
            this.horizontal=horizontal;
        }
    }
    public List<List<Integer>>verticalTraversal(Node root){

        TreeMap<Integer,TreeMap<Integer, PriorityQueue<Integer>>>map=new TreeMap<>();

        Queue<Pair>q=new LinkedList<>();

        q.offer(new Pair(root,0,0));

        while (!q.isEmpty()){
            Pair curr=q.poll();

            Node node=curr.node;
            int vertical= curr.vertical;
            int horizontal=curr.horizontal;

            map.putIfAbsent(vertical,new TreeMap<>());
            map.get(vertical).putIfAbsent(horizontal,new PriorityQueue<Integer>());
            map.get(vertical).get(horizontal).offer(node.data);

            if(node.left!=null)q.offer(new Pair(node.left,vertical-1,horizontal+1));
            if(node.right!=null)q.offer(new Pair(node.right,vertical+1,horizontal+1));
        }
        List<List<Integer>>res=new ArrayList<>();

        for(TreeMap<Integer,PriorityQueue<Integer>>levels : map.values()){
            List<Integer>list=new ArrayList<>();
            for (PriorityQueue<Integer>pq : levels.values()){
                while (!pq.isEmpty())list.add(pq.poll());
            }
            res.add(list);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        binaryTree tree=new binaryTree();

        Node root=tree.buildTree(nodes);

        VerticalTraversal obj=new VerticalTraversal();

        List<List<Integer>>ans=obj.verticalTraversal(root);

        System.out.println(ans);
    }
}
