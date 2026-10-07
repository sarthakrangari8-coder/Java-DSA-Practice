import java.util.ArrayList;
import java.util.Stack;

class StockSpan {
    ArrayList<Integer>calculateSpan(int []arr){
        ArrayList<Integer>res=new ArrayList<>();
        Stack<Integer>st=new Stack<>();

        int n=arr.length;
        for (int i=0;i<n;i++){
            while (!st.isEmpty() && arr[st.peek()]<=arr[i])st.pop();

            if (st.isEmpty())res.add(i+1);
            else res.add(i-st.peek());

            st.push(i);
        }
        return res;

    }

    public static void main(String[] args) {
        int []arr={50,60,30,100,150,200,};

        StockSpan obj=new StockSpan();

        ArrayList<Integer>ans=obj.calculateSpan(arr);

        System.out.println("span days are : ");

        for (int num:ans){
            System.out.print(num+ " ");
        }
    }
}
