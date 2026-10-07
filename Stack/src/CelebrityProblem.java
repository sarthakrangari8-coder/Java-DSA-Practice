import java.util.Stack;

class CelebrityProblem {
    public int celebrity(int [][] mat){
        int n= mat.length;
        Stack<Integer>st=new Stack<>();
        //push all element in stack
        for (int i=0;i<n;i++)st.push(i);
        //while the size of stack is greater than 1
        while (st.size()>1){

            int a=st.pop();
            int b=st.pop();

            if (mat[a][b]==1)st.push(b);
            else st.push(a);
        }
        int candidate=st.pop();
        //reverify
        for (int i=0;i<n;i++){
            if (i!=candidate){
                if (mat[candidate][i]==1 || mat[i][candidate]==0)return -1;
            }
        }
        return candidate;



    }

    public static void main(String[] args) {
        int [][]mat= {{1, 1, 0},
                      {0, 1, 0},
                      {1, 1, 1}

        };
        CelebrityProblem obj=new CelebrityProblem();

        int ans=obj.celebrity(mat);
        System.out.println(ans);
    }

}
