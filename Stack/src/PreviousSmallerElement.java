import java.util.ArrayList;
import java.util.Stack;

class PreviousSmallerElement {
    public ArrayList<Integer>previousSmallerElement(int []arr){
        ArrayList<Integer>res=new ArrayList<>();
        int n=arr.length;

        for (int i=0;i<n;i++) res.add(-1);

        Stack<Integer>at=new Stack<>();

        for (int i=0;i<n;i++){
            while (!at.isEmpty() && at.peek()>=arr[i])at.pop();

            if (!at.isEmpty())res.set(i, at.peek());

            at.push(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int []arr={1,5,0,3,4,5};

        PreviousSmallerElement obj=new PreviousSmallerElement();

        ArrayList<Integer> ans=obj.previousSmallerElement(arr);

        System.out.println("original list : ");

        for(int num:arr){
            System.out.print(num+ " ");
        }

        System.out.println("Previous smaller elements : ");

        for (int num:ans){
            System.out.print(num+" ");
        }
    }

}
