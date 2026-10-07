import java.util.Scanner;

public class Question1 {
    static void LeftRight(int d, int n, String s) {
        if (d == n) {
            System.out.println(s);
            return;
        }
        LeftRight(d + 1, n, s + " left ");
        LeftRight(d + 1, n, s + " right ");
    }

    static void binary(int idx, int n, String s) {
        if (idx == n) {
            System.out.println(s);
            return;
        }
        binary(idx + 1, n, s + "0");
        binary(idx + 1, n, s + "1");
    }

    static void alpha(int a, int n, String s) {
        if (a == n) {
            System.out.println(s);
            return;
        }
        alpha(a + 1, n, s + "A");
        alpha(a + 1, n, s + "B");
    }

    static void subArray(int[] a, int i, String s) {
        if (i == a.length) {
            System.out.println(s);
            return;
        }
        subArray(a, i + 1, s + a[i]);
        subArray(a, i + 1, s);
    }
    static void ValidPere(String s,int open ,int close,int n){
        if (open==n && close==n){
            System.out.println(s);
            return;
        }
        if (open<n){
            ValidPere(s+"(",open+1,close,n);
        }
        if (close<open){
            ValidPere(s+")",open,close+1,n);
        }
    }


    public static void main(String[] args) {
        //LeftRight(0,2,"");
        //binary(0,3,"");
        //alpha(0,3,"");
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the size of  array: ");
//        int n= input.nextInt();
//        int []a=new int[n];
//        System.out.println("enter array elements : ");
//        for (int i=0;i<n;i++){
//            a[i]=input.nextInt();
//        }
//        subArray(a,0,"");
        //ValidPere("",0,0,4)

    }

}