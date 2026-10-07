import com.sun.source.tree.IfTree;

import java.util.ArrayList;

public class CombinationSum {
    static void Combination(int []arr, int target, int i,ArrayList<Integer>current ){
        if (target==0){
            System.out.println(current);
            return;
        }
        if (i==arr.length || target<0){
            return;
        }
        //take
        current.add(arr[i]);
        Combination(arr,target-arr[i],i,current);
        //backtrack
        current.remove(current.size()-1);
        //skip
        Combination(arr,target,i+1,current);
    }

    public static void main(String[] args) {

        int []arr={2,3,5};
        int target=7;
        ArrayList<Integer>current=new ArrayList<>();
        Combination(arr,7,0,current);

    }
}
