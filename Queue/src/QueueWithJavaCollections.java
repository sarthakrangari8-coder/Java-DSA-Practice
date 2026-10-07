import java.util.LinkedList;
import java.util.Queue;

public class QueueWithJavaCollections {
    public static void main(String[] args) {
        //Queue is always implement by LinkedList.
        Queue<Integer>q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(40);
        q.add(50);
        System.out.println(q);


       //same as add but don't show exception
        q.offer(30);
        q.offer(60);
        q.offer(80);
        System.out.println(q);

        System.out.println(q.remove());
        System.out.println(q);

        //same as remove  but don't show exception
        System.out.println(q.poll());
        System.out.println(q);

        //size
        System.out.println(q.size());
        
        //isEmpty
        System.out.println(q.isEmpty());

    }
}
