import java.util.Stack;
public class StackWithJavaCollections {
    public static void main(String[] args) {
        Stack<Integer>at=new Stack<>();

        //push
        at.push(10);
        at.push(20);
        at.push(30);
        at.push(40);

        //print
        System.out.println(at);
        //remove element
        System.out.println(at.pop());
        System.out.println(at);

        System.out.println(at.size());

        System.out.println(at.empty());

        System.out.println(at.peek());

        for (int x :at){
            System.out.println(x+" ");

        }

    }


}
