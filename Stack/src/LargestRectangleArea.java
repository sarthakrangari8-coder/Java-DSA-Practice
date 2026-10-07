import java.util.Stack;

class LargestRetangleArea {
    public int largestRectangleArea(int []heights){
        int n=heights.length;

        // create array to save PS and NS
        int []PS=new int[n];
        int []NS=new int[n];

        Stack<Integer>st=new Stack<>();

        //PS
        for (int i=0;i<n;i++){
            while (!st.isEmpty() && heights[st.peek()]>=heights[i]) st.pop();

            PS[i]=st.isEmpty() ? -1 :st.peek();

            st.push(i);
        }

        //clear the stack
        st.clear();


        //NS
        for (int i=n-1;i>=0;i--){
            while (!st.isEmpty() && heights[st.peek()]>=heights[i])st.pop();

            NS[i]=st.isEmpty() ? n :st.peek();

            st.push(i);
        }

        //calculate the area
        int maxArea=0;
        for(int i=0;i<n;i++){
            int width=NS[i]-PS[i]-1;

            int area=heights[i]*width;

            maxArea=Math.max(maxArea,area);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int [] heights={2,1,5,6,2,3};

        LargestRetangleArea obj=new LargestRetangleArea();

        int ans=obj.largestRectangleArea(heights);

        System.out.println(ans);
    }
}

