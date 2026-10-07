
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2{
    static void solve(int idx,int []arr,int target,List<List<Integer>>ans,List<Integer>list){
        //base case
        if (target==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i=idx;i<arr.length;i++){
            if (i>idx && arr[i]==arr[i-1]) continue;
            if (arr[i]>target)break;

            list.add(arr[i]);
            solve(i+1,arr,target-arr[i],ans,list);
            list.remove(list.size()-1);
        }
    }

    static List<List<Integer>>combinationSum(int []arr,int target) {
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(arr);
        solve(0,arr,target,ans,new ArrayList<>());
        return ans;
    }

    public static void main(String[] args) {
       int []arr={2,3,1,1,5};
       int target=8;
       List<List<Integer>>ans=combinationSum(arr,target);
        System.out.println(ans);
    }
}


