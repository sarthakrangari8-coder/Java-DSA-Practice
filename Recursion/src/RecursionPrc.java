public class RecursionPrc {
    public static int fun(int []a,int n){

        if (n==1){
            return a[0];
        }
        int last=a[n-1];
        int answer=fun(a,n-1);
        return Math.max(last,answer);
    }

    public static void main(String[] args) {
        int []a={5,3,2};
        int max=fun(a, a.length);
        System.out.println(max);


    }
}
