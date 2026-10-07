public class RecursiionQA {
    static int  fun2(int n){
        if (n==0) return 0;
        if (n==1)return 1;

        int ans1=fun2(n-1);
        int ans2=fun2(n-2);
        return ans1+ans2;
    }

    public static void main(String[] args) {
        System.out.println(fun2(5));
    }
}
