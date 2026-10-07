import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Stack;

class NextGreaterElement {
    public ArrayList<Integer> nextGreaterElement(int [] nums){
        //to store answer
        ArrayList<Integer> res=new ArrayList<>();

        int n=nums.length;
        //put -1 int the res list
        for(int i=0;i<n;i++) res.add(-1);

        Stack<Integer>at=new Stack<>();
        //start loop for end of list
        for(int i=n-1;i>=0;i--){

            //while jab tak empty nhi hai and top peek element
            //less than hai array ke ith element se
            //or agar less than nhi hai to stack se pop out
            while (!at.isEmpty() &&  at.peek()<=nums[i]) at.pop();

            //if list is not empty and peek is grater than ith element
            //then put the peek in res array list
            if (!at.isEmpty()) res.set(i,at.peek());

             //add that ith element in stack also
            at.push(nums[i]);

        }
        return res;


    }

    public static void main(String[] args) {

        int[]nums={1,5,0,3,4,5};

        NextGreaterElement obj=new NextGreaterElement();

        ArrayList<Integer> ans=obj.nextGreaterElement(nums);

        System.out.println("original list : ");

        for (int num:nums){
            System.out.print(num+ " ");
        }

        System.out.println();

        System.out.println("Next greater elements : ");

        for (int num:ans){
            System.out.print(num+" ");
        }
    }




}
